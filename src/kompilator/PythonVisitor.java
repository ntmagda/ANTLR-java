// Generated from Python.g4 by ANTLR 4.5.3

	package kompilator;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(PythonParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(PythonParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PythonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(PythonParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(PythonParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#loop_stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_stat_block(PythonParser.Loop_stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(PythonParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(PythonParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PythonParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PythonParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(PythonParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(PythonParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(PythonParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(PythonParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(PythonParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(PythonParser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(PythonParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(PythonParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(PythonParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(PythonParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtom(PythonParser.BooleanAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(PythonParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilAtom(PythonParser.NilAtomContext ctx);
}