// Generated from grammar/antlr/MockCobol.g by ANTLR 4.4
package cobmock.cobol.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MockCobolParser}.
 */
public interface MockCobolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#addressOfClause}.
	 * @param ctx the parse tree
	 */
	void enterAddressOfClause(@NotNull MockCobolParser.AddressOfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#addressOfClause}.
	 * @param ctx the parse tree
	 */
	void exitAddressOfClause(@NotNull MockCobolParser.AddressOfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#dataQualifier}.
	 * @param ctx the parse tree
	 */
	void enterDataQualifier(@NotNull MockCobolParser.DataQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#dataQualifier}.
	 * @param ctx the parse tree
	 */
	void exitDataQualifier(@NotNull MockCobolParser.DataQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#mockMeta}.
	 * @param ctx the parse tree
	 */
	void enterMockMeta(@NotNull MockCobolParser.MockMetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#mockMeta}.
	 * @param ctx the parse tree
	 */
	void exitMockMeta(@NotNull MockCobolParser.MockMetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#lengthOfClause}.
	 * @param ctx the parse tree
	 */
	void enterLengthOfClause(@NotNull MockCobolParser.LengthOfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#lengthOfClause}.
	 * @param ctx the parse tree
	 */
	void exitLengthOfClause(@NotNull MockCobolParser.LengthOfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(@NotNull MockCobolParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(@NotNull MockCobolParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDataIdentifier(@NotNull MockCobolParser.DataIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDataIdentifier(@NotNull MockCobolParser.DataIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#mockIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMockIdentifier(@NotNull MockCobolParser.MockIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#mockIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMockIdentifier(@NotNull MockCobolParser.MockIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull MockCobolParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull MockCobolParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#cobolToken}.
	 * @param ctx the parse tree
	 */
	void enterCobolToken(@NotNull MockCobolParser.CobolTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#cobolToken}.
	 * @param ctx the parse tree
	 */
	void exitCobolToken(@NotNull MockCobolParser.CobolTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(@NotNull MockCobolParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(@NotNull MockCobolParser.UsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MockCobolParser#dataName}.
	 * @param ctx the parse tree
	 */
	void enterDataName(@NotNull MockCobolParser.DataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MockCobolParser#dataName}.
	 * @param ctx the parse tree
	 */
	void exitDataName(@NotNull MockCobolParser.DataNameContext ctx);
}