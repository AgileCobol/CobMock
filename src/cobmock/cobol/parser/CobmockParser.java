package cobmock.cobol.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import cobmock.cobol.MockStatement;
import cobmock.cobol.TokenStreamRewriterHandler;

public class CobmockParser {
	private MockCobolParser parser;
	private TokenStreamRewriter rewriter;
	
	public CobmockParser(String input) throws IOException {
		generateParser(new ANTLRInputStream(input));		
	}

	private void generateParser(ANTLRInputStream antlrInputStream) {
		MockCobolLexer lexer = new MockCobolLexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		rewriter = new TokenStreamRewriter(tokens);
		parser = new MockCobolParser(tokens);
	}
	
	public List<MockStatement> parse() {
		CobmockVisitor visitor = new CobmockVisitor();
		return visitor.visit(parser.compilationUnit());
	}
	public TokenStreamRewriterHandler getTokenStreamRewriterHandler() {
		return new TokenStreamRewriterHandler(rewriter);
	}
	public String getCallStatementText(MockStatement statement) {
		System.out.println(parser.getTokenStream().getText(statement.getStartToken(), statement.getStopToken()));
		return null;
	}
}
