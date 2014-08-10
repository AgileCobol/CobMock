package cobmock.config;

public class CobolAssignment extends Assignment {
	private static final int cobolLineLength = 60;
	private static final String cobolLinePrefix = "          ";
	
	@Override
	public String getTarget() {
		String target = super.getTarget();
		return fitToCobolFormat(target);
		
	}
	
	@Override
	public String getSource() {
		String source = super.getSource();
		return fitToCobolFormat(source);
	}
	private String fitToCobolFormat(String statement) {		
		String[] lines = statement.split("\\r?\\n");
		StringBuffer result = new StringBuffer();
		for (String line : lines) {
			result.append(addSpacesBefore(fitToCobolLine(line)));
		}
		return result.toString();
	}
	private String fitToCobolLine(String line) {
		if (line.length() > cobolLineLength) {
			int splitIndex = line.lastIndexOf(' ');
			String preSplitIndex = line.substring(0, splitIndex);
			String postSplitIndex = line.substring(splitIndex + 1);
			
			if (postSplitIndex.length() > cobolLineLength) {
				throw new RuntimeException("Statement is too long: " + line);
			}
			
			if (preSplitIndex.length() > cobolLineLength) {
				preSplitIndex = fitToCobolLine(preSplitIndex);
			}
			return preSplitIndex + System.getProperty("line.separator") + addSpacesBefore(postSplitIndex);
		}
		return line;
	}
	
	private String addSpacesBefore(String line) {
		return cobolLinePrefix + line;
	}

}
