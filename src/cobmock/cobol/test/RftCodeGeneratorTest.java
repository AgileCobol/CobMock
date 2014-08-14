package cobmock.cobol.test;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.rft.RftCodeGenerator;

public class RftCodeGeneratorTest {
	private RftCodeGenerator generator;
	@Before
	public void init() throws FileNotFoundException, UnsupportedEncodingException {
		FileInputStream cobolFile = new FileInputStream("test/files/cobol/codeGen2.cbl");
		FileInputStream configFile = new FileInputStream("test/files/config/test2.cfg");
//		FileInputStream template = new FileInputStream("test/files/stringtemplate/move.st");
		FileInputStream template = new FileInputStream("test/files/stringtemplate/userMove.st");
		BufferedWriter outputStream = new BufferedWriter(new OutputStreamWriter(
								new FileOutputStream("test/files/cobol/result2.cbl"), "utf-8"));
		generator = new RftCodeGenerator(cobolFile, configFile, template, outputStream); 
	}

	@Test
	public void generateWithoutException() throws Exception {
		generator.generate();
	}

}
