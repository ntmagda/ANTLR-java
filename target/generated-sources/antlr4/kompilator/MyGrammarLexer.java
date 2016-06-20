// Generated from MyGrammar.g4 by ANTLR 4.4

	package kompilator;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, SCOL=16, ASSIGN=17, OPAR=18, 
		CPAR=19, OBRACE=20, CBRACE=21, TRUE=22, FALSE=23, NIL=24, IF=25, ELSE=26, 
		ELIF=27, WHILE=28, LOG=29, ID=30, INT=31, FLOAT=32, STRING=33, COMMENT=34, 
		SPACE=35, OTHER=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'"
	};
	public static final String[] ruleNames = {
		"OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "SCOL", "ASSIGN", "OPAR", "CPAR", 
		"OBRACE", "CBRACE", "TRUE", "FALSE", "NIL", "IF", "ELSE", "ELIF", "WHILE", 
		"LOG", "ID", "INT", "FLOAT", "STRING", "COMMENT", "SPACE", "OTHER"
	};


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00dc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\7\37\u00a5\n\37\f\37\16\37\u00a8\13\37\3 \6"+
		" \u00ab\n \r \16 \u00ac\3!\6!\u00b0\n!\r!\16!\u00b1\3!\3!\7!\u00b6\n!"+
		"\f!\16!\u00b9\13!\3!\3!\6!\u00bd\n!\r!\16!\u00be\5!\u00c1\n!\3\"\3\"\3"+
		"\"\3\"\7\"\u00c7\n\"\f\"\16\"\u00ca\13\"\3\"\3\"\3#\3#\7#\u00d0\n#\f#"+
		"\16#\u00d3\13#\3#\3#\3$\3$\3$\3$\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\5\2C"+
		"\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7R\3\2\2\2\tU\3\2\2\2\13"+
		"X\3\2\2\2\rZ\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23b\3\2\2\2\25d\3\2\2\2"+
		"\27f\3\2\2\2\31h\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!p\3\2\2\2"+
		"#r\3\2\2\2%t\3\2\2\2\'v\3\2\2\2)x\3\2\2\2+z\3\2\2\2-|\3\2\2\2/\u0081\3"+
		"\2\2\2\61\u0087\3\2\2\2\63\u008b\3\2\2\2\65\u008e\3\2\2\2\67\u0093\3\2"+
		"\2\29\u0098\3\2\2\2;\u009e\3\2\2\2=\u00a2\3\2\2\2?\u00aa\3\2\2\2A\u00c0"+
		"\3\2\2\2C\u00c2\3\2\2\2E\u00cd\3\2\2\2G\u00d6\3\2\2\2I\u00da\3\2\2\2K"+
		"L\7q\2\2LM\7t\2\2M\4\3\2\2\2NO\7c\2\2OP\7p\2\2PQ\7f\2\2Q\6\3\2\2\2RS\7"+
		"?\2\2ST\7?\2\2T\b\3\2\2\2UV\7#\2\2VW\7?\2\2W\n\3\2\2\2XY\7@\2\2Y\f\3\2"+
		"\2\2Z[\7>\2\2[\16\3\2\2\2\\]\7@\2\2]^\7?\2\2^\20\3\2\2\2_`\7>\2\2`a\7"+
		"?\2\2a\22\3\2\2\2bc\7-\2\2c\24\3\2\2\2de\7/\2\2e\26\3\2\2\2fg\7,\2\2g"+
		"\30\3\2\2\2hi\7\61\2\2i\32\3\2\2\2jk\7\'\2\2k\34\3\2\2\2lm\7`\2\2m\36"+
		"\3\2\2\2no\7#\2\2o \3\2\2\2pq\7=\2\2q\"\3\2\2\2rs\7?\2\2s$\3\2\2\2tu\7"+
		"*\2\2u&\3\2\2\2vw\7+\2\2w(\3\2\2\2xy\7}\2\2y*\3\2\2\2z{\7\177\2\2{,\3"+
		"\2\2\2|}\7v\2\2}~\7t\2\2~\177\7w\2\2\177\u0080\7g\2\2\u0080.\3\2\2\2\u0081"+
		"\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2"+
		"\u0085\u0086\7g\2\2\u0086\60\3\2\2\2\u0087\u0088\7p\2\2\u0088\u0089\7"+
		"k\2\2\u0089\u008a\7n\2\2\u008a\62\3\2\2\2\u008b\u008c\7k\2\2\u008c\u008d"+
		"\7h\2\2\u008d\64\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091"+
		"\7u\2\2\u0091\u0092\7g\2\2\u0092\66\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095"+
		"\7n\2\2\u0095\u0096\7k\2\2\u0096\u0097\7h\2\2\u00978\3\2\2\2\u0098\u0099"+
		"\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7g\2\2\u009d:\3\2\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7i\2\2\u00a1<\3\2\2\2\u00a2\u00a6\t\2\2\2\u00a3\u00a5\t\3\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7>\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\t\4\2\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"@\3\2\2\2\u00ae\u00b0\t\4\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7"+
		"\7\60\2\2\u00b4\u00b6\t\4\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2"+
		"\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c1\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bc\7\60\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2"+
		"\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00af\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c1B\3\2\2\2\u00c2"+
		"\u00c8\7$\2\2\u00c3\u00c7\n\5\2\2\u00c4\u00c5\7$\2\2\u00c5\u00c7\7$\2"+
		"\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6"+
		"\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\7$\2\2\u00ccD\3\2\2\2\u00cd\u00d1\7%\2\2\u00ce\u00d0\n\6\2\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b#\2\2\u00d5"+
		"F\3\2\2\2\u00d6\u00d7\t\7\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b$\2\2\u00d9"+
		"H\3\2\2\2\u00da\u00db\13\2\2\2\u00dbJ\3\2\2\2\f\2\u00a6\u00ac\u00b1\u00b7"+
		"\u00be\u00c0\u00c6\u00c8\u00d1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}