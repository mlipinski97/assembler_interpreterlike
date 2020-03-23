// Generated from D:/WAT/java/lipinski_maciej_jfk_1/src/main/antlr4\jfkgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jfkgrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jfkgrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(jfkgrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(jfkgrammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(jfkgrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(jfkgrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(jfkgrammarParser.OperandContext ctx);
}