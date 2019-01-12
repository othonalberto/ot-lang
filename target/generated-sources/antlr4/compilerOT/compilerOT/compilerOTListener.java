// Generated from compilerOT.g4 by ANTLR 4.4
package compilerOT.compilerOT;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;

	import AST.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compilerOTParser}.
 */
public interface compilerOTListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(@NotNull compilerOTParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(@NotNull compilerOTParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(@NotNull compilerOTParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(@NotNull compilerOTParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull compilerOTParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull compilerOTParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull compilerOTParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull compilerOTParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(@NotNull compilerOTParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(@NotNull compilerOTParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull compilerOTParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull compilerOTParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#forparams}.
	 * @param ctx the parse tree
	 */
	void enterForparams(@NotNull compilerOTParser.ForparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#forparams}.
	 * @param ctx the parse tree
	 */
	void exitForparams(@NotNull compilerOTParser.ForparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void enterVar_assign(@NotNull compilerOTParser.Var_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#var_assign}.
	 * @param ctx the parse tree
	 */
	void exitVar_assign(@NotNull compilerOTParser.Var_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull compilerOTParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull compilerOTParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull compilerOTParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull compilerOTParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull compilerOTParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull compilerOTParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link compilerOTParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(@NotNull compilerOTParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compilerOTParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(@NotNull compilerOTParser.FactorContext ctx);
}