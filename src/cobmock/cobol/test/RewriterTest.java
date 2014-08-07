package cobmock.cobol.test;

import java.io.IOException;

import org.antlr.v4.runtime.TokenStreamRewriter;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.MockCobolParser;
import cobmock.cobol.parser.MockCobolParser.CompilationUnitContext;
import cobmock.helper.ParserTool;

public class RewriterTest {
private CompilationUnitContext ctx;
private TokenStreamRewriter rewriter;
	@Before
	public void initCobolParser() throws IOException {	
		MockCobolParser parser = ParserTool.getMockCobolParserForFile("test/files/cobol/mockIdTest.cbl");
		ctx = parser.compilationUnit();
	}
	@Test
	public void test() {
		rewriter.replace(ctx.mockMeta(0).start, ctx.mockMeta(0).stop, "NEUER UP-CALL");
		System.out.println(rewriter.getText());
	}

}
