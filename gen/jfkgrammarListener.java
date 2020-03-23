// Generated from D:/WAT/java/lipinski_maciej_jfk_1/src/main/antlr4\jfkgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jfkgrammarParser}.
 */
public interface jfkgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(jfkgrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(jfkgrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(jfkgrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(jfkgrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(jfkgrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(jfkgrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(jfkgrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(jfkgrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(jfkgrammarParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(jfkgrammarParser.OperandContext ctx);
}