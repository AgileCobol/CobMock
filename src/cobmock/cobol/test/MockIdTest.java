package cobmock.cobol.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.MockCobolParser;
import cobmock.cobol.parser.MockCobolParser.CompilationUnitContext;
import cobmock.helper.ParserTool;

public class MockIdTest {
	private CompilationUnitContext ctx;
	
	@Before
	public void initCobolParser() throws IOException {
		MockCobolParser parser = ParserTool.getMockCobolParserForFile("test/files/cobol/mockIdTest.cbl");
		ctx = parser.compilationUnit();
	}
	
	@Test
	public void extractIdFromMockStatement() {
		assertEquals("\"ksbu501-call\"", ctx.mockMeta(0).mockIdentifier().STRING().toString());
	}

}
