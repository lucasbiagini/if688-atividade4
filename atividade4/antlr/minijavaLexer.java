// Generated from /Users/lucasbiagini/Documents/UFPE/2018.2/Compiladores if688/if688.github.io/atividades/04-MiniJavaAST/src/br/ufpe/cin/if688/minijava/atividade4/minijava.g4 by ANTLR 4.7
package br.ufpe.cin.if688.minijava.atividade4.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class minijavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, EXTENDS=2, PUBLIC=3, STATIC=4, VOID=5, MAIN=6, STRING=7, RETURN=8, 
		IF=9, ELSE=10, WHILE=11, LENGTH=12, NEW=13, TRUE=14, FALSE=15, THIS=16, 
		BOOLEAN=17, INT=18, PRINT_STATEMENT=19, AND=20, NOT=21, OPENING_BRACES=22, 
		CLOSING_BRACES=23, OPENING_PARENTHESIS=24, CLOSING_PARENTHESIS=25, OPENING_BRACKETS=26, 
		CLOSING_BRACKETS=27, SEMICOLON=28, COLON=29, EQUALS=30, LESSTHAN=31, PLUS=32, 
		MINUS=33, TIMES=34, DOT=35, SEP=36, SPACE=37, NEWLINE=38, LETTER=39, ALPHANUMERIC=40, 
		NUMBER=41, DIGIT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"CLASS", "EXTENDS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", "RETURN", 
		"IF", "ELSE", "WHILE", "LENGTH", "NEW", "TRUE", "FALSE", "THIS", "BOOLEAN", 
		"INT", "PRINT_STATEMENT", "AND", "NOT", "OPENING_BRACES", "CLOSING_BRACES", 
		"OPENING_PARENTHESIS", "CLOSING_PARENTHESIS", "OPENING_BRACKETS", "CLOSING_BRACKETS", 
		"SEMICOLON", "COLON", "EQUALS", "LESSTHAN", "PLUS", "MINUS", "TIMES", 
		"DOT", "SEP", "SPACE", "NEWLINE", "LETTER", "ALPHANUMERIC", "NUMBER", 
		"DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'main'", "'String'", null, "'if'", 
		"'else'", "'while'", "'length'", "'new'", "'true'", "'false'", "'this'", 
		"'boolean'", "'int'", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "CLASS", "EXTENDS", "PUBLIC", "STATIC", "VOID", "MAIN", "STRING", 
		"RETURN", "IF", "ELSE", "WHILE", "LENGTH", "NEW", "TRUE", "FALSE", "THIS", 
		"BOOLEAN", "INT", "PRINT_STATEMENT", "AND", "NOT", "OPENING_BRACES", "CLOSING_BRACES", 
		"OPENING_PARENTHESIS", "CLOSING_PARENTHESIS", "OPENING_BRACKETS", "CLOSING_BRACKETS", 
		"SEMICOLON", "COLON", "EQUALS", "LESSTHAN", "PLUS", "MINUS", "TIMES", 
		"DOT", "SEP", "SPACE", "NEWLINE", "LETTER", "ALPHANUMERIC", "NUMBER", 
		"DIGIT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public minijavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "minijava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u01f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2Y\n\2\f\2\16\2\\\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2e\n\2\r\2\16"+
		"\2f\3\3\6\3j\n\3\r\3\16\3k\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3w\n"+
		"\3\r\3\16\3x\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4\u0083\n\4\r\4\16\4\u0084"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u008f\n\5\r\5\16\5\u0090\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\6\6\u0099\n\6\r\6\16\6\u009a\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00b1\n\t"+
		"\r\t\16\t\u00b2\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\7\25\u0100\n\25\f\25\16\25\u0103\13\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0109\n\25\f\25\16\25\u010c\13\25\3\26\7\26\u010f"+
		"\n\26\f\26\16\26\u0112\13\26\3\26\3\26\7\26\u0116\n\26\f\26\16\26\u0119"+
		"\13\26\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27\3\27\3\27\7\27\u0123"+
		"\n\27\f\27\16\27\u0126\13\27\3\30\7\30\u0129\n\30\f\30\16\30\u012c\13"+
		"\30\3\30\3\30\7\30\u0130\n\30\f\30\16\30\u0133\13\30\3\31\7\31\u0136\n"+
		"\31\f\31\16\31\u0139\13\31\3\31\3\31\7\31\u013d\n\31\f\31\16\31\u0140"+
		"\13\31\3\32\7\32\u0143\n\32\f\32\16\32\u0146\13\32\3\32\3\32\7\32\u014a"+
		"\n\32\f\32\16\32\u014d\13\32\3\33\7\33\u0150\n\33\f\33\16\33\u0153\13"+
		"\33\3\33\3\33\7\33\u0157\n\33\f\33\16\33\u015a\13\33\3\34\7\34\u015d\n"+
		"\34\f\34\16\34\u0160\13\34\3\34\3\34\7\34\u0164\n\34\f\34\16\34\u0167"+
		"\13\34\3\35\7\35\u016a\n\35\f\35\16\35\u016d\13\35\3\35\3\35\7\35\u0171"+
		"\n\35\f\35\16\35\u0174\13\35\3\36\7\36\u0177\n\36\f\36\16\36\u017a\13"+
		"\36\3\36\3\36\7\36\u017e\n\36\f\36\16\36\u0181\13\36\3\37\7\37\u0184\n"+
		"\37\f\37\16\37\u0187\13\37\3\37\3\37\7\37\u018b\n\37\f\37\16\37\u018e"+
		"\13\37\3 \7 \u0191\n \f \16 \u0194\13 \3 \3 \7 \u0198\n \f \16 \u019b"+
		"\13 \3!\7!\u019e\n!\f!\16!\u01a1\13!\3!\3!\7!\u01a5\n!\f!\16!\u01a8\13"+
		"!\3\"\7\"\u01ab\n\"\f\"\16\"\u01ae\13\"\3\"\3\"\7\"\u01b2\n\"\f\"\16\""+
		"\u01b5\13\"\3#\7#\u01b8\n#\f#\16#\u01bb\13#\3#\3#\7#\u01bf\n#\f#\16#\u01c2"+
		"\13#\3$\7$\u01c5\n$\f$\16$\u01c8\13$\3$\3$\7$\u01cc\n$\f$\16$\u01cf\13"+
		"$\3%\3%\5%\u01d3\n%\3&\3&\3\'\3\'\3\'\5\'\u01da\n\'\3(\5(\u01dd\n(\3)"+
		"\3)\3)\7)\u01e2\n)\f)\16)\u01e5\13)\3*\3*\3*\7*\u01ea\n*\f*\16*\u01ed"+
		"\13*\5*\u01ef\n*\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\4\4\2\f\f\17"+
		"\17\4\2C\\c|\2\u021f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3Z\3\2\2\2\5i\3\2\2\2\7z\3\2\2\2\t\u0086"+
		"\3\2\2\2\13\u0092\3\2\2\2\r\u009c\3\2\2\2\17\u00a1\3\2\2\2\21\u00a8\3"+
		"\2\2\2\23\u00b4\3\2\2\2\25\u00b7\3\2\2\2\27\u00bc\3\2\2\2\31\u00c2\3\2"+
		"\2\2\33\u00c9\3\2\2\2\35\u00cd\3\2\2\2\37\u00d2\3\2\2\2!\u00d8\3\2\2\2"+
		"#\u00dd\3\2\2\2%\u00e5\3\2\2\2\'\u00e9\3\2\2\2)\u0101\3\2\2\2+\u0110\3"+
		"\2\2\2-\u011d\3\2\2\2/\u012a\3\2\2\2\61\u0137\3\2\2\2\63\u0144\3\2\2\2"+
		"\65\u0151\3\2\2\2\67\u015e\3\2\2\29\u016b\3\2\2\2;\u0178\3\2\2\2=\u0185"+
		"\3\2\2\2?\u0192\3\2\2\2A\u019f\3\2\2\2C\u01ac\3\2\2\2E\u01b9\3\2\2\2G"+
		"\u01c6\3\2\2\2I\u01d2\3\2\2\2K\u01d4\3\2\2\2M\u01d9\3\2\2\2O\u01dc\3\2"+
		"\2\2Q\u01de\3\2\2\2S\u01ee\3\2\2\2U\u01f0\3\2\2\2WY\5I%\2XW\3\2\2\2Y\\"+
		"\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7e\2\2^_\7n\2\2_`"+
		"\7c\2\2`a\7u\2\2ab\7u\2\2bd\3\2\2\2ce\5I%\2dc\3\2\2\2ef\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\4\3\2\2\2hj\5I%\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mn\7g\2\2no\7z\2\2op\7v\2\2pq\7g\2\2qr\7p\2\2rs\7f\2\2s"+
		"t\7u\2\2tv\3\2\2\2uw\5I%\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\6"+
		"\3\2\2\2z{\7r\2\2{|\7w\2\2|}\7d\2\2}~\7n\2\2~\177\7k\2\2\177\u0080\7e"+
		"\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5I%\2\u0082\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\b\3\2\2\2\u0086"+
		"\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2"+
		"\u008a\u008b\7k\2\2\u008b\u008c\7e\2\2\u008c\u008e\3\2\2\2\u008d\u008f"+
		"\5I%\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\n\3\2\2\2\u0092\u0093\7X\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7k\2\2\u0095\u0096\7f\2\2\u0096\u0098\3\2\2\2\u0097\u0099\5I%\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\f\3\2\2\2\u009c\u009d\7o\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7k\2\2\u009f\u00a0\7p\2\2\u00a0\16\3\2\2\2\u00a1\u00a2\7U\2\2\u00a2\u00a3"+
		"\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6"+
		"\u00a7\7i\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00b0\3\2\2\2\u00af\u00b1\5I%\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\22\3\2\2\2\u00b4"+
		"\u00b5\7k\2\2\u00b5\u00b6\7h\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7g\2\2\u00bb\26\3\2\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1\30\3\2\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7"+
		"g\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7i\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8"+
		"\7j\2\2\u00c8\32\3\2\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7y\2\2\u00cc\34\3\2\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0"+
		"\7w\2\2\u00d0\u00d1\7g\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4"+
		"\7c\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		" \3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7d\2\2\u00de\u00df\7q\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7c\2\2"+
		"\u00e3\u00e4\7p\2\2\u00e4$\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2"+
		"\2\u00e7\u00e8\7v\2\2\u00e8&\3\2\2\2\u00e9\u00ea\7U\2\2\u00ea\u00eb\7"+
		"{\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7v\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef"+
		"\7o\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5G$\2\u00f1\u00f2\7q\2\2\u00f2"+
		"\u00f3\7w\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\5G$\2"+
		"\u00f6\u00f7\7r\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7p\2\2\u00fd"+
		"(\3\2\2\2\u00fe\u0100\5I%\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0105\7(\2\2\u0105\u0106\7(\2\2\u0106\u010a\3\2\2\2\u0107\u0109"+
		"\5I%\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b*\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010f\5I%\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0117\7#\2\2\u0114"+
		"\u0116\5I%\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118,\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c"+
		"\5I%\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0124\7}"+
		"\2\2\u0121\u0123\5I%\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125.\3\2\2\2\u0126\u0124\3\2\2\2\u0127"+
		"\u0129\5I%\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2"+
		"\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u0131"+
		"\7\177\2\2\u012e\u0130\5I%\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\60\3\2\2\2\u0133\u0131\3\2\2"+
		"\2\u0134\u0136\5I%\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a"+
		"\u013e\7*\2\2\u013b\u013d\5I%\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\62\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0143\5I%\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144"+
		"\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0147\u014b\7+\2\2\u0148\u014a\5I%\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\64\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0150\5I%\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2"+
		"\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0158\7]\2\2\u0155\u0157\5I%\2\u0156\u0155\3\2\2\2\u0157"+
		"\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\66\3\2\2"+
		"\2\u015a\u0158\3\2\2\2\u015b\u015d\5I%\2\u015c\u015b\3\2\2\2\u015d\u0160"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\u0165\7_\2\2\u0162\u0164\5I%\2\u0163\u0162\3\2\2"+
		"\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u01668"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\5I%\2\u0169\u0168\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u0172\7=\2\2\u016f\u0171\5I%\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		":\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0177\5I%\2\u0176\u0175\3\2\2\2\u0177"+
		"\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0178\3\2\2\2\u017b\u017f\7.\2\2\u017c\u017e\5I%\2\u017d\u017c"+
		"\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"<\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0184\5I%\2\u0183\u0182\3\2\2\2\u0184"+
		"\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0188\u018c\7?\2\2\u0189\u018b\5I%\2\u018a\u0189"+
		"\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		">\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\5I%\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0199\7>\2\2\u0196\u0198\5I%\2\u0197\u0196"+
		"\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"@\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019e\5I%\2\u019d\u019c\3\2\2\2\u019e"+
		"\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a6\7-\2\2\u01a3\u01a5\5I%\2\u01a4\u01a3"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"B\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\5I%\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\7/\2\2\u01b0\u01b2\5I%\2\u01b1\u01b0"+
		"\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"D\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b8\5I%\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c0\7,\2\2\u01bd\u01bf\5I%\2\u01be\u01bd"+
		"\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"F\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c5\5I%\2\u01c4\u01c3\3\2\2\2\u01c5"+
		"\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2"+
		"\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cd\7\60\2\2\u01ca\u01cc\5I%\2\u01cb"+
		"\u01ca\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ceH\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\5M\'\2\u01d1\u01d3"+
		"\5K&\2\u01d2\u01d0\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3J\3\2\2\2\u01d4\u01d5"+
		"\7\"\2\2\u01d5L\3\2\2\2\u01d6\u01d7\7\17\2\2\u01d7\u01da\7\f\2\2\u01d8"+
		"\u01da\t\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d8\3\2\2\2\u01daN\3\2\2\2"+
		"\u01db\u01dd\t\3\2\2\u01dc\u01db\3\2\2\2\u01ddP\3\2\2\2\u01de\u01e3\5"+
		"O(\2\u01df\u01e2\5O(\2\u01e0\u01e2\5U+\2\u01e1\u01df\3\2\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"R\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ef\7\62\2\2\u01e7\u01eb\4\63;\2"+
		"\u01e8\u01ea\5U+\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01e6\3\2\2\2\u01ee\u01e7\3\2\2\2\u01efT\3\2\2\2\u01f0\u01f1\4\62;\2"+
		"\u01f1V\3\2\2\2\62\2Zfkx\u0084\u0090\u009a\u00b2\u0101\u010a\u0110\u0117"+
		"\u011d\u0124\u012a\u0131\u0137\u013e\u0144\u014b\u0151\u0158\u015e\u0165"+
		"\u016b\u0172\u0178\u017f\u0185\u018c\u0192\u0199\u019f\u01a6\u01ac\u01b3"+
		"\u01b9\u01c0\u01c6\u01cd\u01d2\u01d9\u01dc\u01e1\u01e3\u01eb\u01ee\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}