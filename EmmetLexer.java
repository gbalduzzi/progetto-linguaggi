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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TAG=6, SYMBOL=7, TAG_LINKER=8, 
		ATTRIBUTE=9, ATTRIBUTE_FREE_TEXT=10, FREE_TEXT=11, LETTER=12, DIGIT=13, 
		WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "TAG", "SYMBOL", "TAG_LINKER", 
		"ATTRIBUTE", "ATTRIBUTE_FREE_TEXT", "FREE_TEXT", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'*'", "'['", "'='", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "TAG", "SYMBOL", "TAG_LINKER", "ATTRIBUTE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20o\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\7\nK\n\n\f\n\16\nN\13\n\3\13\3\13\3\13\6\13S\n\13\r\13\16\13T\3\13"+
		"\3\13\3\f\3\f\3\f\6\f\\\n\f\r\f\16\f]\3\f\3\f\3\r\6\rc\n\r\r\r\16\rd\3"+
		"\16\3\16\3\17\6\17j\n\17\r\17\16\17k\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\t\4\2jjrr\4"+
		"\2ddkk\4\2%&\60\60\4\2--@@\4\2C\\c|\3\2\62;\4\2\13\f\17\17\2\u0080\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2"+
		"\t%\3\2\2\2\13\'\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2"+
		"\2\25O\3\2\2\2\27X\3\2\2\2\31b\3\2\2\2\33f\3\2\2\2\35i\3\2\2\2\37 \7/"+
		"\2\2 \4\3\2\2\2!\"\7,\2\2\"\6\3\2\2\2#$\7]\2\2$\b\3\2\2\2%&\7?\2\2&\n"+
		"\3\2\2\2\'(\7_\2\2(\f\3\2\2\2)*\7j\2\2*+\7g\2\2+,\7c\2\2,B\7f\2\2-.\7"+
		"d\2\2./\7q\2\2/\60\7f\2\2\60B\7{\2\2\61B\t\2\2\2\62\63\7q\2\2\63B\7n\2"+
		"\2\64\65\7w\2\2\65B\7n\2\2\66B\t\3\2\2\678\7n\2\28B\7k\2\29B\7c\2\2:;"+
		"\7f\2\2;<\7k\2\2<B\7x\2\2=>\7v\2\2>?\7k\2\2?B\7v\2\2@B\7o\2\2A)\3\2\2"+
		"\2A-\3\2\2\2A\61\3\2\2\2A\62\3\2\2\2A\64\3\2\2\2A\66\3\2\2\2A\67\3\2\2"+
		"\2A9\3\2\2\2A:\3\2\2\2A=\3\2\2\2A@\3\2\2\2B\16\3\2\2\2CD\t\4\2\2D\20\3"+
		"\2\2\2EF\t\5\2\2F\22\3\2\2\2GL\5\31\r\2HK\5\31\r\2IK\5\33\16\2JH\3\2\2"+
		"\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NL\3\2\2\2OR\7$"+
		"\2\2PS\5\31\r\2QS\5\33\16\2RP\3\2\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2UV\3\2\2\2VW\7$\2\2W\26\3\2\2\2X[\7}\2\2Y\\\5\31\r\2Z\\\5\33\16"+
		"\2[Y\3\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\177"+
		"\2\2`\30\3\2\2\2ac\t\6\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\32"+
		"\3\2\2\2fg\t\7\2\2g\34\3\2\2\2hj\t\b\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2"+
		"kl\3\2\2\2lm\3\2\2\2mn\b\17\2\2n\36\3\2\2\2\f\2AJLRT[]dk\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}