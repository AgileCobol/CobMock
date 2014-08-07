package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.preprocesser.CommentPreprocessor;
import cobmock.helper.FileReaderHelper;

public class CommentPreprocessorTest {
	private CommentPreprocessor commentPreProc;
	private String input;
	@Before
	public void initCommentPreprocessor() throws IOException {
		InputStream is = new FileInputStream("src/cobmock/cobol/test/files/preprocessingTest.cbl");
		input = FileReaderHelper.fromStream(is);
		commentPreProc = new CommentPreprocessor();
	}

	@Test	
	public void noCommentedOutLinesInCobolFileAnymore() {
		String result = commentPreProc.preprocess(input);
		for (String line : result.split("\\r?\\n")) {
			assertNotEquals('*', line.charAt(6));
		}
	}
	@Test
	public void correctNumberOfCobolLinesRemainInResult() {
		String result = commentPreProc.preprocess(input);
		assertEquals(3, result.split("\\r?\\n").length);
	}

}
