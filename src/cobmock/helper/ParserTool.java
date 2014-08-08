package cobmock.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import cobmock.cobol.parser.MockCobolLexer;
import cobmock.cobol.parser.MockCobolParser;
import cobmock.config.parser.*;

public class ParserTool {
	public static MockCobolParser getMockCobolParserForFile(String filename) throws IOException {
		InputStream is = new FileInputStream(filename);
		ANTLRInputStream input = new ANTLRInputStream(is);
		MockCobolLexer lexer = new MockCobolLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		return new MockCobolParser(tokens);
	}
	public static ConfigParser getConfigParserForFile(String filename) throws IOException {
		InputStream is = new FileInputStream(filename);
		ANTLRInputStream input = new ANTLRInputStream(is);
		ConfigLexer lexer = new ConfigLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		return new ConfigParser(tokens);
	}
}
