// Generated from grammar/antlr/Cobol4.g by ANTLR 4.4
package cobmock.cobol.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Cobol4Parser}.
 */
public interface Cobol4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#lengthOfClause}.
	 * @param ctx the parse tree
	 */
	void enterLengthOfClause(@NotNull Cobol4Parser.LengthOfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#lengthOfClause}.
	 * @param ctx the parse tree
	 */
	void exitLengthOfClause(@NotNull Cobol4Parser.LengthOfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull Cobol4Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull Cobol4Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#mockMeta}.
	 * @param ctx the parse tree
	 */
	void enterMockMeta(@NotNull Cobol4Parser.MockMetaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#mockMeta}.
	 * @param ctx the parse tree
	 */
	void exitMockMeta(@NotNull Cobol4Parser.MockMetaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#addressOfClause}.
	 * @param ctx the parse tree
	 */
	void enterAddressOfClause(@NotNull Cobol4Parser.AddressOfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#addressOfClause}.
	 * @param ctx the parse tree
	 */
	void exitAddressOfClause(@NotNull Cobol4Parser.AddressOfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(@NotNull Cobol4Parser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(@NotNull Cobol4Parser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDataIdentifier(@NotNull Cobol4Parser.DataIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#dataIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDataIdentifier(@NotNull Cobol4Parser.DataIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#dataName}.
	 * @param ctx the parse tree
	 */
	void enterDataName(@NotNull Cobol4Parser.DataNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#dataName}.
	 * @param ctx the parse tree
	 */
	void exitDataName(@NotNull Cobol4Parser.DataNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#cobolToken}.
	 * @param ctx the parse tree
	 */
	void enterCobolToken(@NotNull Cobol4Parser.CobolTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#cobolToken}.
	 * @param ctx the parse tree
	 */
	void exitCobolToken(@NotNull Cobol4Parser.CobolTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link Cobol4Parser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(@NotNull Cobol4Parser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Cobol4Parser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(@NotNull Cobol4Parser.UsingClauseContext ctx);
}