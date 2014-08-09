package cobmock.config.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import cobmock.config.parser.CobmockConfigVisitor;
import cobmock.config.parser.ConfigParser;
import cobmock.helper.ParserTool;
import cobmock.config.*;

public class CobmockConfigVisitorTest {
	private Hashtable<String, List<Assignment>> result;

	@Before
	public void initCobolParser() throws IOException {
		ConfigParser parser = ParserTool.getConfigParserForFile("test/files/config/test1.cfg");		
		CobmockConfigVisitor visitor = new CobmockConfigVisitor();
		result = visitor.visit(parser.configRoot());
	}
	
	@Test
	public void resultIsNotNull() {
		assertNotNull(result);
	}
	
	@Test
	public void resultContainsCallIdsAsKeys() {
		assertTrue(result.containsKey("ksbu501-call"));
		assertTrue(result.containsKey("ksbu500-call"));
		assertEquals(2, result.size());
	}
	
	@Test
	public void resultContainsAllAsignments() {
		assertEquals(3, result.get("ksbu501-call").size());
		assertEquals(1, result.get("ksbu500-call").size());
	}
	
	@Test
	public void checkAssignments() {
		List<Assignment> assigns = result.get("ksbu501-call");
		
		assertEquals("ksy-up-rc in ste-para", assigns.get(0).getTarget());
		assertEquals("ksbc501", assigns.get(1).getTarget());
		assertEquals("string", assigns.get(2).getTarget());
		
		assertEquals("0", assigns.get(0).getSource());
		assertEquals("\"TESTA\"", assigns.get(1).getSource());
		assertEquals("\"A und B\"", assigns.get(2).getSource());
	}
	
}
