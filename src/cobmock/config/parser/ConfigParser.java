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
		RULE_configRoot = 0, RULE_assignment = 1, RULE_target = 2, RULE_source = 3;
	public static final String[] ruleNames = {
		"configRoot", "assignment", "target", "source"
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
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(ConfigParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ConfigParser.TEXT); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
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
	}

	public final ConfigRootContext configRoot() throws RecognitionException {
		ConfigRootContext _localctx = new ConfigRootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_configRoot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT) {
				{
				{
				setState(8); match(TEXT);
				setState(9); match(T__3);
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXT) {
					{
					{
					setState(10); assignment();
					}
					}
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(16); match(T__1);
				}
				}
				setState(21);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); target();
			setState(23); match(T__2);
			setState(24); source();
			setState(25); match(T__0);
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
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27); match(TEXT);
				}
				}
				setState(30); 
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
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\7\2\24"+
		"\n\2\f\2\16\2\27\13\2\3\3\3\3\3\3\3\3\3\3\3\4\6\4\37\n\4\r\4\16\4 \3\5"+
		"\3\5\3\5\2\2\6\2\4\6\b\2\3\3\2\7\t#\2\25\3\2\2\2\4\30\3\2\2\2\6\36\3\2"+
		"\2\2\b\"\3\2\2\2\n\13\7\b\2\2\13\17\7\3\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22"+
		"\24\7\5\2\2\23\n\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26"+
		"\3\3\2\2\2\27\25\3\2\2\2\30\31\5\6\4\2\31\32\7\4\2\2\32\33\5\b\5\2\33"+
		"\34\7\6\2\2\34\5\3\2\2\2\35\37\7\b\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3"+
		"\2\2\2 !\3\2\2\2!\7\3\2\2\2\"#\t\2\2\2#\t\3\2\2\2\5\17\25 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}