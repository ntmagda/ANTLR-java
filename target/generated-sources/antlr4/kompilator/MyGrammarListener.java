// Generated from MyGrammar.g4 by ANTLR 4.4

	package kompilator;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(@NotNull MyGrammarParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(@NotNull MyGrammarParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(@NotNull MyGrammarParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(@NotNull MyGrammarParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(@NotNull MyGrammarParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(@NotNull MyGrammarParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(@NotNull MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(@NotNull MyGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(@NotNull MyGrammarParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(@NotNull MyGrammarParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(@NotNull MyGrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(@NotNull MyGrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(@NotNull MyGrammarParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(@NotNull MyGrammarParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(@NotNull MyGrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(@NotNull MyGrammarParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(@NotNull MyGrammarParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(@NotNull MyGrammarParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MyGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(@NotNull MyGrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(@NotNull MyGrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull MyGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull MyGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MyGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MyGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(@NotNull MyGrammarParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(@NotNull MyGrammarParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNilAtom(@NotNull MyGrammarParser.NilAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nilAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNilAtom(@NotNull MyGrammarParser.NilAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(@NotNull MyGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(@NotNull MyGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(@NotNull MyGrammarParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(@NotNull MyGrammarParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(@NotNull MyGrammarParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(@NotNull MyGrammarParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(@NotNull MyGrammarParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(@NotNull MyGrammarParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(@NotNull MyGrammarParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link MyGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(@NotNull MyGrammarParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(@NotNull MyGrammarParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(@NotNull MyGrammarParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(@NotNull MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(@NotNull MyGrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(@NotNull MyGrammarParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(@NotNull MyGrammarParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(@NotNull MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(@NotNull MyGrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(@NotNull MyGrammarParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MyGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(@NotNull MyGrammarParser.AndExprContext ctx);
}