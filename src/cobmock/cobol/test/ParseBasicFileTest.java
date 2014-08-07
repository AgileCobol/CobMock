package cobmock.cobol.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.Cobol4Lexer;
import cobmock.cobol.parser.Cobol4Parser;
import cobmock.cobol.parser.Cobol4Parser.CompilationUnitContext;
import cobmock.cobol.parser.Cobol4Parser.MockMetaContext;
import cobmock.cobol.parser.Cobol4Parser.UsingClauseContext;

public class ParseBasicFileTest {
	private CompilationUnitContext ctx;
	
	@Before
	public void initCobolParser() throws IOException {
		InputStream is = new FileInputStream("test/files/cobol/test.cbl");
		ANTLRInputStream input = new ANTLRInputStream(is);
		Cobol4Lexer lexer = new Cobol4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		Cobol4Parser parser = new Cobol4Parser(tokens);
		ctx = parser.compilationUnit();
	}
	
	@Test(expected=FileNotFoundException.class)
	public void throwExceptionWhenFileDoesntExist() throws FileNotFoundException {
		InputStream is = new FileInputStream("someFileThatDoesNotExist.cbl");
	}
	
	@Test
	public void generateParserWithoutException() throws IOException {
		assertNull(ctx.exception);
	}
	
	@Test
	public void extractCorrectNumberOfMockStatements() {
		assertEquals(2, ctx.mockMeta().size());
	}
	@Test
	public void extractDynamicCallTarget() {
		MockMetaContext mockCtx = ctx.mockMeta(0);
		assertEquals("KSBUTTT", mockCtx.callStatement().TEXT().toString());
	}
	@Test
	public void extractStaticCallTarget() {
		MockMetaContext mockCtx = ctx.mockMeta(1);
		assertEquals("\"KSBU510\"", mockCtx.callStatement().STRING().toString());
	}
	@Test 
	public void extractUsingClauseWithOneDataItem() {
		MockMetaContext mockCtx = ctx.mockMeta(1);
		UsingClauseContext usingCtx = mockCtx.callStatement().usingClause();
		assertEquals("KKTW001", usingCtx.dataIdentifier(0).getText());
		assertEquals(1, usingCtx.dataIdentifier().size());
	}
	@Test
	public void extractDataItemIdentifiersFromUsingClauseWithMultipleData() {
		MockMetaContext mockCtx = ctx.mockMeta(0);
		UsingClauseContext usingCtx = mockCtx.callStatement().usingClause();
		assertEquals(4, usingCtx.dataIdentifier().size());
		assertEquals("TESTA", usingCtx.dataIdentifier(0).dataName().TEXT().toString());
		assertEquals("TESTB", usingCtx.dataIdentifier(1).dataName().TEXT().toString());
		assertEquals("TESTC", usingCtx.dataIdentifier(2).dataName().TEXT().toString());
		assertEquals("TEST5", usingCtx.dataIdentifier(3).dataName().TEXT().toString());		
	}
	@Test
	public void extractAddressOfClauseFromDataIdentifiers() {
		MockMetaContext mockCtx = ctx.mockMeta(0);
		UsingClauseContext usingCtx = mockCtx.callStatement().usingClause();
		assertEquals("addressof", usingCtx.dataIdentifier(1).addressOfClause().getText().toLowerCase());
		assertEquals(null, usingCtx.dataIdentifier(0).addressOfClause());
		assertEquals(null, usingCtx.dataIdentifier(2).addressOfClause());
		assertEquals(null, usingCtx.dataIdentifier(3).addressOfClause());
	}
	@Test
	public void extractLengthOfClauseFromDataIdentifiers() {
		MockMetaContext mockCtx = ctx.mockMeta(0);
		UsingClauseContext usingCtx = mockCtx.callStatement().usingClause();
		assertEquals("lengthof", usingCtx.dataIdentifier(2).lengthOfClause().getText().toLowerCase());
	}


}
