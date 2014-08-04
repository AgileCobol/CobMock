package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.Cobol4Lexer;
import cobmock.cobol.parser.Cobol4Parser;

public class ParseBasicFile {

	
	@Test(expected=FileNotFoundException.class)
	public void throwExceptionWhenFileDoesntExist() throws FileNotFoundException {
		InputStream is = new FileInputStream("someFileThatDoesNotExist.cbl");
	}

}
