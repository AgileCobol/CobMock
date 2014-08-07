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
		T__2=1, T__1=2, T__0=3, MOCKUP=4, MOCKBEGIN=5, MOVE=6, ENDCALL=7, USING=8, 
		CALL=9, ADDRESS=10, OF=11, IN=12, LENGTH=13, SET=14, TOKEN=15, INT=16, 
		TEXT=17, STRING=18, NEWLINE=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "'id='", "')'", "'('", "MOCKUP", "'@'", "MOVE", "ENDCALL", 
		"USING", "CALL", "ADDRESS", "OF", "IN", "LENGTH", "SET", "TOKEN", "INT", 
		"TEXT", "STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_mockMeta = 1, RULE_mockIdentifier = 2, 
		RULE_callStatement = 3, RULE_usingClause = 4, RULE_dataIdentifier = 5, 
		RULE_addressOfClause = 6, RULE_lengthOfClause = 7, RULE_dataName = 8, 
		RULE_cobolToken = 9;
	public static final String[] ruleNames = {
		"compilationUnit", "mockMeta", "mockIdentifier", "callStatement", "usingClause", 
		"dataIdentifier", "addressOfClause", "lengthOfClause", "dataName", "cobolToken"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << MOCKUP) | (1L << MOCKBEGIN) | (1L << MOVE) | (1L << ENDCALL) | (1L << USING) | (1L << CALL) | (1L << ADDRESS) | (1L << OF) | (1L << IN) | (1L << LENGTH) | (1L << SET) | (1L << TOKEN) | (1L << INT) | (1L << TEXT) | (1L << STRING) | (1L << NEWLINE) | (1L << WS))) != 0)) {
				{
				{
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
				{
				setState(26); mockMeta();
				setState(27); cobolToken();
				}
				}
				}
				setState(33);
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
		public MockIdentifierContext mockIdentifier() {
			return getRuleContext(MockIdentifierContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public TerminalNode MOCKBEGIN() { return getToken(Cobol4Parser.MOCKBEGIN, 0); }
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
			setState(34); match(MOCKBEGIN);
			setState(35); mockIdentifier();
			setState(36); callStatement();
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

	public static class MockIdentifierContext extends ParserRuleContext {
		public TerminalNode MOCKUP() { return getToken(Cobol4Parser.MOCKUP, 0); }
		public TerminalNode STRING() { return getToken(Cobol4Parser.STRING, 0); }
		public MockIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mockIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).enterMockIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Cobol4Listener ) ((Cobol4Listener)listener).exitMockIdentifier(this);
		}
	}

	public final MockIdentifierContext mockIdentifier() throws RecognitionException {
		MockIdentifierContext _localctx = new MockIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mockIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(MOCKUP);
			setState(41);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(39); match(T__2);
				setState(40); match(STRING);
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
		enterRule(_localctx, 6, RULE_callStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(CALL);
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(46);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(45); usingClause();
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
		enterRule(_localctx, 8, RULE_usingClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(USING);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49); dataIdentifier();
				}
				}
				setState(52); 
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
		enterRule(_localctx, 10, RULE_dataIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			switch (_input.LA(1)) {
			case ADDRESS:
				{
				setState(54); addressOfClause();
				}
				break;
			case LENGTH:
				{
				setState(55); lengthOfClause();
				}
				break;
			case TEXT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(58); dataName();
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
		enterRule(_localctx, 12, RULE_addressOfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(ADDRESS);
			setState(61); match(OF);
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
		enterRule(_localctx, 14, RULE_lengthOfClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(LENGTH);
			setState(64); match(OF);
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
		enterRule(_localctx, 16, RULE_dataName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(TEXT);
			setState(70);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(67); match(T__0);
				setState(68); match(INT);
				setState(69); match(T__1);
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
		enterRule(_localctx, 18, RULE_cobolToken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(TOKEN);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\6\6\65"+
		"\n\6\r\6\16\6\66\3\7\3\7\5\7;\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\nI\n\n\3\13\3\13\3\13\3\31\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\3\3\2\23\24J\2!\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b-\3\2\2\2\n\62\3\2\2"+
		"\2\f:\3\2\2\2\16>\3\2\2\2\20A\3\2\2\2\22D\3\2\2\2\24J\3\2\2\2\26\30\13"+
		"\2\2\2\27\26\3\2\2\2\30\33\3\2\2\2\31\32\3\2\2\2\31\27\3\2\2\2\32\34\3"+
		"\2\2\2\33\31\3\2\2\2\34\35\5\4\3\2\35\36\5\24\13\2\36 \3\2\2\2\37\31\3"+
		"\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\7\7\2"+
		"\2%&\5\6\4\2&\'\5\b\5\2\'\5\3\2\2\2(+\7\6\2\2)*\7\3\2\2*,\7\24\2\2+)\3"+
		"\2\2\2+,\3\2\2\2,\7\3\2\2\2-.\7\13\2\2.\60\t\2\2\2/\61\5\n\6\2\60/\3\2"+
		"\2\2\60\61\3\2\2\2\61\t\3\2\2\2\62\64\7\n\2\2\63\65\5\f\7\2\64\63\3\2"+
		"\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\13\3\2\2\28;\5\16\b"+
		"\29;\5\20\t\2:8\3\2\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\5\22\n\2=\r\3"+
		"\2\2\2>?\7\f\2\2?@\7\r\2\2@\17\3\2\2\2AB\7\17\2\2BC\7\r\2\2C\21\3\2\2"+
		"\2DH\7\23\2\2EF\7\5\2\2FG\7\22\2\2GI\7\4\2\2HE\3\2\2\2HI\3\2\2\2I\23\3"+
		"\2\2\2JK\7\21\2\2K\25\3\2\2\2\t\31!+\60\66:H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}