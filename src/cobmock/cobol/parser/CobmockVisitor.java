package cobmock.cobol.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

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
		statement.setStartToken(ctx.start);
		statement.setStopToken(ctx.stop);

		return result;
	}

	private String stripQuotes(String callIdString) {
		String callId = callIdString.substring(1, callIdString.length()-1);
		return callId;
	}

}
