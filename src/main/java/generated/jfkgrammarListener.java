// Generated from D:/WAT/java/lipinski_maciej_jfk_1/src/main/antlr4\jfkgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jfkgrammarParser}.
 */
public interface jfkgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#full_line}.
	 * @param ctx the parse tree
	 */
	void enterFull_line(jfkgrammarParser.Full_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#full_line}.
	 * @param ctx the parse tree
	 */
	void exitFull_line(jfkgrammarParser.Full_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#command_push}.
	 * @param ctx the parse tree
	 */
	void enterCommand_push(jfkgrammarParser.Command_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#command_push}.
	 * @param ctx the parse tree
	 */
	void exitCommand_push(jfkgrammarParser.Command_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#command_int0x80}.
	 * @param ctx the parse tree
	 */
	void enterCommand_int0x80(jfkgrammarParser.Command_int0x80Context ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#command_int0x80}.
	 * @param ctx the parse tree
	 */
	void exitCommand_int0x80(jfkgrammarParser.Command_int0x80Context ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#command_xor}.
	 * @param ctx the parse tree
	 */
	void enterCommand_xor(jfkgrammarParser.Command_xorContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#command_xor}.
	 * @param ctx the parse tree
	 */
	void exitCommand_xor(jfkgrammarParser.Command_xorContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#command_mov}.
	 * @param ctx the parse tree
	 */
	void enterCommand_mov(jfkgrammarParser.Command_movContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#command_mov}.
	 * @param ctx the parse tree
	 */
	void exitCommand_mov(jfkgrammarParser.Command_movContext ctx);
	/**
	 * Enter a parse tree produced by {@link jfkgrammarParser#sipmle_operation}.
	 * @param ctx the parse tree
	 */
	void enterSipmle_operation(jfkgrammarParser.Sipmle_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#sipmle_operation}.
	 * @param ctx the parse tree
	 */
	void exitSipmle_operation(jfkgrammarParser.Sipmle_operationContext ctx);
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
	 * Enter a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(jfkgrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(jfkgrammarParser.TermContext ctx);
}