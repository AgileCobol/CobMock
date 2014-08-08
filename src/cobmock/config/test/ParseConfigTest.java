package cobmock.config.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cobmock.config.parser.ConfigParser;
import cobmock.config.parser.ConfigParser.ConfigRootContext;
import cobmock.helper.ParserTool;

public class ParseConfigTest {
	private ConfigRootContext ctx;
	
	@Before
	public void initCobolParser() throws IOException {
		ConfigParser parser = ParserTool.getConfigParserForFile("test/files/config/test1.cfg");
		ctx = parser.configRoot();
	}
	
	@Test
	public void generateParserWithoutException() throws IOException {
		assertNull(ctx.exception);
	}
	
	@Test
	public void extractCallId() {
		assertEquals("ksbu501-call", ctx.TEXT(0).toString());
	}
	@Test
	public void extractFirstTarget() {
		assertEquals("ksy-up-rc", ctx.assignment(0).target().TEXT(0).toString());
		assertEquals("in", ctx.assignment(0).target().TEXT(1).toString());
		assertEquals("ste-para", ctx.assignment(0).target().TEXT(2).toString());
	}
	@Test 
	public void extractSecondTarget() {
		assertEquals("ksbc501", ctx.assignment(1).target().TEXT(0).toString());
	}
	
	@Test
	public void extractSourceGivenAsINT() {
		assertEquals("0", ctx.assignment(0).source().INT().toString());
	}
	@Test
	public void extractSourceGivenAsStringWithoutSpaces() {
		assertEquals("\"TESTA\"", ctx.assignment(1).source().STRING().toString());
	}
	@Test
	public void extractSourceGivenAsStringWithSpace() {
		assertEquals("\"A und B\"", ctx.assignment(2).source().STRING().toString());
	}

}
