// Generated from grammar/antlr/Cobol4.g by ANTLR 4.4
package cobmock.cobol.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cobol4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, MOVE=3, MOCKUP=4, ENDCALL=5, USING=6, CALL=7, ADDRESS=8, 
		OF=9, IN=10, LENGTH=11, TOKEN=12, COMMENT=13, INT=14, TEXT=15, STRING=16, 
		NEWLINE=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "MOVE", "MOCKUP", "ENDCALL", "USING", "CALL", 
		"ADDRESS", "OF", "IN", "LENGTH", "TOKEN", "'*'", "INT", "TEXT", "STRING", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_mockMeta = 1, RULE_callStatement = 2, RULE_usingClause = 3, 
		RULE_dataIdentifier = 4, RULE_addressOfClause = 5, RULE_lengthOfClause = 6, 
		RULE_dataName = 7, RULE_cobolToken = 8;
	public static final String[] ruleNames = {
		"compilationUnit", "mockMeta", "callStatement", "usingClause", "dataIdentifier", 
		"addressOfClause", "lengthOfClause", "dataName", "cobolToken"
	};

	@Override
	public String getGrammarFileName() { return "Cobol4.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Cobol4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public CobolTokenContext cobolToken(int i) {
			return getRuleContext(CobolTokenContext.class,i);
		}
		public List<MockMetaContext> mockMeta() {
			return getRuleContexts(MockMetaContext.class);
		}
		public List<CobolTokenContext> cobolToken() {
			return getRuleContexts(CobolTokenContext.class);
		}
		public MockMetaContext mockMeta(int i) {
			return getRuleContext(MockMetaContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(18); mockMeta();
				setState(19); cobolToken();
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(20);
						matchWildcard();
						}
						} 
					}
					setState(25);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MockMetaContext extends ParserRuleContext {
		public TerminalNode MOCKUP() { return getToken(Cobol4Parser.MOCKUP, 0); }
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(Cobol4Parser.COMMENT, 0); }
		public MockMetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mockMeta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterMockMeta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitMockMeta(this);
		}
	}

	public final MockMetaContext mockMeta() throws RecognitionException {
		MockMetaContext _localctx = new MockMetaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mockMeta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(COMMENT);
			setState(32); match(MOCKUP);
			setState(33); callStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallStatementContext extends ParserRuleContext {
		public UsingClauseContext usingClause() {
			return getRuleContext(UsingClauseContext.class,0);
		}
		public TerminalNode CALL() { return getToken(Cobol4Parser.CALL, 0); }
		public TerminalNode TEXT() { return getToken(Cobol4Parser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(Cobol4Parser.STRING, 0); }
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitCallStatement(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_callStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(CALL);
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(38);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(37); usingClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingClauseContext extends ParserRuleContext {
		public DataIdentifierContext dataIdentifier(int i) {
			return getRuleContext(DataIdentifierContext.class,i);
		}
		public List<DataIdentifierContext> dataIdentifier() {
			return getRuleContexts(DataIdentifierContext.class);
		}
		public TerminalNode USING() { return getToken(Cobol4Parser.USING, 0); }
		public UsingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterUsingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitUsingClause(this);
		}
	}

	public final UsingClauseContext usingClause() throws RecognitionException {
		UsingClauseContext _localctx = new UsingClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_usingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(USING);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41); dataIdentifier();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDRESS) | (1L << LENGTH) | (1L << TEXT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataIdentifierContext extends ParserRuleContext {
		public LengthOfClauseContext lengthOfClause() {
			return getRuleContext(LengthOfClauseContext.class,0);
		}
		public DataNameContext dataName() {
			return getRuleContext(DataNameContext.class,0);
		}
		public AddressOfClauseContext addressOfClause() {
			return getRuleContext(AddressOfClauseContext.class,0);
		}
		public DataIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterDataIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitDataIdentifier(this);
		}
	}

	public final DataIdentifierContext dataIdentifier() throws RecognitionException {
		DataIdentifierContext _localctx = new DataIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			switch (_input.LA(1)) {
			case ADDRESS:
				{
				setState(46); addressOfClause();
				}
				break;
			case LENGTH:
				{
				setState(47); lengthOfClause();
				}
				break;
			case TEXT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(50); dataName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressOfClauseContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(Cobol4Parser.OF, 0); }
		public TerminalNode ADDRESS() { return getToken(Cobol4Parser.ADDRESS, 0); }
		public AddressOfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressOfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterAddressOfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitAddressOfClause(this);
		}
	}

	public final AddressOfClauseContext addressOfClause() throws RecognitionException {
		AddressOfClauseContext _localctx = new AddressOfClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addressOfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(ADDRESS);
			setState(53); match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LengthOfClauseContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(Cobol4Parser.OF, 0); }
		public TerminalNode LENGTH() { return getToken(Cobol4Parser.LENGTH, 0); }
		public LengthOfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthOfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterLengthOfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitLengthOfClause(this);
		}
	}

	public final LengthOfClauseContext lengthOfClause() throws RecognitionException {
		LengthOfClauseContext _localctx = new LengthOfClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lengthOfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(LENGTH);
			setState(56); match(OF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataNameContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Cobol4Parser.INT, 0); }
		public TerminalNode TEXT() { return getToken(Cobol4Parser.TEXT, 0); }
		public DataNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterDataName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitDataName(this);
		}
	}

	public final DataNameContext dataName() throws RecognitionException {
		DataNameContext _localctx = new DataNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(TEXT);
			setState(62);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(59); match(T__0);
				setState(60); match(INT);
				setState(61); match(T__1);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CobolTokenContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(Cobol4Parser.TOKEN, 0); }
		public CobolTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cobolToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterCobolToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitCobolToken(this);
		}
	}

	public final CobolTokenContext cobolToken() throws RecognitionException {
		CobolTokenContext _localctx = new CobolTokenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cobolToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(TOKEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\7\2\30\n\2\f\2\16\2\33\13\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\5\4)\n\4\3\5\3\5\6\5-\n\5\r\5\16\5.\3\6\3\6\5\6\63\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tA\n\t\3\n\3\n\3\n\3"+
		"\31\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\21\22B\2\36\3\2\2\2\4!\3\2\2\2\6"+
		"%\3\2\2\2\b*\3\2\2\2\n\62\3\2\2\2\f\66\3\2\2\2\169\3\2\2\2\20<\3\2\2\2"+
		"\22B\3\2\2\2\24\25\5\4\3\2\25\31\5\22\n\2\26\30\13\2\2\2\27\26\3\2\2\2"+
		"\30\33\3\2\2\2\31\32\3\2\2\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2"+
		"\34\24\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36"+
		"\3\2\2\2!\"\7\17\2\2\"#\7\6\2\2#$\5\6\4\2$\5\3\2\2\2%&\7\t\2\2&(\t\2\2"+
		"\2\')\5\b\5\2(\'\3\2\2\2()\3\2\2\2)\7\3\2\2\2*,\7\b\2\2+-\5\n\6\2,+\3"+
		"\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\t\3\2\2\2\60\63\5\f\7\2\61\63\5"+
		"\16\b\2\62\60\3\2\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65"+
		"\5\20\t\2\65\13\3\2\2\2\66\67\7\n\2\2\678\7\13\2\28\r\3\2\2\29:\7\r\2"+
		"\2:;\7\13\2\2;\17\3\2\2\2<@\7\21\2\2=>\7\4\2\2>?\7\20\2\2?A\7\3\2\2@="+
		"\3\2\2\2@A\3\2\2\2A\21\3\2\2\2BC\7\16\2\2C\23\3\2\2\2\b\31\36(.\62@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}