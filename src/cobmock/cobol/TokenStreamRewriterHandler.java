package cobmock.cobol;

import org.antlr.v4.runtime.TokenStreamRewriter;

public class TokenStreamRewriterHandler {
	private TokenStreamRewriter rewriter;
	public TokenStreamRewriterHandler(TokenStreamRewriter rewriter) {
		this.rewriter = rewriter;
	}
	public String getText() {
		return rewriter.getText();
	}
	public void replaceMockStatementWithCode(MockStatement statement, String code) {
		int startIndex = statement.getStartToken().getTokenIndex();
		int stopIndex = getStopTokenIndex(statement);
		rewriter.replace(startIndex, stopIndex, code);
	}

	private int getStopTokenIndex(MockStatement statement) {
		//the previous cobolToken (-1) and whitespaces (-2) should be preserved.
		return statement.getStopToken().getTokenIndex()-2;
	}

}
