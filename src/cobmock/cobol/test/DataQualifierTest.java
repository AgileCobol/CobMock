package cobmock.cobol.test;


import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.parser.MockCobolParser;
import cobmock.cobol.parser.MockCobolParser.CompilationUnitContext;
import cobmock.cobol.parser.MockCobolParser.DataQualifierContext;
import cobmock.helper.ParserTool;

public class DataQualifierTest {
private CompilationUnitContext ctx;
	
	@Before
	public void initCobolParser() throws IOException {
		MockCobolParser parser = ParserTool.getMockCobolParserForFile("test/files/cobol/dataQualifierTest.cbl");
		ctx = parser.compilationUnit();
	}
	
	@Test
	public void oneDataQualifierIsRecognized() {
		DataQualifierContext dataQualifier = ctx.mockMeta(0).
												callStatement().
												usingClause().
												dataIdentifier(0).
												dataName().
												dataQualifier();
		assertEquals("STE-PARA", dataQualifier.dataName().TEXT().toString());
	}
	
	@Test
	public void twoLevelQualifierIsRecognized() {
		DataQualifierContext dataQualifier1 = ctx.mockMeta(0).
												callStatement().
												usingClause().
												dataIdentifier(1).
												dataName().
												dataQualifier();
		DataQualifierContext dataQualifier2 = dataQualifier1.dataName().dataQualifier();
		assertEquals("B", dataQualifier2.dataName().TEXT().toString());
	}

}
