package kompilator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToRubyVisitor extends PythonBaseVisitor<Integer> {

  
   @Override
    public Integer visitAssignment(PythonParser.AssignmentContext ctx) {
	   System.out.println(ctx.getText());
	   return 0;
	}

    @Override
    public Integer visitIdAtom(PythonParser.IdAtomContext ctx) {
        return 0;
    }

    // atom overrides
    @Override
    public Integer visitStringAtom(PythonParser.StringAtomContext ctx) {
        return 0;
    }

    @Override
    public Integer visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        return 0;
    }

    @Override
    public Integer visitBooleanAtom(PythonParser.BooleanAtomContext ctx) {
        return 0;
    }

    @Override
    public Integer visitNilAtom(PythonParser.NilAtomContext ctx) {
    	return 0;
    }

    // expr overrides
    @Override
    public Integer visitParExpr(PythonParser.ParExprContext ctx) {
    	System.out.println(ctx.getText());
    	return 0;
    }

    @Override
    public Integer visitPowExpr(PythonParser.PowExprContext ctx) {
        System.out.print(ctx.getText());
        return 0;
    }

    @Override
    public Integer visitMinusExpr(PythonParser.MinusExprContext ctx) {
    	System.out.print(ctx.expr().getText());
        return 0;
    }

    @Override
    public Integer visitNotExpr(PythonParser.NotExprContext ctx) {
    	System.out.print(ctx.expr().getText());
    	return 0;
    }

    @Override
    public Integer visitMultiplicationExpr(PythonParser.MultiplicationExprContext ctx) {
    	System.out.print(ctx.getText());
    	return 0;
    }

    @Override
    public Integer visitAdditiveExpr( PythonParser.AdditiveExprContext ctx) {
    	System.out.print(ctx.getText());
    	return 0;
    }

    @Override
    public Integer visitRelationalExpr( PythonParser.RelationalExprContext ctx) {
    	System.out.print(ctx.getText());
        return 0;
    }

    @Override
    public Integer visitEqualityExpr(PythonParser.EqualityExprContext ctx) {
    	System.out.print(ctx.getText());
    	return 0;
    }

    @Override
    public Integer visitAndExpr(PythonParser.AndExprContext ctx) {
    	System.out.print(ctx.getText());
    	return 0;
    }

    @Override
    public Integer visitOrExpr(PythonParser.OrExprContext ctx) {
    	System.out.print(ctx.getText());
    	return 0;
    }

    // print override
    @Override
    public Integer visitPrint(PythonParser.PrintContext ctx) {
        System.out.println("puts " + ctx.expr().getText());
        return 0;
    }

    // if override
    @Override
    public Integer visitIf_stat(PythonParser.If_statContext ctx) {
        List<PythonParser.Condition_blockContext> conditions =  ctx.condition_block();
        
        int inside_conditions = 0;
        System.out.print("if ");
        for(PythonParser.Condition_blockContext condition : conditions) {
        	if (inside_conditions !=0){
            	System.out.print("elif ");
            }
        	
        	this.visit(condition.expr());
        	System.out.print("\n");
            System.out.print("\t");
            this.visit(condition.loop_stat_block());
            inside_conditions += 1;
        }
        if(ctx.loop_stat_block() != null) {
            System.out.print("else \n\t");
            this.visit(ctx.loop_stat_block(0));
        }
        System.out.println("end");
    	return 0;
    }

    // while override
    @Override
    public Integer visitWhile_stat(PythonParser.While_statContext ctx) {
    	System.out.print("while ");
    	this.visit(ctx.expr());
    	System.out.println(" do");
    	System.out.print("\n");
    	System.out.print("\t");
    	this.visit(ctx.stat_block());
    	System.out.println("end");
    	return 0;
    }
}