package cobmock.cobol.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.TokenStreamRewriter;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.stringtemplate.v4.ST;

import cobmock.cobol.parser.CobmockParser;
import cobmock.config.Assignment;
import cobmock.config.CobolAssignment;
import cobmock.helper.FileReaderHelper;

public class StringTemplateTest {
	String input;

	@Before
	public void init() throws FileNotFoundException, IOException {
		input = FileReaderHelper.fromStream(new FileInputStream("test/files/stringtemplate/move.st"));
	}
	
	@Test
	@Ignore
	public void simpleTest() {
		Assignment assign1 = new Assignment();
		assign1.setSource("ZERO");
		assign1.setTarget("KKT-NR");
		
		Assignment assign2 = new Assignment();
		assign2.setSource("1");
		assign2.setTarget("KKD-NR");
		
		ArrayList<Assignment> assignList= new ArrayList<Assignment>();
		
		assignList.add(assign1);
		assignList.add(assign2);
		
		ST template = new ST(input, '<', '>');
		template.add("assignmentList", assignList);
		template.add("callId", "ksbu501-call");

		System.out.println(template.render());
	}
	
	@Test
	public void cobolTest() throws FileNotFoundException, IOException {
		CobmockParser parser = new CobmockParser(new FileInputStream("test/files/cobol/mockIdTest.cbl"));
		parser.parse();
		TokenStreamRewriter rewriter = parser.getTokenStreamRewriter();
		
		CobolAssignment assign1 = new CobolAssignment();
		assign1.setSource("KKD-NR-KKT in KKDW001 in KSBU502 in KSBU503 in TEMP-KONTODATEN in TESTSTRUKTUR");
		assign1.setTarget("KKDW135");
		
		CobolAssignment assign2 = new CobolAssignment();
		assign2.setSource("ZERO");
		assign2.setTarget("KKT-SLD in MEINKONTO-STRUKTUR1 in TESTVALUES in TEMP-KONTODATEN in KSBU501");

		ArrayList<Assignment> assignList= new ArrayList<Assignment>();

		assignList.add(assign1);
		assignList.add(assign2);

		ST template = new ST(input, '<', '>');
		template.add("assignmentList", assignList);
		template.add("callId", "ksbu501-call");
		
		String text = System.getProperty("line.separator") + template.render() + System.getProperty("line.separator");
		
		rewriter.replace(2, text);
		
		System.out.println(rewriter.getText());
	}

}
