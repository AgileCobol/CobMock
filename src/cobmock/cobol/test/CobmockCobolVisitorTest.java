package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.MockStatement;
import cobmock.cobol.parser.CobmockVisitor;
import cobmock.cobol.parser.MockCobolParser;
import cobmock.config.parser.CobmockConfigVisitor;
import cobmock.config.parser.ConfigParser;
import cobmock.helper.ParserTool;

public class CobmockCobolVisitorTest {
	private List<MockStatement> result;
	
	@Before
	public void initCobolParser() throws IOException {
		MockCobolParser parser = ParserTool.getMockCobolParserForFile("test/files/cobol/VisitorTest.cbl");		
		CobmockVisitor visitor = new CobmockVisitor();
		result = visitor.visit(parser.compilationUnit());
	}
	
	@Test
	public void checkResultIsNotNull() {
		assertNotNull(result);
	}
	
	@Test
	public void checkNumberOfMockStatements() {
		assertEquals(2, result.size());
	}
	
	@Test
	public void checkCallIds() {
		assertEquals("testupcall", result.get(0).getCallId());
		assertEquals("ksbu501-call", result.get(1).getCallId());
	}

}
