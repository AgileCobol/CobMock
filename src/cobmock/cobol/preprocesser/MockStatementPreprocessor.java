package cobmock.cobol.preprocesser;

public class MockStatementPreprocessor implements CobolPreprocessor {

	@Override
	public String preprocess(String input) {
		StringBuffer result = new StringBuffer();
		for (String line : input.split("\\r?\\n")) {
			if (containsMockStatement(line)) {
				result.append(markLineAsMockstatement(line));
			}
			else {
				result.append(line);
			}
			result.append(System.getProperty("line.separator"));
		}
		return result.toString();
	}
	private boolean containsMockStatement(String line) {
		for (MockIdentifier mockStatementIdentifier : MockIdentifier.values()) {
			if (line.indexOf(mockStatementIdentifier.getDescription()) >= 0) {
				return true;
			}
		}
		return false;
	}
	private String markLineAsMockstatement(String line) {
		StringBuilder builder = new StringBuilder(line);
		builder.setCharAt(6, '@');
		return builder.toString();
	}

}
