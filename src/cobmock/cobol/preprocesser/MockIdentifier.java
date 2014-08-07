package cobmock.cobol.preprocesser;

public enum MockIdentifier {
	UPCALL ("@up-call"),
	AIBCALL ("@aib-call");
	
	private String description;
	private MockIdentifier(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	
}
