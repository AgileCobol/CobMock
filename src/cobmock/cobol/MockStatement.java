package cobmock.cobol;


import org.antlr.v4.runtime.Token;

public class MockStatement {
	private String callId;
	public String getCallId() {
		return callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
	}

	public Token getStartToken() {
		return startToken;
	}

	public void setStartToken(Token startToken) {
		this.startToken = startToken;
	}

	public Token getStopToken() {
		return stopToken;
	}

	public void setStopToken(Token stopToken) {
		this.stopToken = stopToken;
	}

	private Token startToken, stopToken;
	
	public MockStatement() {
		
	}

}
