package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.Cobol4Lexer;
import cobmock.cobol.parser.Cobol4Parser;
import cobmock.cobol.parser.Cobol4Parser.CompilationUnitContext;

public class RewriterTest {
private CompilationUnitContext ctx;
private TokenStreamRewriter rewriter;
	@Before
	public void initCobolParser() throws IOException {
		InputStream is = new FileInputStream("test/files/cobol/mockIdTest.cbl");
		ANTLRInputStream input = new ANTLRInputStream(is);
		Cobol4Lexer lexer = new Cobol4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		rewriter = new TokenStreamRewriter(tokens);
		Cobol4Parser parser = new Cobol4Parser(tokens);
		ctx = parser.compilationUnit();
	}
	@Test
	public void test() {
		rewriter.replace(ctx.mockMeta(0).start, ctx.mockMeta(0).stop, "NEUER UP-CALL");
		System.out.println(rewriter.getText());
	}

}
