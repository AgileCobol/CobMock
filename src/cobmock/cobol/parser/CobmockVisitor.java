package cobmock.cobol.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

import cobmock.cobol.MockStatement;
import cobmock.cobol.parser.MockCobolParser.CallStatementContext;
import cobmock.cobol.parser.MockCobolParser.CompilationUnitContext;
import cobmock.cobol.parser.MockCobolParser.MockIdentifierContext;
import cobmock.cobol.parser.MockCobolParser.MockMetaContext;

public class CobmockVisitor extends MockCobolBaseVisitor<List<MockStatement>> {
	private ArrayList<MockStatement> result;
	private MockStatement statement;

	@Override
	public List<MockStatement> visitCompilationUnit(CompilationUnitContext ctx) {
		result = new ArrayList<MockStatement>();
		visitChildren(ctx);
		return result;
	}

	@Override
	public List<MockStatement> visitMockMeta(MockMetaContext ctx) {
		statement = new MockStatement();
		statement.setStartToken(ctx.start);
		visitChildren(ctx);
		result.add(statement);
		return result;
	}

	@Override
	public List<MockStatement> visitMockIdentifier(MockIdentifierContext ctx) {
		if (ctx.STRING() != null) {
			String callIdString = ctx.STRING().toString();
			statement.setCallId(stripQuotes(callIdString));
		}
		return result;
	}

	@Override
	public List<MockStatement> visitCallStatement(CallStatementContext ctx) {
		statement.setCallStatement(getTargetTextWithSpaces(ctx));
		statement.setStopToken(ctx.stop);

		return result;
	}

	private String stripQuotes(String callIdString) {
		String callId = callIdString.substring(1, callIdString.length()-1);
		return callId;
	}
	private String getTargetTextWithSpaces(ParserRuleContext ctx) {
		int start = ctx.start.getStartIndex();
		//stop-Token is not part of the CallStatement and should therefore be removed
		int stop = ctx.stop.getStopIndex()-ctx.stop.getText().length();
		Interval interval = new Interval(start, stop);		
		return ctx.start.getInputStream().getText(interval);
	}

}
