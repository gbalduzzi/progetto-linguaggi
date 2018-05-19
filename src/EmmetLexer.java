// Generated from /home/gbalduzzi/Code/progetto-linguaggi/Emmet.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmmetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TAG=7, SYMBOL=8, HREF=9, 
		URL_SYMBOLS=10, TAG_LINKER=11, ATTRIBUTE=12, HREFATTRIBUTE=13, ATTRIBUTE_FREE_TEXT=14, 
		FREE_TEXT=15, LETTER=16, DIGIT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TAG", "SYMBOL", "HREF", 
		"URL_SYMBOLS", "TAG_LINKER", "ATTRIBUTE", "HREFATTRIBUTE", "ATTRIBUTE_FREE_TEXT", 
		"FREE_TEXT", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'*'", "'['", "'='", "']'", null, null, "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TAG", "SYMBOL", "HREF", "URL_SYMBOLS", 
		"TAG_LINKER", "ATTRIBUTE", "HREFATTRIBUTE", "ATTRIBUTE_FREE_TEXT", "FREE_TEXT", 
		"LETTER", "DIGIT", "WS"
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


	public EmmetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Emmet.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\16\3\16\3\16\3\16\6\16"+
		"f\n\16\r\16\16\16g\3\16\3\16\3\17\3\17\3\17\6\17o\n\17\r\17\16\17p\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\6\20y\n\20\r\20\16\20z\3\20\3\20\3\21\6\21\u0080"+
		"\n\21\r\21\16\21\u0081\3\22\3\22\3\23\6\23\u0087\n\23\r\23\16\23\u0088"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\n\4\2jjrr\4\2ddkk\4\2%%\60\60\6"+
		"\2((\60\61<<AA\4\2--@@\4\2C\\c|\3\2\62;\4\2\13\f\17\17\2\u00a2\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3"+
		"\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31"+
		"Y\3\2\2\2\33a\3\2\2\2\35k\3\2\2\2\37t\3\2\2\2!\177\3\2\2\2#\u0083\3\2"+
		"\2\2%\u0086\3\2\2\2\'(\7*\2\2(\4\3\2\2\2)*\7+\2\2*\6\3\2\2\2+,\7,\2\2"+
		",\b\3\2\2\2-.\7]\2\2.\n\3\2\2\2/\60\7?\2\2\60\f\3\2\2\2\61\62\7_\2\2\62"+
		"\16\3\2\2\2\63\64\7j\2\2\64\65\7g\2\2\65\66\7c\2\2\66P\7f\2\2\678\7d\2"+
		"\289\7q\2\29:\7f\2\2:P\7{\2\2;<\7n\2\2<=\7k\2\2=>\7p\2\2>P\7m\2\2?P\t"+
		"\2\2\2@A\7q\2\2AP\7n\2\2BC\7w\2\2CP\7n\2\2DP\t\3\2\2EF\7n\2\2FP\7k\2\2"+
		"GP\7c\2\2HI\7f\2\2IJ\7k\2\2JP\7x\2\2KL\7v\2\2LM\7k\2\2MP\7v\2\2NP\7o\2"+
		"\2O\63\3\2\2\2O\67\3\2\2\2O;\3\2\2\2O?\3\2\2\2O@\3\2\2\2OB\3\2\2\2OD\3"+
		"\2\2\2OE\3\2\2\2OG\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\20\3\2\2\2Q"+
		"R\t\4\2\2R\22\3\2\2\2ST\7&\2\2T\24\3\2\2\2UV\t\5\2\2V\26\3\2\2\2WX\t\6"+
		"\2\2X\30\3\2\2\2Y^\5!\21\2Z]\5!\21\2[]\5#\22\2\\Z\3\2\2\2\\[\3\2\2\2]"+
		"`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\32\3\2\2\2`^\3\2\2\2ae\7`\2\2bf\5!\21"+
		"\2cf\5#\22\2df\5\25\13\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hi\3\2\2\2ij\7`\2\2j\34\3\2\2\2kn\7$\2\2lo\5!\21\2mo\5#"+
		"\22\2nl\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7"+
		"$\2\2s\36\3\2\2\2tx\7}\2\2uy\5!\21\2vy\5#\22\2wy\7\"\2\2xu\3\2\2\2xv\3"+
		"\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\177\2\2}"+
		" \3\2\2\2~\u0080\t\7\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\"\3\2\2\2\u0083\u0084\t\b\2\2\u0084$"+
		"\3\2\2\2\u0085\u0087\t\t\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\23"+
		"\2\2\u008b&\3\2\2\2\16\2O\\^egnpxz\u0081\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}