package cobmock.cobol.test;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.generator.CodeGenerator;
import cobmock.cobol.parser.CobmockParser;
import cobmock.config.CobmockConfigParser;
import cobmock.helper.FileReaderHelper;

public class CodeGeneratorTest {
	private CodeGenerator generator;
	
	@Before
	public void init() throws FileNotFoundException, IOException {
		CobmockParser cobolParser = new CobmockParser(new FileInputStream("test/files/cobol/codeGen1.cbl"));
		CobmockConfigParser configParser = new CobmockConfigParser(new FileInputStream("test/files/config/test1.cfg"));
		String outputTemplate = FileReaderHelper.fromStream(new FileInputStream("test/files/stringtemplate/move.st"));
		
		generator = new CodeGenerator();
		generator.setCobolParser(cobolParser);
		generator.setConfigParser(configParser);
		generator.setOutputTemplate(outputTemplate);
	}

	@Test
	public void test() throws Exception {
		System.out.println(generator.generate());
	}

}
