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
		T__0=1, T__1=2, T__2=3, T__3=4, TAG=5, SYMBOL=6, HREF=7, TAG_LINKER=8, 
		ATTRIBUTE=9, HREFATTRIBUTE=10, ATTRIBUTE_FREE_TEXT=11, FREE_TEXT=12, LETTER=13, 
		DIGIT=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "TAG", "SYMBOL", "HREF", "TAG_LINKER", 
		"ATTRIBUTE", "HREFATTRIBUTE", "ATTRIBUTE_FREE_TEXT", "FREE_TEXT", "LETTER", 
		"DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'['", "'='", "']'", null, null, "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "TAG", "SYMBOL", "HREF", "TAG_LINKER", "ATTRIBUTE", 
		"HREFATTRIBUTE", "ATTRIBUTE_FREE_TEXT", "FREE_TEXT", "LETTER", "DIGIT", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6B\n\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\13\3\13\3\13\3\13\7\13V\n"+
		"\13\f\13\16\13Y\13\13\3\13\3\13\6\13]\n\13\r\13\16\13^\3\13\3\13\3\f\3"+
		"\f\3\f\6\ff\n\f\r\f\16\fg\3\f\3\f\3\r\3\r\3\r\3\r\6\rp\n\r\r\r\16\rq\3"+
		"\r\3\r\3\16\6\16w\n\16\r\16\16\16x\3\17\3\17\3\20\6\20~\n\20\r\20\16\20"+
		"\177\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21\3\2\t\4\2jjrr\4\2ddkk\4\2%%\60\60\4\2--@@\4"+
		"\2C\\c|\3\2\62;\4\2\13\f\17\17\2\u0098\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13A\3"+
		"\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25Q\3\2\2\2\27b"+
		"\3\2\2\2\31k\3\2\2\2\33v\3\2\2\2\35z\3\2\2\2\37}\3\2\2\2!\"\7,\2\2\"\4"+
		"\3\2\2\2#$\7]\2\2$\6\3\2\2\2%&\7?\2\2&\b\3\2\2\2\'(\7_\2\2(\n\3\2\2\2"+
		")*\7j\2\2*+\7g\2\2+,\7c\2\2,B\7f\2\2-.\7d\2\2./\7q\2\2/\60\7f\2\2\60B"+
		"\7{\2\2\61B\t\2\2\2\62\63\7q\2\2\63B\7n\2\2\64\65\7w\2\2\65B\7n\2\2\66"+
		"B\t\3\2\2\678\7n\2\28B\7k\2\29B\7c\2\2:;\7f\2\2;<\7k\2\2<B\7x\2\2=>\7"+
		"v\2\2>?\7k\2\2?B\7v\2\2@B\7o\2\2A)\3\2\2\2A-\3\2\2\2A\61\3\2\2\2A\62\3"+
		"\2\2\2A\64\3\2\2\2A\66\3\2\2\2A\67\3\2\2\2A9\3\2\2\2A:\3\2\2\2A=\3\2\2"+
		"\2A@\3\2\2\2B\f\3\2\2\2CD\t\4\2\2D\16\3\2\2\2EF\7&\2\2F\20\3\2\2\2GH\t"+
		"\5\2\2H\22\3\2\2\2IN\5\33\16\2JM\5\33\16\2KM\5\35\17\2LJ\3\2\2\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\24\3\2\2\2PN\3\2\2\2QR\7`\2\2RW\5"+
		"\33\16\2SV\5\33\16\2TV\5\35\17\2US\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2"+
		"\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z\\\7\60\2\2[]\5\33\16\2\\[\3\2\2\2]^"+
		"\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7`\2\2a\26\3\2\2\2be\7$\2\2"+
		"cf\5\33\16\2df\5\35\17\2ec\3\2\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2"+
		"\2\2hi\3\2\2\2ij\7$\2\2j\30\3\2\2\2ko\7}\2\2lp\5\33\16\2mp\5\35\17\2n"+
		"p\7\"\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rs\3\2\2\2st\7\177\2\2t\32\3\2\2\2uw\t\6\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2"+
		"\2\2xy\3\2\2\2y\34\3\2\2\2z{\t\7\2\2{\36\3\2\2\2|~\t\b\2\2}|\3\2\2\2~"+
		"\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\b\20\2\2\u0082 \3\2\2\2\17\2ALNUW^egoqx\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}