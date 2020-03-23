// Generated from jfkgrammar.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link jfkgrammarParser#full_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_line(jfkgrammarParser.Full_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#command_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_push(jfkgrammarParser.Command_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#command_int0x80}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_int0x80(jfkgrammarParser.Command_int0x80Context ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#command_xor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_xor(jfkgrammarParser.Command_xorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#command_mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand_mov(jfkgrammarParser.Command_movContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#sipmle_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSipmle_operation(jfkgrammarParser.Sipmle_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(jfkgrammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(jfkgrammarParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link jfkgrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(jfkgrammarParser.TermContext ctx);
}