package cobmock.cobol.test;

import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.preprocesser.MockStatementPreprocessor;
import cobmock.helper.FileReaderHelper;

public class MockStatementPreprocessorTest {
	private MockStatementPreprocessor preprocessor;
	private String input;
	
	@Before
	public void initCommentPreprocessor() throws IOException {
		InputStream is = new FileInputStream("test/files/cobol/preprocessingTest.cbl");
		input = FileReaderHelper.fromStream(is);
		preprocessor = new MockStatementPreprocessor();
	}

	@Test
	public void resultContainsCorrectNumberOfLines() {
		String result = preprocessor.preprocess(input);
		String[] lines = result.split("\\r?\\n");
		assertEquals(6, lines.length);
	}
	
	@Test
	public void commentedOutLinesAreStillCommentedOut() {
		String result = preprocessor.preprocess(input);
		String[] lines = result.split("\\r?\\n");
		assertEquals('*', lines[0].charAt(6));
		assertEquals('*', lines[3].charAt(6));
	}
	@Test
	public void mockStatementsAreMarked() {
		String result = preprocessor.preprocess(input);
		String[] lines = result.split("\\r?\\n");
		assertEquals('@', lines[5].charAt(6));
	}
	@Test
	public void normalCodeLinesRemainUnmarked() {
		String result = preprocessor.preprocess(input);
		String[] lines = result.split("\\r?\\n");
		assertEquals(' ', lines[1].charAt(6));
		assertEquals(' ', lines[2].charAt(6));
		assertEquals(' ', lines[4].charAt(6));
	}
	
	

}
