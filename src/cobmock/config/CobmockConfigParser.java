package cobmock.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import cobmock.cobol.parser.MockCobolParser;
import cobmock.config.parser.CobmockConfigVisitor;
import cobmock.config.parser.ConfigLexer;
import cobmock.config.parser.ConfigParser;
import cobmock.config.parser.ConfigParser.ConfigRootContext;

public class CobmockConfigParser {
	private ConfigRootContext ctx;
	public CobmockConfigParser(String input) {
		createParser(new ANTLRInputStream(input));
	}
	public Hashtable<String, List<Assignment>> parse() {
		CobmockConfigVisitor visitor = new CobmockConfigVisitor();
		return visitor.visit(ctx);
	}
	
	private void createParser(ANTLRInputStream antlrInputStream) {
		ConfigLexer lexer = new ConfigLexer(antlrInputStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		ConfigParser parser = new ConfigParser(tokens);	
		ctx = parser.configRoot();
	}



}
