package cobmock.cobol.test;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.rft.RftCodeGenerator;

public class RftCodeGeneratorTest {
	private RftCodeGenerator generator;
	@Before
	public void init() throws FileNotFoundException {
		FileInputStream cobolFile = new FileInputStream("test/files/cobol/codeGen2.cbl");
		FileInputStream configFile = new FileInputStream("test/files/config/test1.cfg");
		FileInputStream template = new FileInputStream("test/files/stringtemplate/move.st");
		generator = new RftCodeGenerator(cobolFile, configFile, template); 
	}

	@Test
	public void generateWithoutException() throws Exception {
		generator.generate();
	}

}
