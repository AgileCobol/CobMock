package cobmock.cobol.preprocesser;

import java.util.Vector;

public class PreprocessorPipe {
	private Vector<CobolPreprocessor> preprocessorPipe;
	
	public PreprocessorPipe() {
		preprocessorPipe = new Vector<CobolPreprocessor>();
	}
	public PreprocessorPipe(CobolPreprocessor preprocessor) {
		this();
		addPreprocessor(preprocessor);		
	}
	public void addPreprocessor(CobolPreprocessor preprocessor) {
		preprocessorPipe.add(preprocessor);
	}
	public String preprocess(String input) {
		for (CobolPreprocessor p : preprocessorPipe) {
			input = p.preprocess(input);
		}
		return input;
	}
}
