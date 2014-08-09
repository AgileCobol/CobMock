// Generated from grammar/antlr/Cobol/MockCobol.g by ANTLR 4.4
package cobmock.cobol.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MockCobolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MockCobolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#addressOfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddressOfClause(@NotNull MockCobolParser.AddressOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#dataQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataQualifier(@NotNull MockCobolParser.DataQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#mockMeta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMockMeta(@NotNull MockCobolParser.MockMetaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#lengthOfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOfClause(@NotNull MockCobolParser.LengthOfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(@NotNull MockCobolParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#dataIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataIdentifier(@NotNull MockCobolParser.DataIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#mockIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMockIdentifier(@NotNull MockCobolParser.MockIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull MockCobolParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#cobolToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCobolToken(@NotNull MockCobolParser.CobolTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(@NotNull MockCobolParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MockCobolParser#dataName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataName(@NotNull MockCobolParser.DataNameContext ctx);
}