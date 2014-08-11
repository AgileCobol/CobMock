package cobmock.cobol.preprocesser;


public class CommentPreprocessor implements CobolPreprocessor {
	
	@Override
	public String preprocess(String input) {
		StringBuffer result = new StringBuffer();
		for (String line : input.split("\\r?\\n")) {
			if (isCodeLine(line)) {
				result.append(line);
				result.append(System.getProperty("line.separator"));
			}
		}
		return result.toString();
	}
	private boolean isCodeLine(String line) {
		
		if (line.length() > 6 && line.charAt(6) == '*') {
			return false;
		}
		return true;
	}

}
