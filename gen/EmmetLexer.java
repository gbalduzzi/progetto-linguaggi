// Generated from /home/dariofad/prog_LC/progetto-linguaggi/Emmet.g4 by ANTLR 4.7

package myCompiler;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TAG=7, SYMBOL=8, TAG_LINKER=9, 
		FREE_TEXT=10, ATTRIBUTE=11, LETTER=12, DIGIT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "TAG", "SYMBOL", "TAG_LINKER", 
		"FREE_TEXT", "ATTRIBUTE", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'{'", "'}'", "'['", "'='", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "TAG", "SYMBOL", "TAG_LINKER", 
		"FREE_TEXT", "ATTRIBUTE", "LETTER", "DIGIT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\6\13L\n\13\r\13\16\13M\3\f\3\f\3\f\7\fS\n\f\f\f\16\fV\13\f"+
		"\3\r\6\rY\n\r\r\r\16\rZ\3\16\3\16\3\17\6\17`\n\17\r\17\16\17a\3\17\3\17"+
		"\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\3\2\t\4\2jjrr\4\2ddkk\4\2%&\60\60\4\2--@@\4\2C\\c|\3\2\62;\4\2"+
		"\13\f\17\17\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3"+
		"\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17C\3\2\2\2\21E\3"+
		"\2\2\2\23G\3\2\2\2\25K\3\2\2\2\27O\3\2\2\2\31X\3\2\2\2\33\\\3\2\2\2\35"+
		"_\3\2\2\2\37 \7,\2\2 \4\3\2\2\2!\"\7}\2\2\"\6\3\2\2\2#$\7\177\2\2$\b\3"+
		"\2\2\2%&\7]\2\2&\n\3\2\2\2\'(\7?\2\2(\f\3\2\2\2)*\7_\2\2*\16\3\2\2\2+"+
		",\7j\2\2,-\7g\2\2-.\7c\2\2.D\7f\2\2/\60\7d\2\2\60\61\7q\2\2\61\62\7f\2"+
		"\2\62D\7{\2\2\63D\t\2\2\2\64\65\7q\2\2\65D\7n\2\2\66\67\7w\2\2\67D\7n"+
		"\2\28D\t\3\2\29:\7n\2\2:D\7k\2\2;D\7c\2\2<=\7f\2\2=>\7k\2\2>D\7x\2\2?"+
		"@\7v\2\2@A\7k\2\2AD\7v\2\2BD\7o\2\2C+\3\2\2\2C/\3\2\2\2C\63\3\2\2\2C\64"+
		"\3\2\2\2C\66\3\2\2\2C8\3\2\2\2C9\3\2\2\2C;\3\2\2\2C<\3\2\2\2C?\3\2\2\2"+
		"CB\3\2\2\2D\20\3\2\2\2EF\t\4\2\2F\22\3\2\2\2GH\t\5\2\2H\24\3\2\2\2IL\5"+
		"\31\r\2JL\5\33\16\2KI\3\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"N\26\3\2\2\2OT\5\31\r\2PS\5\31\r\2QS\5\33\16\2RP\3\2\2\2RQ\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2U\30\3\2\2\2VT\3\2\2\2WY\t\6\2\2XW\3\2\2\2Y"+
		"Z\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\32\3\2\2\2\\]\t\7\2\2]\34\3\2\2\2^`\t\b"+
		"\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\17\2\2d\36"+
		"\3\2\2\2\n\2CKMRTZa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}