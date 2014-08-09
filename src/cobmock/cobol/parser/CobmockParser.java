package cobmock.cobol.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import cobmock.cobol.MockStatement;

public class CobmockParser {
	private MockCobolParser parser;
	private TokenStreamRewriter rewriter;
	
	public CobmockParser(InputStream input) throws IOException {
		ANTLRInputStream antlrInputStream = new ANTLRInputStream(input);
		MockCobolLexer lexer = new MockCobolLexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		rewriter = new TokenStreamRewriter(tokens);
		parser = new MockCobolParser(tokens);		
	}
	
	public List<MockStatement> parse() {
		CobmockVisitor visitor = new CobmockVisitor();
		return visitor.visit(parser.compilationUnit());
	}
	public TokenStreamRewriter getTokenStreamRewriter() {
		return rewriter;
	}
}
