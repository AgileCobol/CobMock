// Generated from grammar/antlr/Cobol/MockCobol.g by ANTLR 4.4
package cobmock.cobol.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MockCobolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, MOCKUP=4, MOCKBEGIN=5, MOVE=6, ENDCALL=7, USING=8, 
		CALL=9, ADDRESS=10, OF=11, IN=12, LENGTH=13, SET=14, TOKEN=15, INT=16, 
		TEXT=17, STRING=18, NEWLINE=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "MOCKUP", "MOCKBEGIN", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "MOVE", "ENDCALL", "USING", "CALL", 
		"ADDRESS", "OF", "IN", "LENGTH", "SET", "TOKEN", "INT", "TEXT", "STRING", 
		"NEWLINE", "WS"
	};


	public MockCobolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MockCobol.g"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0109\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\5*\u00de\n*\3+\6+\u00e1\n+\r+\16"+
		"+\u00e2\3,\6,\u00e6\n,\r,\16,\u00e7\3-\3-\7-\u00ec\n-\f-\16-\u00ef\13"+
		"-\3-\3-\3-\7-\u00f4\n-\f-\16-\u00f7\13-\3-\5-\u00fa\n-\3.\5.\u00fd\n."+
		"\3.\3.\3.\3.\3/\6/\u0104\n/\r/\16/\u0105\3/\3/\4\u00ed\u00f5\2\60\3\3"+
		"\5\4\7\5\t\6\13\7\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2"+
		"#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\bC\tE\nG\13I\f"+
		"K\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26\3\2\37\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\62;\7\2,,//\62;C"+
		"\\c|\5\2\13\13\"#))\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5c\3\2\2\2\7e\3"+
		"\2\2\2\tg\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2\23x\3"+
		"\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3"+
		"\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'"+
		"\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3\2"+
		"\2\2\61\u0096\3\2\2\2\63\u0098\3\2\2\2\65\u009a\3\2\2\2\67\u009c\3\2\2"+
		"\29\u009e\3\2\2\2;\u00a0\3\2\2\2=\u00a2\3\2\2\2?\u00a4\3\2\2\2A\u00a6"+
		"\3\2\2\2C\u00ab\3\2\2\2E\u00b4\3\2\2\2G\u00ba\3\2\2\2I\u00bf\3\2\2\2K"+
		"\u00c7\3\2\2\2M\u00ca\3\2\2\2O\u00cd\3\2\2\2Q\u00d4\3\2\2\2S\u00dd\3\2"+
		"\2\2U\u00e0\3\2\2\2W\u00e5\3\2\2\2Y\u00f9\3\2\2\2[\u00fc\3\2\2\2]\u0103"+
		"\3\2\2\2_`\7k\2\2`a\7f\2\2ab\7?\2\2b\4\3\2\2\2cd\7+\2\2d\6\3\2\2\2ef\7"+
		"*\2\2f\b\3\2\2\2gh\7B\2\2hi\5\65\33\2ij\5+\26\2jk\7/\2\2kl\5\21\t\2lm"+
		"\5\r\7\2mn\5#\22\2no\5#\22\2o\n\3\2\2\2pq\7B\2\2q\f\3\2\2\2rs\t\2\2\2"+
		"s\16\3\2\2\2tu\t\3\2\2u\20\3\2\2\2vw\t\4\2\2w\22\3\2\2\2xy\t\5\2\2y\24"+
		"\3\2\2\2z{\t\6\2\2{\26\3\2\2\2|}\t\7\2\2}\30\3\2\2\2~\177\t\b\2\2\177"+
		"\32\3\2\2\2\u0080\u0081\t\t\2\2\u0081\34\3\2\2\2\u0082\u0083\t\n\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\t\13\2\2\u0085 \3\2\2\2\u0086\u0087\t\f\2\2\u0087"+
		"\"\3\2\2\2\u0088\u0089\t\r\2\2\u0089$\3\2\2\2\u008a\u008b\t\16\2\2\u008b"+
		"&\3\2\2\2\u008c\u008d\t\17\2\2\u008d(\3\2\2\2\u008e\u008f\t\20\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\t\21\2\2\u0091,\3\2\2\2\u0092\u0093\t\22\2\2\u0093"+
		".\3\2\2\2\u0094\u0095\t\23\2\2\u0095\60\3\2\2\2\u0096\u0097\t\24\2\2\u0097"+
		"\62\3\2\2\2\u0098\u0099\t\25\2\2\u0099\64\3\2\2\2\u009a\u009b\t\26\2\2"+
		"\u009b\66\3\2\2\2\u009c\u009d\t\27\2\2\u009d8\3\2\2\2\u009e\u009f\t\30"+
		"\2\2\u009f:\3\2\2\2\u00a0\u00a1\t\31\2\2\u00a1<\3\2\2\2\u00a2\u00a3\t"+
		"\32\2\2\u00a3>\3\2\2\2\u00a4\u00a5\t\33\2\2\u00a5@\3\2\2\2\u00a6\u00a7"+
		"\5%\23\2\u00a7\u00a8\5)\25\2\u00a8\u00a9\5\67\34\2\u00a9\u00aa\5\25\13"+
		"\2\u00aaB\3\2\2\2\u00ab\u00ac\5\25\13\2\u00ac\u00ad\5\'\24\2\u00ad\u00ae"+
		"\5\23\n\2\u00ae\u00af\7/\2\2\u00af\u00b0\5\21\t\2\u00b0\u00b1\5\r\7\2"+
		"\u00b1\u00b2\5#\22\2\u00b2\u00b3\5#\22\2\u00b3D\3\2\2\2\u00b4\u00b5\5"+
		"\65\33\2\u00b5\u00b6\5\61\31\2\u00b6\u00b7\5\35\17\2\u00b7\u00b8\5\'\24"+
		"\2\u00b8\u00b9\5\31\r\2\u00b9F\3\2\2\2\u00ba\u00bb\5\21\t\2\u00bb\u00bc"+
		"\5\r\7\2\u00bc\u00bd\5#\22\2\u00bd\u00be\5#\22\2\u00beH\3\2\2\2\u00bf"+
		"\u00c0\5\r\7\2\u00c0\u00c1\5\23\n\2\u00c1\u00c2\5\23\n\2\u00c2\u00c3\5"+
		"/\30\2\u00c3\u00c4\5\25\13\2\u00c4\u00c5\5\61\31\2\u00c5\u00c6\5\61\31"+
		"\2\u00c6J\3\2\2\2\u00c7\u00c8\5)\25\2\u00c8\u00c9\5\27\f\2\u00c9L\3\2"+
		"\2\2\u00ca\u00cb\5\35\17\2\u00cb\u00cc\5\'\24\2\u00ccN\3\2\2\2\u00cd\u00ce"+
		"\5#\22\2\u00ce\u00cf\5\25\13\2\u00cf\u00d0\5\'\24\2\u00d0\u00d1\5\31\r"+
		"\2\u00d1\u00d2\5\63\32\2\u00d2\u00d3\5\33\16\2\u00d3P\3\2\2\2\u00d4\u00d5"+
		"\5\61\31\2\u00d5\u00d6\5\25\13\2\u00d6\u00d7\5\63\32\2\u00d7R\3\2\2\2"+
		"\u00d8\u00de\5A!\2\u00d9\u00de\5C\"\2\u00da\u00de\5G$\2\u00db\u00de\5"+
		"Q)\2\u00dc\u00de\7\60\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd"+
		"\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00deT\3\2\2\2"+
		"\u00df\u00e1\t\34\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3V\3\2\2\2\u00e4\u00e6\t\35\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8X\3\2\2\2\u00e9\u00ed\7)\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00fa\7)\2\2\u00f1\u00f5\7$\2"+
		"\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\7$\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00f1\3\2\2\2\u00fa"+
		"Z\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\3\2\2\2\u0100\u0101"+
		"\b.\2\2\u0101\\\3\2\2\2\u0102\u0104\t\36\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107\u0108\b/\2\2\u0108^\3\2\2\2\13\2\u00dd\u00e2\u00e7\u00ed\u00f5"+
		"\u00f9\u00fc\u0105\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}