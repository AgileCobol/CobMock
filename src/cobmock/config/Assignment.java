package cobmock.config;

public class Assignment {
	private static final int cobolLineLength = 60;
	private static final String cobolLinePrefix = "          ";
	private String source, target;

	public Assignment() {
		
	}
	public Assignment(String source, String target) {
		this.source = source;
		this.target = target;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTarget() {
		return fitToCobolFormat(target);
	}
	
	public String getSource() {
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
	
	@Override
	public String toString() {
		return target + " := " + source + ";";
	}
}
