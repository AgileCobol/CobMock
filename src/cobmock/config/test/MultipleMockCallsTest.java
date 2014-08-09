package cobmock.config.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cobmock.config.parser.ConfigParser;
import cobmock.config.parser.ConfigParser.ConfigRootContext;
import cobmock.config.parser.ConfigParser.MockCallContext;
import cobmock.helper.ParserTool;

public class MultipleMockCallsTest {

	private ConfigRootContext ctx;
	@Before
	public void initCobolParser() throws IOException {
		ConfigParser parser = ParserTool.getConfigParserForFile("test/files/config/test1.cfg");
		ctx = parser.configRoot();
	}
	
	@Test
	public void extractSecondCallId() {
		MockCallContext mCtx = ctx.mockCall(1);
		assertEquals("ksbu500-call", mCtx.callId().TEXT().toString());
	}

}
