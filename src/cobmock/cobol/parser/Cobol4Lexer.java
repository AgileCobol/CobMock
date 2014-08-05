// Generated from grammar/antlr/Cobol4.g by ANTLR 4.4
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
public class Cobol4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__1=1, T__0=2, MOVE=3, MOCKUP=4, ENDCALL=5, USING=6, CALL=7, ADDRESS=8, 
		OF=9, IN=10, LENGTH=11, TOKEN=12, MOCKBEGIN=13, INT=14, TEXT=15, STRING=16, 
		NEWLINE=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'"
	};
	public static final String[] ruleNames = {
		"T__1", "T__0", "MOVE", "MOCKUP", "ENDCALL", "USING", "CALL", "ADDRESS", 
		"OF", "IN", "LENGTH", "TOKEN", "MOCKBEGIN", "INT", "TEXT", "STRING", "NEWLINE", 
		"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};


	public Cobol4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cobol4.g"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24\u00fc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u009b"+
		"\n\r\3\16\3\16\3\17\6\17\u00a0\n\17\r\17\16\17\u00a1\3\20\6\20\u00a5\n"+
		"\20\r\20\16\20\u00a6\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21"+
		"\3\21\3\21\3\21\7\21\u00b3\n\21\f\21\16\21\u00b6\13\21\3\21\5\21\u00b9"+
		"\n\21\3\22\5\22\u00bc\n\22\3\22\3\22\3\22\3\22\3\23\6\23\u00c3\n\23\r"+
		"\23\16\23\u00c4\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\4\u00ac\u00b4\2.\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\2)\2+\2"+
		"-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U"+
		"\2W\2Y\2\3\2\37\3\2\62;\6\2,,\62;C\\c|\4\2\13\13\"\"\4\2CCcc\4\2DDdd\4"+
		"\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMm"+
		"m\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2"+
		"VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u00eb\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\td\3\2\2\2\13m\3\2\2\2\rv\3\2\2"+
		"\2\17|\3\2\2\2\21\u0081\3\2\2\2\23\u0089\3\2\2\2\25\u008c\3\2\2\2\27\u008f"+
		"\3\2\2\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009f\3\2\2\2\37\u00a4\3"+
		"\2\2\2!\u00b8\3\2\2\2#\u00bb\3\2\2\2%\u00c2\3\2\2\2\'\u00c8\3\2\2\2)\u00ca"+
		"\3\2\2\2+\u00cc\3\2\2\2-\u00ce\3\2\2\2/\u00d0\3\2\2\2\61\u00d2\3\2\2\2"+
		"\63\u00d4\3\2\2\2\65\u00d6\3\2\2\2\67\u00d8\3\2\2\29\u00da\3\2\2\2;\u00dc"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00e0\3\2\2\2A\u00e2\3\2\2\2C\u00e4\3\2\2\2E"+
		"\u00e6\3\2\2\2G\u00e8\3\2\2\2I\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2"+
		"\2\2O\u00f0\3\2\2\2Q\u00f2\3\2\2\2S\u00f4\3\2\2\2U\u00f6\3\2\2\2W\u00f8"+
		"\3\2\2\2Y\u00fa\3\2\2\2[\\\7*\2\2\\\4\3\2\2\2]^\7+\2\2^\6\3\2\2\2_`\5"+
		"? \2`a\5C\"\2ab\5Q)\2bc\5/\30\2c\b\3\2\2\2de\7B\2\2ef\5O(\2fg\5E#\2gh"+
		"\7/\2\2hi\5+\26\2ij\5\'\24\2jk\5=\37\2kl\5=\37\2l\n\3\2\2\2mn\5/\30\2"+
		"no\5A!\2op\5-\27\2pq\7/\2\2qr\5+\26\2rs\5\'\24\2st\5=\37\2tu\5=\37\2u"+
		"\f\3\2\2\2vw\5O(\2wx\5K&\2xy\5\67\34\2yz\5A!\2z{\5\63\32\2{\16\3\2\2\2"+
		"|}\5+\26\2}~\5\'\24\2~\177\5=\37\2\177\u0080\5=\37\2\u0080\20\3\2\2\2"+
		"\u0081\u0082\5\'\24\2\u0082\u0083\5-\27\2\u0083\u0084\5-\27\2\u0084\u0085"+
		"\5I%\2\u0085\u0086\5/\30\2\u0086\u0087\5K&\2\u0087\u0088\5K&\2\u0088\22"+
		"\3\2\2\2\u0089\u008a\5C\"\2\u008a\u008b\5\61\31\2\u008b\24\3\2\2\2\u008c"+
		"\u008d\5\67\34\2\u008d\u008e\5A!\2\u008e\26\3\2\2\2\u008f\u0090\5=\37"+
		"\2\u0090\u0091\5/\30\2\u0091\u0092\5A!\2\u0092\u0093\5\63\32\2\u0093\u0094"+
		"\5M\'\2\u0094\u0095\5\65\33\2\u0095\30\3\2\2\2\u0096\u009b\5\7\4\2\u0097"+
		"\u009b\5\13\6\2\u0098\u009b\5\17\b\2\u0099\u009b\7\60\2\2\u009a\u0096"+
		"\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\32\3\2\2\2\u009c\u009d\7B\2\2\u009d\34\3\2\2\2\u009e\u00a0\t\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\36\3\2\2\2\u00a3\u00a5\t\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00ac\7)\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b9\7)\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3\13\2"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7$"+
		"\2\2\u00b8\u00a8\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b9\"\3\2\2\2\u00ba\u00bc"+
		"\7\17\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\u00be\7\f\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\22\2\2\u00c0$\3"+
		"\2\2\2\u00c1\u00c3\t\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\23"+
		"\2\2\u00c7&\3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9(\3\2\2\2\u00ca\u00cb\t\6"+
		"\2\2\u00cb*\3\2\2\2\u00cc\u00cd\t\7\2\2\u00cd,\3\2\2\2\u00ce\u00cf\t\b"+
		"\2\2\u00cf.\3\2\2\2\u00d0\u00d1\t\t\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\t"+
		"\n\2\2\u00d3\62\3\2\2\2\u00d4\u00d5\t\13\2\2\u00d5\64\3\2\2\2\u00d6\u00d7"+
		"\t\f\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\t\r\2\2\u00d98\3\2\2\2\u00da\u00db"+
		"\t\16\2\2\u00db:\3\2\2\2\u00dc\u00dd\t\17\2\2\u00dd<\3\2\2\2\u00de\u00df"+
		"\t\20\2\2\u00df>\3\2\2\2\u00e0\u00e1\t\21\2\2\u00e1@\3\2\2\2\u00e2\u00e3"+
		"\t\22\2\2\u00e3B\3\2\2\2\u00e4\u00e5\t\23\2\2\u00e5D\3\2\2\2\u00e6\u00e7"+
		"\t\24\2\2\u00e7F\3\2\2\2\u00e8\u00e9\t\25\2\2\u00e9H\3\2\2\2\u00ea\u00eb"+
		"\t\26\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\t\27\2\2\u00edL\3\2\2\2\u00ee\u00ef"+
		"\t\30\2\2\u00efN\3\2\2\2\u00f0\u00f1\t\31\2\2\u00f1P\3\2\2\2\u00f2\u00f3"+
		"\t\32\2\2\u00f3R\3\2\2\2\u00f4\u00f5\t\33\2\2\u00f5T\3\2\2\2\u00f6\u00f7"+
		"\t\34\2\2\u00f7V\3\2\2\2\u00f8\u00f9\t\35\2\2\u00f9X\3\2\2\2\u00fa\u00fb"+
		"\t\36\2\2\u00fbZ\3\2\2\2\13\2\u009a\u00a1\u00a6\u00ac\u00b4\u00b8\u00bb"+
		"\u00c4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}