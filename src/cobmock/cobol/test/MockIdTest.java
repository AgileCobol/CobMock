package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.Cobol4Lexer;
import cobmock.cobol.parser.Cobol4Parser;
import cobmock.cobol.parser.Cobol4Parser.CompilationUnitContext;

public class MockIdTest {
	private CompilationUnitContext ctx;
	
	@Before
	public void initCobolParser() throws IOException {
		InputStream is = new FileInputStream("src/cobmock/cobol/test/files/mockIdTest.cbl");
		ANTLRInputStream input = new ANTLRInputStream(is);
		Cobol4Lexer lexer = new Cobol4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		Cobol4Parser parser = new Cobol4Parser(tokens);
		ctx = parser.compilationUnit();
	}
	
	@Test
	public void correctIdIsExtractedFromMockStatement() {
		assertEquals("\"ksbu501-call\"", ctx.mockMeta(0).mockIdentifier().STRING().toString());
	}

}
