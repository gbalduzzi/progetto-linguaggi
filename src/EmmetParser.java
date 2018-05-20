// Generated from Emmet.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmmetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TAG=7, SYMBOL=8, HREF=9, 
		URL_SYMBOLS=10, TAG_LINKER=11, ATTRIBUTE=12, HREFATTRIBUTE=13, ATTRIBUTE_FREE_TEXT=14, 
		FREE_TEXT=15, LETTER=16, DIGIT=17, WS=18;
	public static final int
		RULE_s = 0, RULE_tag_list = 1, RULE_tag_list2 = 2, RULE_mult = 3, RULE_tag = 4, 
		RULE_attr_list = 5, RULE_custom = 6;
	public static final String[] ruleNames = {
		"s", "tag_list", "tag_list2", "mult", "tag", "attr_list", "custom"
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

	@Override
	public String getGrammarFileName() { return "Emmet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EmmetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public Tag_list2Context tag_list2() {
			return getRuleContext(Tag_list2Context.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(16);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				tag_list();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
				tag_list2();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_listContext extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TerminalNode TAG_LINKER() { return getToken(EmmetParser.TAG_LINKER, 0); }
		public Tag_listContext tag_list() {
			return getRuleContext(Tag_listContext.class,0);
		}
		public Tag_list2Context tag_list2() {
			return getRuleContext(Tag_list2Context.class,0);
		}
		public Tag_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterTag_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitTag_list(this);
		}
	}

	public final Tag_listContext tag_list() throws RecognitionException {
		Tag_listContext _localctx = new Tag_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tag_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			tag();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(19);
				mult();
				}
			}

			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_LINKER) {
				{
				setState(22);
				match(TAG_LINKER);
				setState(25);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG:
					{
					setState(23);
					tag_list();
					}
					break;
				case T__0:
					{
					setState(24);
					tag_list2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tag_list2Context extends ParserRuleContext {
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public List<TerminalNode> TAG_LINKER() { return getTokens(EmmetParser.TAG_LINKER); }
		public TerminalNode TAG_LINKER(int i) {
			return getToken(EmmetParser.TAG_LINKER, i);
		}
		public List<Tag_listContext> tag_list() {
			return getRuleContexts(Tag_listContext.class);
		}
		public Tag_listContext tag_list(int i) {
			return getRuleContext(Tag_listContext.class,i);
		}
		public List<Tag_list2Context> tag_list2() {
			return getRuleContexts(Tag_list2Context.class);
		}
		public Tag_list2Context tag_list2(int i) {
			return getRuleContext(Tag_list2Context.class,i);
		}
		public Tag_list2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag_list2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterTag_list2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitTag_list2(this);
		}
	}

	public final Tag_list2Context tag_list2() throws RecognitionException {
		Tag_list2Context _localctx = new Tag_list2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_tag_list2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__0);
			setState(30);
			tag();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(31);
				mult();
				}
			}

			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_LINKER) {
				{
				setState(34);
				match(TAG_LINKER);
				setState(37);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG:
					{
					setState(35);
					tag_list();
					}
					break;
				case T__0:
					{
					setState(36);
					tag_list2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(41);
			match(T__1);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_LINKER) {
				{
				setState(42);
				match(TAG_LINKER);
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG:
					{
					setState(43);
					tag_list();
					}
					break;
				case T__0:
					{
					setState(44);
					tag_list2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(EmmetParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(EmmetParser.DIGIT, i);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				match(DIGIT);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagContext extends ParserRuleContext {
		public TerminalNode TAG() { return getToken(EmmetParser.TAG, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(TAG);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << SYMBOL) | (1L << HREF) | (1L << FREE_TEXT))) != 0)) {
				{
				setState(56);
				attr_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attr_listContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(EmmetParser.SYMBOL, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(EmmetParser.ATTRIBUTE, 0); }
		public CustomContext custom() {
			return getRuleContext(CustomContext.class,0);
		}
		public TerminalNode FREE_TEXT() { return getToken(EmmetParser.FREE_TEXT, 0); }
		public TerminalNode HREF() { return getToken(EmmetParser.HREF, 0); }
		public TerminalNode HREFATTRIBUTE() { return getToken(EmmetParser.HREFATTRIBUTE, 0); }
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterAttr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitAttr_list(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				{
				setState(59);
				match(SYMBOL);
				setState(60);
				match(ATTRIBUTE);
				}
				break;
			case T__3:
				{
				setState(61);
				custom();
				}
				break;
			case FREE_TEXT:
				{
				setState(62);
				match(FREE_TEXT);
				}
				break;
			case HREF:
				{
				setState(63);
				match(HREF);
				setState(64);
				match(HREFATTRIBUTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << SYMBOL) | (1L << HREF) | (1L << FREE_TEXT))) != 0)) {
				{
				setState(67);
				attr_list();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CustomContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(EmmetParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTE_FREE_TEXT() { return getToken(EmmetParser.ATTRIBUTE_FREE_TEXT, 0); }
		public CustomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_custom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).enterCustom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EmmetListener ) ((EmmetListener)listener).exitCustom(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__3);
			setState(71);
			match(ATTRIBUTE);
			setState(72);
			match(T__4);
			setState(73);
			match(ATTRIBUTE_FREE_TEXT);
			setState(74);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\5\2\23\n\2\3\3\3\3"+
		"\5\3\27\n\3\3\3\3\3\3\3\5\3\34\n\3\5\3\36\n\3\3\4\3\4\3\4\5\4#\n\4\3\4"+
		"\3\4\3\4\5\4(\n\4\5\4*\n\4\3\4\3\4\3\4\3\4\5\4\60\n\4\5\4\62\n\4\3\5\3"+
		"\5\6\5\66\n\5\r\5\16\5\67\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"D\n\7\3\7\5\7G\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2"+
		"\2\2V\2\22\3\2\2\2\4\24\3\2\2\2\6\37\3\2\2\2\b\63\3\2\2\2\n9\3\2\2\2\f"+
		"C\3\2\2\2\16H\3\2\2\2\20\23\5\4\3\2\21\23\5\6\4\2\22\20\3\2\2\2\22\21"+
		"\3\2\2\2\23\3\3\2\2\2\24\26\5\n\6\2\25\27\5\b\5\2\26\25\3\2\2\2\26\27"+
		"\3\2\2\2\27\35\3\2\2\2\30\33\7\r\2\2\31\34\5\4\3\2\32\34\5\6\4\2\33\31"+
		"\3\2\2\2\33\32\3\2\2\2\34\36\3\2\2\2\35\30\3\2\2\2\35\36\3\2\2\2\36\5"+
		"\3\2\2\2\37 \7\3\2\2 \"\5\n\6\2!#\5\b\5\2\"!\3\2\2\2\"#\3\2\2\2#)\3\2"+
		"\2\2$\'\7\r\2\2%(\5\4\3\2&(\5\6\4\2\'%\3\2\2\2\'&\3\2\2\2(*\3\2\2\2)$"+
		"\3\2\2\2)*\3\2\2\2*+\3\2\2\2+\61\7\4\2\2,/\7\r\2\2-\60\5\4\3\2.\60\5\6"+
		"\4\2/-\3\2\2\2/.\3\2\2\2\60\62\3\2\2\2\61,\3\2\2\2\61\62\3\2\2\2\62\7"+
		"\3\2\2\2\63\65\7\5\2\2\64\66\7\23\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65"+
		"\3\2\2\2\678\3\2\2\28\t\3\2\2\29;\7\t\2\2:<\5\f\7\2;:\3\2\2\2;<\3\2\2"+
		"\2<\13\3\2\2\2=>\7\n\2\2>D\7\16\2\2?D\5\16\b\2@D\7\21\2\2AB\7\13\2\2B"+
		"D\7\17\2\2C=\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2DF\3\2\2\2EG\5\f\7\2"+
		"FE\3\2\2\2FG\3\2\2\2G\r\3\2\2\2HI\7\6\2\2IJ\7\16\2\2JK\7\7\2\2KL\7\20"+
		"\2\2LM\7\b\2\2M\17\3\2\2\2\17\22\26\33\35\"\')/\61\67;CF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}