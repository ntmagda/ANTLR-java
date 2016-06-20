package kompilator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecVisitor extends PythonBaseVisitor<Value> {

    // used to compare floating point numbers
    public static final double SMALL_VALUE = 0.00000000001;

    // store variables (there's only one global scope!)
    private Map<String, Value> memory = new HashMap<String, Value>();

    // assignment/id overrides
    @Override
    public Value visitAssignment(PythonParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        Value value = this.visit(ctx.expr());
        return memory.put(id, value);
    }

    @Override
    public Value visitIdAtom(PythonParser.IdAtomContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);
        if(value == null) {
            throw new RuntimeException("no such variable: " + id);
        }
        return value;
    }

    // atom overrides
    @Override
    public Value visitStringAtom(PythonParser.StringAtomContext ctx) {
        String str = ctx.getText();
        // strip quotes
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    @Override
    public Value visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        return new Value(Double.valueOf(ctx.getText()));
    }

    @Override
    public Value visitBooleanAtom(PythonParser.BooleanAtomContext ctx) {
        return new Value(Boolean.valueOf(ctx.getText()));
    }

    @Override
    public Value visitNilAtom(PythonParser.NilAtomContext ctx) {
        return new Value(null);
    }

    // expr overrides
    @Override
    public Value visitParExpr(PythonParser.ParExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public Value visitPowExpr(PythonParser.PowExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(Math.pow(left.asDouble(), right.asDouble()));
    }

    @Override
    public Value visitMinusExpr(PythonParser.MinusExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(-value.asDouble());
    }

    @Override
    public Value visitNotExpr(PythonParser.NotExprContext ctx) {
        Value value = this.visit(ctx.expr());
        return new Value(!value.asBoolean());
    }

    @Override
    public Value visitMultiplicationExpr( PythonParser.MultiplicationExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PythonParser.MULT:
                return new Value(left.asDouble() * right.asDouble());
            case PythonParser.DIV:
                return new Value(left.asDouble() / right.asDouble());
            case PythonParser.MOD:
                return new Value(left.asDouble() % right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + PythonParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAdditiveExpr( PythonParser.AdditiveExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PythonParser.PLUS:
                return left.isDouble() && right.isDouble() ?
                        new Value(left.asDouble() + right.asDouble()) :
                        new Value(left.asString() + right.asString());
            case PythonParser.MINUS:
                return new Value(left.asDouble() - right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + PythonParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitRelationalExpr( PythonParser.RelationalExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PythonParser.LT:
                return new Value(left.asDouble() < right.asDouble());
            case PythonParser.LTEQ:
                return new Value(left.asDouble() <= right.asDouble());
            case PythonParser.GT:
                return new Value(left.asDouble() > right.asDouble());
            case PythonParser.GTEQ:
                return new Value(left.asDouble() >= right.asDouble());
            default:
                throw new RuntimeException("unknown operator: " + PythonParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitEqualityExpr( PythonParser.EqualityExprContext ctx) {

        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));

        switch (ctx.op.getType()) {
            case PythonParser.EQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE) :
                        new Value(left.equals(right));
            case PythonParser.NEQ:
                return left.isDouble() && right.isDouble() ?
                        new Value(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE) :
                        new Value(!left.equals(right));
            default:
                throw new RuntimeException("unknown operator: " + PythonParser.tokenNames[ctx.op.getType()]);
        }
    }

    @Override
    public Value visitAndExpr(PythonParser.AndExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() && right.asBoolean());
    }

    @Override
    public Value visitOrExpr(PythonParser.OrExprContext ctx) {
        Value left = this.visit(ctx.expr(0));
        Value right = this.visit(ctx.expr(1));
        return new Value(left.asBoolean() || right.asBoolean());
    }

    // print override
    @Override
    public Value visitPrint(PythonParser.PrintContext ctx) {
        Value value = this.visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    // if override
    @Override
    public Value visitIf_stat(PythonParser.If_statContext ctx) {

        List<PythonParser.Condition_blockContext> conditions =  ctx.condition_block();

        boolean evaluatedBlock = false;

        for(PythonParser.Condition_blockContext condition : conditions) {

            Value evaluated = this.visit(condition.expr());

            if(evaluated.asBoolean()) {
                evaluatedBlock = true;
                // evaluate this block whose expr==true
                this.visit(condition.loop_stat_block());
                break;
            }
        }

        if(!evaluatedBlock && ctx.loop_stat_block() != null) {
            // evaluate the else-stat_block (if present == not null)        	
            this.visit(ctx.loop_stat_block(0));
        }

        return Value.VOID;
    }

    // while override
    @Override
    public Value visitWhile_stat(PythonParser.While_statContext ctx) {

        Value value = this.visit(ctx.expr());

        while(value.asBoolean()) {

            // evaluate the code block
            this.visit(ctx.stat_block());

            // evaluate the expression
            value = this.visit(ctx.expr());
        }

        return Value.VOID;
    }
}