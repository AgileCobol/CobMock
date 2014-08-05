package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.preprocesser.CommentPreprocessor;

public class CommentPreprocessorTest {
	private CommentPreprocessor commentPreProc;
	private String input;
	@Before
	public void initCommentPreprocessor() throws FileNotFoundException {
		InputStream is = new FileInputStream("src/cobmock/cobol/test/files/test.cbl");
		commentPreProc = new CommentPreprocessor();
	}

	@Test	
	public void noCommentedOutLinesInCobolFileAnymore() {
		String result = commentPreProc.preprocess(input);
		for (String line : result.split("\n")) {
			assertNotEquals('*', line.charAt(7));
		}
	}
	@Test
	public void correctNumberOfCobolLinesRemainInResult() {
		String result = commentPreProc.preprocess(input);
		assertEquals(10, result.split("\n").length);
	}

}
