package cobmock.cobol.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Before;
import org.junit.Test;

import cobmock.cobol.preprocesser.CommentPreprocessor;
import cobmock.cobol.preprocesser.MockStatementPreprocessor;
import cobmock.cobol.preprocesser.PreprocessorPipe;
import cobmock.helper.FileReaderHelper;

public class PreprocessorPipelineTest {
	private String input;
	
	@Before
	public void initCommentPreprocessor() throws IOException {
		InputStream is = new FileInputStream("test/files/cobol/pipeline.cbl");
		input = FileReaderHelper.fromStream(is);
	}

	@Test
	public void pipelineWithOnePreprocessorWorks() {
		PreprocessorPipe pipe = new PreprocessorPipe(new CommentPreprocessor());
		String result = pipe.preprocess(input);
		assertEquals(3, result.split("\\r?\\n").length);
	}
	@Test
	public void pipelineWithTwoPreprocessorsWorks() {
		PreprocessorPipe pipe = new PreprocessorPipe(new MockStatementPreprocessor());
		pipe.addPreprocessor(new CommentPreprocessor());
		String result = pipe.preprocess(input);
		String[] lines = result.split("\\r?\\n");
		assertEquals(4, lines.length);
		assertEquals('@', lines[3].charAt(6));
		assertNotEquals('*', lines[0].charAt(6));
		assertNotEquals('*', lines[1].charAt(6));
		assertNotEquals('*', lines[2].charAt(6));
	}

}
