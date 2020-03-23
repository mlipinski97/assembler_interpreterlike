// Generated from D:/WAT/java/lipinski_maciej_jfk_1/src/main/antlr4\jfkgrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jfkgrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, INT=8, PUSH=9, 
		MOV=10, XOR=11, NUMBER=12, REGISTER=13, WHITE_SPACE=14, IDENTIFIER=15;
	public static final int
		RULE_full_line = 0, RULE_command_push = 1, RULE_command_int0x80 = 2, RULE_command_xor = 3, 
		RULE_command_mov = 4, RULE_sipmle_operation = 5, RULE_operation = 6, RULE_factor = 7, 
		RULE_term = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"full_line", "command_push", "command_int0x80", "command_xor", "command_mov", 
			"sipmle_operation", "operation", "factor", "term"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "', '", "'+'", "'-'", "'('", "')'", "'*'", "'/'", "'int 0x80'", 
			"'push'", "'mov'", "'xor'", null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "INT", "PUSH", "MOV", 
			"XOR", "NUMBER", "REGISTER", "WHITE_SPACE", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "jfkgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jfkgrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Full_lineContext extends ParserRuleContext {
		public Command_pushContext command_push() {
			return getRuleContext(Command_pushContext.class,0);
		}
		public TerminalNode WHITE_SPACE() { return getToken(jfkgrammarParser.WHITE_SPACE, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public Command_int0x80Context command_int0x80() {
			return getRuleContext(Command_int0x80Context.class,0);
		}
		public Command_movContext command_mov() {
			return getRuleContext(Command_movContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(jfkgrammarParser.REGISTER, 0); }
		public Command_xorContext command_xor() {
			return getRuleContext(Command_xorContext.class,0);
		}
		public Full_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterFull_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitFull_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitFull_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_lineContext full_line() throws RecognitionException {
		Full_lineContext _localctx = new Full_lineContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_full_line);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				command_push();
				setState(19);
				match(WHITE_SPACE);
				setState(20);
				operation(0);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				command_int0x80();
				}
				break;
			case MOV:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				command_mov();
				setState(24);
				match(WHITE_SPACE);
				setState(25);
				operation(0);
				setState(26);
				match(T__0);
				setState(27);
				match(REGISTER);
				}
				break;
			case XOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				command_xor();
				setState(30);
				match(WHITE_SPACE);
				setState(31);
				operation(0);
				setState(32);
				match(T__0);
				setState(33);
				match(REGISTER);
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

	public static class Command_pushContext extends ParserRuleContext {
		public TerminalNode PUSH() { return getToken(jfkgrammarParser.PUSH, 0); }
		public Command_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterCommand_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitCommand_push(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitCommand_push(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_pushContext command_push() throws RecognitionException {
		Command_pushContext _localctx = new Command_pushContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PUSH);
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

	public static class Command_int0x80Context extends ParserRuleContext {
		public TerminalNode INT() { return getToken(jfkgrammarParser.INT, 0); }
		public Command_int0x80Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_int0x80; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterCommand_int0x80(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitCommand_int0x80(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitCommand_int0x80(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_int0x80Context command_int0x80() throws RecognitionException {
		Command_int0x80Context _localctx = new Command_int0x80Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_command_int0x80);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INT);
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

	public static class Command_xorContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(jfkgrammarParser.XOR, 0); }
		public Command_xorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_xor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterCommand_xor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitCommand_xor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitCommand_xor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_xorContext command_xor() throws RecognitionException {
		Command_xorContext _localctx = new Command_xorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(XOR);
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

	public static class Command_movContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(jfkgrammarParser.MOV, 0); }
		public Command_movContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterCommand_mov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitCommand_mov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitCommand_mov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Command_movContext command_mov() throws RecognitionException {
		Command_movContext _localctx = new Command_movContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command_mov);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(MOV);
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

	public static class Sipmle_operationContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(jfkgrammarParser.REGISTER, 0); }
		public List<TerminalNode> WHITE_SPACE() { return getTokens(jfkgrammarParser.WHITE_SPACE); }
		public TerminalNode WHITE_SPACE(int i) {
			return getToken(jfkgrammarParser.WHITE_SPACE, i);
		}
		public TerminalNode NUMBER() { return getToken(jfkgrammarParser.NUMBER, 0); }
		public Sipmle_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sipmle_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterSipmle_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitSipmle_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitSipmle_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sipmle_operationContext sipmle_operation() throws RecognitionException {
		Sipmle_operationContext _localctx = new Sipmle_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sipmle_operation);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(45);
					match(WHITE_SPACE);
					}
				}

				setState(48);
				match(REGISTER);
				setState(50);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(49);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(52);
					match(WHITE_SPACE);
					}
				}

				setState(55);
				match(NUMBER);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(56);
					match(WHITE_SPACE);
					}
					break;
				}
				}
				break;
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

	public static class OperationContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_operation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_operation);
					setState(64);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(65);
					_la = _input.LA(1);
					if ( !(_la==T__1 || _la==T__2) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(66);
					term(0);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public Sipmle_operationContext sipmle_operation() {
			return getRuleContext(Sipmle_operationContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case REGISTER:
			case WHITE_SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				sipmle_operation();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__3);
				setState(74);
				operation(0);
				setState(75);
				match(T__4);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfkgrammarListener ) ((jfkgrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfkgrammarVisitor ) return ((jfkgrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(82);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(83);
					_la = _input.LA(1);
					if ( !(_la==T__5 || _la==T__6) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(84);
					factor();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return operation_sempred((OperationContext)_localctx, predIndex);
		case 8:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2&\n\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7\61\n\7\3\7\3\7\5\7\65\n\7\3\7\5\7"+
		"8\n\7\3\7\3\7\5\7<\n\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bF\n\b\f\b\16"+
		"\bI\13\b\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nX\n\n"+
		"\f\n\16\n[\13\n\3\n\2\4\16\22\13\2\4\6\b\n\f\16\20\22\2\4\3\2\4\5\3\2"+
		"\b\t\2^\2%\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f=\3\2"+
		"\2\2\16?\3\2\2\2\20O\3\2\2\2\22Q\3\2\2\2\24\25\5\4\3\2\25\26\7\20\2\2"+
		"\26\27\5\16\b\2\27&\3\2\2\2\30&\5\6\4\2\31\32\5\n\6\2\32\33\7\20\2\2\33"+
		"\34\5\16\b\2\34\35\7\3\2\2\35\36\7\17\2\2\36&\3\2\2\2\37 \5\b\5\2 !\7"+
		"\20\2\2!\"\5\16\b\2\"#\7\3\2\2#$\7\17\2\2$&\3\2\2\2%\24\3\2\2\2%\30\3"+
		"\2\2\2%\31\3\2\2\2%\37\3\2\2\2&\3\3\2\2\2\'(\7\13\2\2(\5\3\2\2\2)*\7\n"+
		"\2\2*\7\3\2\2\2+,\7\r\2\2,\t\3\2\2\2-.\7\f\2\2.\13\3\2\2\2/\61\7\20\2"+
		"\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\64\7\17\2\2\63\65\7\20\2"+
		"\2\64\63\3\2\2\2\64\65\3\2\2\2\65>\3\2\2\2\668\7\20\2\2\67\66\3\2\2\2"+
		"\678\3\2\2\289\3\2\2\29;\7\16\2\2:<\7\20\2\2;:\3\2\2\2;<\3\2\2\2<>\3\2"+
		"\2\2=\60\3\2\2\2=\67\3\2\2\2>\r\3\2\2\2?@\b\b\1\2@A\5\22\n\2AG\3\2\2\2"+
		"BC\f\3\2\2CD\t\2\2\2DF\5\22\n\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2H\17\3\2\2\2IG\3\2\2\2JP\5\f\7\2KL\7\6\2\2LM\5\16\b\2MN\7\7\2\2NP\3"+
		"\2\2\2OJ\3\2\2\2OK\3\2\2\2P\21\3\2\2\2QR\b\n\1\2RS\5\20\t\2SY\3\2\2\2"+
		"TU\f\3\2\2UV\t\3\2\2VX\5\20\t\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z\23\3\2\2\2[Y\3\2\2\2\13%\60\64\67;=GOY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}