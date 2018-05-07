// Generated from /home/dariofad/prog_LC/progetto-linguaggi/Emmet.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, TAG=7, SYMBOL=8, TAG_LINKER=9, 
		FREE_TEXT=10, ATTRIBUTE=11, LETTER=12, DIGIT=13, WS=14;
	public static final int
		RULE_s = 0, RULE_tag_list = 1, RULE_mult = 2, RULE_tag = 3, RULE_attr_list = 4, 
		RULE_custom = 5;
	public static final String[] ruleNames = {
		"s", "tag_list", "mult", "tag", "attr_list", "custom"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			tag_list();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitTag_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tag_listContext tag_list() throws RecognitionException {
		Tag_listContext _localctx = new Tag_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tag_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(14);
			tag();
			setState(15);
			mult();
			setState(16);
			match(TAG_LINKER);
			setState(17);
			tag_list();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__0);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				match(DIGIT);
				}
				}
				setState(23); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(TAG);
			setState(26);
			attr_list();
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
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode SYMBOL() { return getToken(EmmetParser.SYMBOL, 0); }
		public TerminalNode FREE_TEXT() { return getToken(EmmetParser.FREE_TEXT, 0); }
		public CustomContext custom() {
			return getRuleContext(CustomContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitAttr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYMBOL:
				{
				setState(28);
				match(SYMBOL);
				setState(29);
				match(FREE_TEXT);
				}
				break;
			case T__3:
				{
				setState(30);
				custom();
				}
				break;
			case T__1:
				{
				setState(31);
				match(T__1);
				setState(32);
				match(FREE_TEXT);
				setState(33);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(36);
			attr_list();
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
		public TerminalNode FREE_TEXT() { return getToken(EmmetParser.FREE_TEXT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EmmetVisitor ) return ((EmmetVisitor<? extends T>)visitor).visitCustom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomContext custom() throws RecognitionException {
		CustomContext _localctx = new CustomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_custom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__3);
			setState(39);
			match(ATTRIBUTE);
			setState(40);
			match(T__4);
			setState(41);
			match(FREE_TEXT);
			setState(42);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\6\4\30\n\4\r\4\16\4\31\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6%\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2+\2\16\3\2\2"+
		"\2\4\20\3\2\2\2\6\25\3\2\2\2\b\33\3\2\2\2\n$\3\2\2\2\f(\3\2\2\2\16\17"+
		"\5\4\3\2\17\3\3\2\2\2\20\21\5\b\5\2\21\22\5\6\4\2\22\23\7\13\2\2\23\24"+
		"\5\4\3\2\24\5\3\2\2\2\25\27\7\3\2\2\26\30\7\17\2\2\27\26\3\2\2\2\30\31"+
		"\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2\2\2\33\34\7\t\2\2\34\35"+
		"\5\n\6\2\35\t\3\2\2\2\36\37\7\n\2\2\37%\7\f\2\2 %\5\f\7\2!\"\7\4\2\2\""+
		"#\7\f\2\2#%\7\5\2\2$\36\3\2\2\2$ \3\2\2\2$!\3\2\2\2%&\3\2\2\2&\'\5\n\6"+
		"\2\'\13\3\2\2\2()\7\6\2\2)*\7\r\2\2*+\7\7\2\2+,\7\f\2\2,-\7\b\2\2-\r\3"+
		"\2\2\2\4\31$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}