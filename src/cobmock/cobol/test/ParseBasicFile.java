package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.Cobol4Lexer;
import cobmock.cobol.parser.Cobol4Parser;
import cobmock.cobol.parser.Cobol4Parser.CompilationUnitContext;

public class ParseBasicFile {
	private Cobol4Parser parser;
	
	@Before
	public void initCobolParser() throws IOException {
		InputStream is = new FileInputStream("src/cobmock/cobol/test/files/test.cbl");
		ANTLRInputStream input = new ANTLRInputStream(is);
		Cobol4Lexer lexer = new Cobol4Lexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		parser = new Cobol4Parser(tokens);
		System.out.println(parser.compilationUnit().toStringTree());
	}
	
	@Test(expected=FileNotFoundException.class)
	public void throwExceptionWhenFileDoesntExist() throws FileNotFoundException {
		InputStream is = new FileInputStream("someFileThatDoesNotExist.cbl");
	}
	
	@Test
	public void generateParserWithoutException() throws IOException {
		assertNull(parser.compilationUnit().exception);
	}
	
	@Test
	public void extractCorrectNumberOfMockStatements() {
		CompilationUnitContext ctx = parser.compilationUnit();
		System.out.println(ctx.cobolToken(1));
	}
	


}
