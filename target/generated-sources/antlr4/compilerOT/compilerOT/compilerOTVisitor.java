// Generated from compilerOT/compilerOT/compilerOT.g4 by ANTLR 4.5.1
package compilerOT.compilerOT;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;

	import AST.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compilerOTParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compilerOTVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(compilerOTParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(compilerOTParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(compilerOTParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#var_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_assign(compilerOTParser.Var_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(compilerOTParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(compilerOTParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(compilerOTParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(compilerOTParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(compilerOTParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compilerOTParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compilerOTParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compilerOTParser#forparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForparams(compilerOTParser.ForparamsContext ctx);
}