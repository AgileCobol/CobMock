// Generated from grammar/antlr/Config/Config.g by ANTLR 4.4
package cobmock.config.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConfigParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConfigVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConfigParser#mockCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMockCall(@NotNull ConfigParser.MockCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull ConfigParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(@NotNull ConfigParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(@NotNull ConfigParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#callId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallId(@NotNull ConfigParser.CallIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConfigParser#configRoot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigRoot(@NotNull ConfigParser.ConfigRootContext ctx);
}