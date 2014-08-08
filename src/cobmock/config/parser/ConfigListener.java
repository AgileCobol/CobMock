// Generated from grammar/antlr/Config/Config.g by ANTLR 4.4
package cobmock.config.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConfigParser}.
 */
public interface ConfigListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConfigParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull ConfigParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull ConfigParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(@NotNull ConfigParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(@NotNull ConfigParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(@NotNull ConfigParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(@NotNull ConfigParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConfigParser#configRoot}.
	 * @param ctx the parse tree
	 */
	void enterConfigRoot(@NotNull ConfigParser.ConfigRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConfigParser#configRoot}.
	 * @param ctx the parse tree
	 */
	void exitConfigRoot(@NotNull ConfigParser.ConfigRootContext ctx);
}