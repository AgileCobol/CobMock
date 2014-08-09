// Generated from grammar/antlr/Config/Config.g by ANTLR 4.4
package cobmock.config.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, INT=5, TEXT=6, STRING=7, NEWLINE=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "':='", "'}'", "';'", "INT", "TEXT", "STRING", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_configRoot = 0, RULE_mockCall = 1, RULE_assignment = 2, RULE_callId = 3, 
		RULE_target = 4, RULE_source = 5;
	public static final String[] ruleNames = {
		"configRoot", "mockCall", "assignment", "callId", "target", "source"
	};

	@Override
	public String getGrammarFileName() { return "Config.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConfigParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigRootContext extends ParserRuleContext {
		public MockCallContext mockCall(int i) {
			return getRuleContext(MockCallContext.class,i);
		}
		public List<MockCallContext> mockCall() {
			return getRuleContexts(MockCallContext.class);
		}
		public ConfigRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterConfigRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitConfigRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitConfigRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigRootContext configRoot() throws RecognitionException {
		ConfigRootContext _localctx = new ConfigRootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_configRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(12); mockCall();
				}
				}
				setState(17);
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

	public static class MockCallContext extends ParserRuleContext {
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public CallIdContext callId() {
			return getRuleContext(CallIdContext.class,0);
		}
		public MockCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mockCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterMockCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitMockCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitMockCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MockCallContext mockCall() throws RecognitionException {
		MockCallContext _localctx = new MockCallContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mockCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); callId();
			setState(19); match(T__3);
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(20); assignment();
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26); match(T__1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); target();
			setState(29); match(T__2);
			setState(30); source();
			setState(31); match(T__0);
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

	public static class CallIdContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(ConfigParser.TEXT, 0); }
		public CallIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterCallId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitCallId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitCallId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdContext callId() throws RecognitionException {
		CallIdContext _localctx = new CallIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(TEXT);
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode TEXT(int i) {
			return getToken(ConfigParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ConfigParser.TEXT); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35); match(TEXT);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConfigParser.INT, 0); }
		public TerminalNode TEXT() { return getToken(ConfigParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(ConfigParser.STRING, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConfigListener ) ((ConfigListener)listener).exitSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConfigVisitor ) return ((ConfigVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << TEXT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13-\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\6\6\'\n\6\r\6\16\6(\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\7\t)"+
		"\2\21\3\2\2\2\4\24\3\2\2\2\6\36\3\2\2\2\b#\3\2\2\2\n&\3\2\2\2\f*\3\2\2"+
		"\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2"+
		"\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\5\b\5\2\25\31\7\3\2\2\26\30\5\6\4"+
		"\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2"+
		"\2\33\31\3\2\2\2\34\35\7\5\2\2\35\5\3\2\2\2\36\37\5\n\6\2\37 \7\4\2\2"+
		" !\5\f\7\2!\"\7\6\2\2\"\7\3\2\2\2#$\7\b\2\2$\t\3\2\2\2%\'\7\b\2\2&%\3"+
		"\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\13\3\2\2\2*+\t\2\2\2+\r\3\2\2\2"+
		"\5\21\31(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}