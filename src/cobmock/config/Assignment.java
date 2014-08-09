package cobmock.config;

public class Assignment {
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

	public String getSource() {
		return source;
	}
	public String getTarget() {
		return target;
	}
	
	@Override
	public String toString() {
		return target + " := " + source + ";";
	}
}
