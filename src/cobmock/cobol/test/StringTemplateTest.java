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
	
	
}
