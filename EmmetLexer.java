// Generated from Emmet.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TAG=5, SYMBOL=6, TAG_LINKER=7, ATTRIBUTE=8, 
		ATTRIBUTE_FREE_TEXT=9, FREE_TEXT=10, LETTER=11, DIGIT=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "TAG", "SYMBOL", "TAG_LINKER", "ATTRIBUTE", 
		"ATTRIBUTE_FREE_TEXT", "FREE_TEXT", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'['", "'='", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "TAG", "SYMBOL", "TAG_LINKER", "ATTRIBUTE", 
		"ATTRIBUTE_FREE_TEXT", "FREE_TEXT", "LETTER", "DIGIT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\tG\n\t\f\t\16"+
		"\tJ\13\t\3\n\3\n\3\n\6\nO\n\n\r\n\16\nP\3\n\3\n\3\13\3\13\3\13\3\13\6"+
		"\13Y\n\13\r\13\16\13Z\3\13\3\13\3\f\6\f`\n\f\r\f\16\fa\3\r\3\r\3\16\6"+
		"\16g\n\16\r\16\16\16h\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\t\4\2jjrr\4\2ddkk\4\2%&\60\60\4\2-"+
		"-@@\4\2C\\c|\3\2\62;\4\2\13\f\17\17\2~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3"+
		"\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3"+
		"\2\2\2\21C\3\2\2\2\23K\3\2\2\2\25T\3\2\2\2\27_\3\2\2\2\31c\3\2\2\2\33"+
		"f\3\2\2\2\35\36\7,\2\2\36\4\3\2\2\2\37 \7]\2\2 \6\3\2\2\2!\"\7?\2\2\""+
		"\b\3\2\2\2#$\7_\2\2$\n\3\2\2\2%&\7j\2\2&\'\7g\2\2\'(\7c\2\2(>\7f\2\2)"+
		"*\7d\2\2*+\7q\2\2+,\7f\2\2,>\7{\2\2->\t\2\2\2./\7q\2\2/>\7n\2\2\60\61"+
		"\7w\2\2\61>\7n\2\2\62>\t\3\2\2\63\64\7n\2\2\64>\7k\2\2\65>\7c\2\2\66\67"+
		"\7f\2\2\678\7k\2\28>\7x\2\29:\7v\2\2:;\7k\2\2;>\7v\2\2<>\7o\2\2=%\3\2"+
		"\2\2=)\3\2\2\2=-\3\2\2\2=.\3\2\2\2=\60\3\2\2\2=\62\3\2\2\2=\63\3\2\2\2"+
		"=\65\3\2\2\2=\66\3\2\2\2=9\3\2\2\2=<\3\2\2\2>\f\3\2\2\2?@\t\4\2\2@\16"+
		"\3\2\2\2AB\t\5\2\2B\20\3\2\2\2CH\5\27\f\2DG\5\27\f\2EG\5\31\r\2FD\3\2"+
		"\2\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\22\3\2\2\2JH\3\2\2\2KN\7"+
		"$\2\2LO\5\27\f\2MO\5\31\r\2NL\3\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ"+
		"\3\2\2\2QR\3\2\2\2RS\7$\2\2S\24\3\2\2\2TX\7}\2\2UY\5\27\f\2VY\5\31\r\2"+
		"WY\7\"\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[\\\3\2\2\2\\]\7\177\2\2]\26\3\2\2\2^`\t\6\2\2_^\3\2\2\2`a\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2b\30\3\2\2\2cd\t\7\2\2d\32\3\2\2\2eg\t\b\2\2fe\3\2\2\2"+
		"gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\b\16\2\2k\34\3\2\2\2\f\2=F"+
		"HNPXZah\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}