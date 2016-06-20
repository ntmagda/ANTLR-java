// Generated from Python.g4 by ANTLR 4.4

	package kompilator;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull PythonParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull PythonParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull PythonParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull PythonParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull PythonParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull PythonParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull PythonParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull PythonParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull PythonParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull PythonParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(@NotNull PythonParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(@NotNull PythonParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull PythonParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull PythonParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull PythonParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull PythonParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull PythonParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull PythonParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull PythonParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull PythonParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PythonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PythonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#loop_stat_block}.
	 * @param ctx the parse tree
	 */
	void enterLoop_stat_block(@NotNull PythonParser.Loop_stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#loop_stat_block}.
	 * @param ctx the parse tree
	 */
	void exitLoop_stat_block(@NotNull PythonParser.Loop_stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull PythonParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull PythonParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull PythonParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull PythonParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull PythonParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull PythonParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull PythonParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull PythonParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull PythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull PythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull PythonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull PythonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull PythonParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull PythonParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull PythonParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull PythonParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull PythonParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull PythonParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull PythonParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull PythonParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull PythonParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull PythonParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull PythonParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link PythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull PythonParser.AndExprContext ctx);
}