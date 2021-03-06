// Generated from grammar/antlr/Config/Config.g by ANTLR 4.4
package cobmock.config.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, INT=5, TEXT=6, STRING=7, NEWLINE=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "INT", "TEXT", "STRING", "NEWLINE", "WS"
	};


	public ConfigLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Config.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13H\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6 \n\6\r\6\16\6!\3\7\6\7%\n\7\r\7\16"+
		"\7&\3\b\3\b\7\b+\n\b\f\b\16\b.\13\b\3\b\3\b\3\b\7\b\63\n\b\f\b\16\b\66"+
		"\13\b\3\b\5\b9\n\b\3\t\5\t<\n\t\3\t\3\t\3\t\3\t\3\n\6\nC\n\n\r\n\16\n"+
		"D\3\n\3\n\4,\64\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\5\3"+
		"\2\62;\7\2,,//\62;C\\c|\5\2\13\13\"#))N\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\32\3\2\2\2\t\34\3\2\2\2\13\37"+
		"\3\2\2\2\r$\3\2\2\2\178\3\2\2\2\21;\3\2\2\2\23B\3\2\2\2\25\26\7}\2\2\26"+
		"\4\3\2\2\2\27\30\7<\2\2\30\31\7?\2\2\31\6\3\2\2\2\32\33\7\177\2\2\33\b"+
		"\3\2\2\2\34\35\7=\2\2\35\n\3\2\2\2\36 \t\2\2\2\37\36\3\2\2\2 !\3\2\2\2"+
		"!\37\3\2\2\2!\"\3\2\2\2\"\f\3\2\2\2#%\t\3\2\2$#\3\2\2\2%&\3\2\2\2&$\3"+
		"\2\2\2&\'\3\2\2\2\'\16\3\2\2\2(,\7)\2\2)+\13\2\2\2*)\3\2\2\2+.\3\2\2\2"+
		",-\3\2\2\2,*\3\2\2\2-/\3\2\2\2.,\3\2\2\2/9\7)\2\2\60\64\7$\2\2\61\63\13"+
		"\2\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\65\3\2\2\2\64\62\3\2\2\2\65\67\3"+
		"\2\2\2\66\64\3\2\2\2\679\7$\2\28(\3\2\2\28\60\3\2\2\29\20\3\2\2\2:<\7"+
		"\17\2\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\f\2\2>?\3\2\2\2?@\b\t\2\2@\22"+
		"\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2F"+
		"G\b\n\2\2G\24\3\2\2\2\n\2!&,\648;D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}