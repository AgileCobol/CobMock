package cobmock.cobol.preprocesser;


public class CommentPreprocessor implements CobolPreprocessor {
	
	@Override
	public String preprocess(String input) {
		StringBuffer result = new StringBuffer();
		for (String line : input.split("\n")) {
			if (isCodeLine(line)) {
				result.append(line);
			}
		}
		return result.toString();
	}
	private boolean isCodeLine(String line) {
		if (line.charAt(7) == '*') {
			return false;
		}
		return true;
	}

}
