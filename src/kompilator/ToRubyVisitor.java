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

    // expr 
    @Override
    public Integer visitParExpr(PythonParser.ParExprContext ctx) {
    	System.out.print(ctx.getText());
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

    // print 
    @Override
    public Integer visitPrint(PythonParser.PrintContext ctx) {
        System.out.println("puts " + ctx.expr().getText());
        return 0;
    }

    // if 
    @Override
    public Integer visitIf_stat(PythonParser.If_statContext ctx) {
        List<PythonParser.Condition_blockContext> conditions =  ctx.condition_block();
        
        int inside_conditions = 0;
        System.out.print("if ");
        for(PythonParser.Condition_blockContext condition : conditions) {
        	List<PythonParser.Loop_stat_blockContext> loop_stat_blocks =  condition.loop_stat_block();
        	if (inside_conditions !=0){
            	System.out.print("elif ");
            }
        	
        	this.visit(condition.expr());
        	System.out.print("\n");
            for(PythonParser.Loop_stat_blockContext loop_stat_block : loop_stat_blocks){
            	System.out.print("\t");
            	this.visit(loop_stat_block);
            }
            inside_conditions += 1;
        }
        if(ctx.loop_stat_block() != null) {
        	List<PythonParser.Loop_stat_blockContext> loop_stat_blocks =  ctx.loop_stat_block();
        	System.out.print("else \n");
        	for(PythonParser.Loop_stat_blockContext loop_stat_block : loop_stat_blocks){
        		System.out.print("\t");
            	this.visit(loop_stat_block);
            }
        }
        System.out.println("end");
    	return 0;
    }

    // while 
    @Override
    public Integer visitWhile_stat(PythonParser.While_statContext ctx) {
    	List<PythonParser.Loop_stat_blockContext> loop_stat_blocks =  ctx.loop_stat_block();
    	System.out.print("while ");
    	this.visit(ctx.expr());
    	System.out.print(" do");
   		System.out.print("\n");
    	for(PythonParser.Loop_stat_blockContext loop_stat_block : loop_stat_blocks){
       		System.out.print("\t");
        	this.visit(loop_stat_block);
        }
       	System.out.println("end");
    	return 0;
    }
}