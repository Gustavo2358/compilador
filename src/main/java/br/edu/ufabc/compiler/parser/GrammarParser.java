// Generated from Grammar.g4 by ANTLR 4.13.0
package br.edu.ufabc.compiler.parser;

	import java.util.ArrayList;
	import br.edu.ufabc.compiler.symbols.*;
	import br.edu.ufabc.compiler.expression.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OP_ADD=15, OP_MULT=16, 
		OP_REL=17, OP_BOOL=18, ID=19, TEXTO=20, INTEGER=21, REAL=22, SC=23, COMMA=24, 
		WS=25, AP=26, FP=27;
	public static final int
		RULE_prog = 0, RULE_declara = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdLeitura = 6, RULE_cmdEscrita = 7, RULE_cmdAttr = 8, 
		RULE_cmdIf = 9, RULE_cmdWhile = 10, RULE_cmdDoWhile = 11, RULE_exprBool = 12, 
		RULE_exprBooll = 13, RULE_exprRel = 14, RULE_expr = 15, RULE_exprl = 16, 
		RULE_termo = 17, RULE_termol = 18, RULE_fator = 19, RULE_num = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "declara", "declaravar", "tipo", "bloco", "cmd", "cmdLeitura", 
			"cmdEscrita", "cmdAttr", "cmdIf", "cmdWhile", "cmdDoWhile", "exprBool", 
			"exprBooll", "exprRel", "expr", "exprl", "termo", "termol", "fator", 
			"num"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog.'", "'real'", "'inteiro'", "'texto'", "'leia'", 
			"'escreva'", "':='", "'se'", "'{'", "'}'", "'senao'", "'enquanto'", "'faca'", 
			null, null, null, null, null, null, null, null, "';'", "','", null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OP_ADD", "OP_MULT", "OP_REL", "OP_BOOL", "ID", "TEXTO", 
			"INTEGER", "REAL", "SC", "COMMA", "WS", "AP", "FP"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private ArrayList<String> listaDeTokens = new ArrayList<String>();
		private SymbolTable symbolTable = new SymbolTable();
	    private DataType currentType;
	    private DataType leftDT;
	    private DataType rightDT;
	    private Expression expression;
	    private String idAtribuido;
	    private String text;

		public void exibirTodosTokens(){
			for(String s: listaDeTokens){
				System.out.println("Token: " + s);
			}
		}

		public void exibirSimbolos(){
		    System.out.println(symbolTable);
		}

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclaraContext declara() {
			return getRuleContext(DeclaraContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(43);
				declara();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 73949888L) != 0)) {
				{
				setState(46);
				bloco();
				}
			}

			setState(49);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaraContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclara(this);
		}
	}

	public final DeclaraContext declara() throws RecognitionException {
		DeclaraContext _localctx = new DeclaraContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				declaravar();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			tipo();
			setState(57);
			match(ID);
			 symbolTable.declareVariable(_input.LT(-1).getText(), currentType); 
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				match(ID);
				 symbolTable.declareVariable(_input.LT(-1).getText(), currentType); 
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__2);
				 currentType = DataType.REAL; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__3);
				 currentType = DataType.INTEIRO; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__4);
				 currentType = DataType.TEXTO; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				cmd();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 73949888L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdAttrContext cmdAttr() {
			return getRuleContext(CmdAttrContext.class,0);
		}
		public CmdIfContext cmdIf() {
			return getRuleContext(CmdIfContext.class,0);
		}
		public CmdWhileContext cmdWhile() {
			return getRuleContext(CmdWhileContext.class,0);
		}
		public CmdDoWhileContext cmdDoWhile() {
			return getRuleContext(CmdDoWhileContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				cmdLeitura();
				setState(83);
				match(SC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				cmdEscrita();
				setState(86);
				match(SC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				cmdAttr();
				setState(89);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				cmdIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				cmdWhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				cmdDoWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				expr();
				setState(95);
				match(SC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLeitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__5);
			setState(100);
			match(AP);
			setState(101);
			match(ID);
			 symbolTable.checkDeclaration(_input.LT(-1).getText()); 
			setState(103);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public TerminalNode TEXTO() { return getToken(GrammarParser.TEXTO, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdEscrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			setState(106);
			match(AP);
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(107);
				match(TEXTO);
				}
				break;
			case ID:
				{
				setState(108);
				match(ID);
				 symbolTable.checkUsage(_input.LT(-1).getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(112);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAttrContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TEXTO() { return getToken(GrammarParser.TEXTO, 0); }
		public CmdAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdAttr(this);
		}
	}

	public final CmdAttrContext cmdAttr() throws RecognitionException {
		CmdAttrContext _localctx = new CmdAttrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);

			                symbolTable.checkDeclaration(_input.LT(-1).getText());
			                idAtribuido = _input.LT(-1).getText();
			                leftDT = symbolTable.get(_input.LT(-1).getText()).getType();
			             
			setState(116);
			match(T__7);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INTEGER:
			case REAL:
			case AP:
				{
				setState(117);
				expr();
				}
				break;
			case TEXTO:
				{
				setState(118);
				match(TEXTO);
				 expression = new TextExpression(_input.LT(-1).getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			                symbolTable.setVariableValue(idAtribuido, expression);
			                expression = null;
			            
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CmdIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdIf(this);
		}
	}

	public final CmdIfContext cmdIf() throws RecognitionException {
		CmdIfContext _localctx = new CmdIfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__8);
			setState(125);
			match(AP);
			setState(126);
			exprBool();
			setState(127);
			match(FP);
			setState(128);
			match(T__9);
			setState(129);
			bloco();
			setState(130);
			match(T__10);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(131);
				match(T__11);
				setState(132);
				match(T__9);
				setState(133);
				bloco();
				setState(134);
				match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdWhileContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CmdWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdWhile(this);
		}
	}

	public final CmdWhileContext cmdWhile() throws RecognitionException {
		CmdWhileContext _localctx = new CmdWhileContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__12);
			setState(139);
			match(AP);
			setState(140);
			exprBool();
			setState(141);
			match(FP);
			setState(142);
			match(T__9);
			setState(143);
			bloco();
			setState(144);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdDoWhileContext extends ParserRuleContext {
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public CmdDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdDoWhile(this);
		}
	}

	public final CmdDoWhileContext cmdDoWhile() throws RecognitionException {
		CmdDoWhileContext _localctx = new CmdDoWhileContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__13);
			setState(147);
			match(T__9);
			setState(148);
			bloco();
			setState(149);
			match(T__10);
			setState(150);
			match(T__12);
			setState(151);
			match(AP);
			setState(152);
			exprBool();
			setState(153);
			match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoolContext extends ParserRuleContext {
		public List<ExprBoollContext> exprBooll() {
			return getRuleContexts(ExprBoollContext.class);
		}
		public ExprBoollContext exprBooll(int i) {
			return getRuleContext(ExprBoollContext.class,i);
		}
		public List<TerminalNode> OP_BOOL() { return getTokens(GrammarParser.OP_BOOL); }
		public TerminalNode OP_BOOL(int i) {
			return getToken(GrammarParser.OP_BOOL, i);
		}
		public ExprBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprBool(this);
		}
	}

	public final ExprBoolContext exprBool() throws RecognitionException {
		ExprBoolContext _localctx = new ExprBoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			exprBooll();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_BOOL) {
				{
				{
				setState(156);
				match(OP_BOOL);
				setState(157);
				exprBooll();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprBoollContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public ExprBoolContext exprBool() {
			return getRuleContext(ExprBoolContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public ExprRelContext exprRel() {
			return getRuleContext(ExprRelContext.class,0);
		}
		public ExprBoollContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBooll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprBooll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprBooll(this);
		}
	}

	public final ExprBoollContext exprBooll() throws RecognitionException {
		ExprBoollContext _localctx = new ExprBoollContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprBooll);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(AP);
				setState(164);
				exprBool();
				setState(165);
				match(FP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				exprRel();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP_REL() { return getToken(GrammarParser.OP_REL, 0); }
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprRel(this);
		}
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprRel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			expr();
			setState(171);
			match(OP_REL);
			setState(172);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public List<ExprlContext> exprl() {
			return getRuleContexts(ExprlContext.class);
		}
		public ExprlContext exprl(int i) {
			return getRuleContext(ExprlContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				termo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				termo();
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					exprl();
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_ADD );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprlContext extends ParserRuleContext {
		public TerminalNode OP_ADD() { return getToken(GrammarParser.OP_ADD, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExprlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExprl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExprl(this);
		}
	}

	public final ExprlContext exprl() throws RecognitionException {
		ExprlContext _localctx = new ExprlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(OP_ADD);

			            String operator = _input.LT(-1).getText().split(" ")[0];
			            BinaryExpression _exprADD = new BinaryExpression(operator);
			            _exprADD.setLeftSide(expression);
			        
			setState(185);
			termo();

			            _exprADD.setRightSide(expression);
			            expression = _exprADD;
			        
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public List<TermolContext> termol() {
			return getRuleContexts(TermolContext.class);
		}
		public TermolContext termol(int i) {
			return getRuleContext(TermolContext.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_termo);
		int _la;
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				fator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				fator();
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190);
					termol();
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OP_MULT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermolContext extends ParserRuleContext {
		public TerminalNode OP_MULT() { return getToken(GrammarParser.OP_MULT, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermol(this);
		}
	}

	public final TermolContext termol() throws RecognitionException {
		TermolContext _localctx = new TermolContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_termol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(OP_MULT);

			              String operator = _input.LT(-1).getText().split(" ")[0];
			              BinaryExpression _exprMult = new BinaryExpression(operator);
			              _exprMult.setLeftSide(expression);
			          
			setState(199);
			fator();

			              _exprMult.setRightSide(expression);
			              expression = _exprMult;
			          
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fator);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(ID);
				listaDeTokens.add(_input.LT(-1).getText());
				}
				break;
			case INTEGER:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				num();
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(AP);
				setState(206);
				expr();
				setState(207);
				match(FP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(GrammarParser.REAL, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_num);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(INTEGER);
				 expression = new IntegerNumberExpression(Integer.parseInt(_input.LT(-1).getText())); 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(REAL);
				 expression = new DoubleNumberExpression(Double.parseDouble(_input.LT(-1).getText())); 
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0003\u0000-\b\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0004\u00015\b\u0001\u000b\u0001\f\u00016\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003L\b\u0003\u0001\u0004\u0004\u0004O\b\u0004\u000b\u0004\f\u0004P"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\by\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0089"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u009f\b"+
		"\f\n\f\f\f\u00a2\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a9"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u00b2\b\u000f\u000b\u000f\f\u000f\u00b3"+
		"\u0003\u000f\u00b6\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00c0\b\u0011"+
		"\u000b\u0011\f\u0011\u00c1\u0003\u0011\u00c4\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d2"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00d8"+
		"\b\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0000\u00dd"+
		"\u0000*\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00048"+
		"\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\bN\u0001\u0000"+
		"\u0000\u0000\na\u0001\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000e"+
		"i\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012|\u0001"+
		"\u0000\u0000\u0000\u0014\u008a\u0001\u0000\u0000\u0000\u0016\u0092\u0001"+
		"\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u00a8\u0001"+
		"\u0000\u0000\u0000\u001c\u00aa\u0001\u0000\u0000\u0000\u001e\u00b5\u0001"+
		"\u0000\u0000\u0000 \u00b7\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000"+
		"\u0000\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00d1\u0001\u0000\u0000\u0000"+
		"(\u00d7\u0001\u0000\u0000\u0000*,\u0005\u0001\u0000\u0000+-\u0003\u0002"+
		"\u0001\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-/\u0001"+
		"\u0000\u0000\u0000.0\u0003\b\u0004\u0000/.\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u000012\u0005\u0002\u0000\u0000"+
		"2\u0001\u0001\u0000\u0000\u000035\u0003\u0004\u0002\u000043\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u000089\u0003\u0006\u0003"+
		"\u00009:\u0005\u0013\u0000\u0000:@\u0006\u0002\uffff\uffff\u0000;<\u0005"+
		"\u0018\u0000\u0000<=\u0005\u0013\u0000\u0000=?\u0006\u0002\uffff\uffff"+
		"\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0017\u0000\u0000D\u0005\u0001\u0000\u0000"+
		"\u0000EF\u0005\u0003\u0000\u0000FL\u0006\u0003\uffff\uffff\u0000GH\u0005"+
		"\u0004\u0000\u0000HL\u0006\u0003\uffff\uffff\u0000IJ\u0005\u0005\u0000"+
		"\u0000JL\u0006\u0003\uffff\uffff\u0000KE\u0001\u0000\u0000\u0000KG\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000L\u0007\u0001\u0000\u0000"+
		"\u0000MO\u0003\n\u0005\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\t\u0001\u0000"+
		"\u0000\u0000RS\u0003\f\u0006\u0000ST\u0005\u0017\u0000\u0000Tb\u0001\u0000"+
		"\u0000\u0000UV\u0003\u000e\u0007\u0000VW\u0005\u0017\u0000\u0000Wb\u0001"+
		"\u0000\u0000\u0000XY\u0003\u0010\b\u0000YZ\u0005\u0017\u0000\u0000Zb\u0001"+
		"\u0000\u0000\u0000[b\u0003\u0012\t\u0000\\b\u0003\u0014\n\u0000]b\u0003"+
		"\u0016\u000b\u0000^_\u0003\u001e\u000f\u0000_`\u0005\u0017\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000aR\u0001\u0000\u0000\u0000aU\u0001\u0000\u0000"+
		"\u0000aX\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000\u0000a\\\u0001\u0000"+
		"\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000b\u000b"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0006\u0000\u0000de\u0005\u001a\u0000"+
		"\u0000ef\u0005\u0013\u0000\u0000fg\u0006\u0006\uffff\uffff\u0000gh\u0005"+
		"\u001b\u0000\u0000h\r\u0001\u0000\u0000\u0000ij\u0005\u0007\u0000\u0000"+
		"jn\u0005\u001a\u0000\u0000ko\u0005\u0014\u0000\u0000lm\u0005\u0013\u0000"+
		"\u0000mo\u0006\u0007\uffff\uffff\u0000nk\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005\u001b\u0000\u0000"+
		"q\u000f\u0001\u0000\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0006\b\uffff"+
		"\uffff\u0000tx\u0005\b\u0000\u0000uy\u0003\u001e\u000f\u0000vw\u0005\u0014"+
		"\u0000\u0000wy\u0006\b\uffff\uffff\u0000xu\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0006\b\uffff\uffff\u0000"+
		"{\u0011\u0001\u0000\u0000\u0000|}\u0005\t\u0000\u0000}~\u0005\u001a\u0000"+
		"\u0000~\u007f\u0003\u0018\f\u0000\u007f\u0080\u0005\u001b\u0000\u0000"+
		"\u0080\u0081\u0005\n\u0000\u0000\u0081\u0082\u0003\b\u0004\u0000\u0082"+
		"\u0088\u0005\u000b\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0085"+
		"\u0005\n\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005"+
		"\u000b\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0083\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0013\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0005\r\u0000\u0000\u008b\u008c\u0005\u001a"+
		"\u0000\u0000\u008c\u008d\u0003\u0018\f\u0000\u008d\u008e\u0005\u001b\u0000"+
		"\u0000\u008e\u008f\u0005\n\u0000\u0000\u008f\u0090\u0003\b\u0004\u0000"+
		"\u0090\u0091\u0005\u000b\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\u000e\u0000\u0000\u0093\u0094\u0005\n\u0000\u0000\u0094"+
		"\u0095\u0003\b\u0004\u0000\u0095\u0096\u0005\u000b\u0000\u0000\u0096\u0097"+
		"\u0005\r\u0000\u0000\u0097\u0098\u0005\u001a\u0000\u0000\u0098\u0099\u0003"+
		"\u0018\f\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a\u0017\u0001\u0000"+
		"\u0000\u0000\u009b\u00a0\u0003\u001a\r\u0000\u009c\u009d\u0005\u0012\u0000"+
		"\u0000\u009d\u009f\u0003\u001a\r\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0019\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u001a\u0000\u0000"+
		"\u00a4\u00a5\u0003\u0018\f\u0000\u00a5\u00a6\u0005\u001b\u0000\u0000\u00a6"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000\u00a8"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab"+
		"\u00ac\u0005\u0011\u0000\u0000\u00ac\u00ad\u0003\u001e\u000f\u0000\u00ad"+
		"\u001d\u0001\u0000\u0000\u0000\u00ae\u00b6\u0003\"\u0011\u0000\u00af\u00b1"+
		"\u0003\"\u0011\u0000\u00b0\u00b2\u0003 \u0010\u0000\u00b1\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001"+
		"\u0000\u0000\u0000\u00b6\u001f\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005"+
		"\u000f\u0000\u0000\u00b8\u00b9\u0006\u0010\uffff\uffff\u0000\u00b9\u00ba"+
		"\u0003\"\u0011\u0000\u00ba\u00bb\u0006\u0010\uffff\uffff\u0000\u00bb!"+
		"\u0001\u0000\u0000\u0000\u00bc\u00c4\u0003&\u0013\u0000\u00bd\u00bf\u0003"+
		"&\u0013\u0000\u00be\u00c0\u0003$\u0012\u0000\u00bf\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c3\u00bc\u0001\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c4#\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0010\u0000\u0000"+
		"\u00c6\u00c7\u0006\u0012\uffff\uffff\u0000\u00c7\u00c8\u0003&\u0013\u0000"+
		"\u00c8\u00c9\u0006\u0012\uffff\uffff\u0000\u00c9%\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005\u0013\u0000\u0000\u00cb\u00d2\u0006\u0013\uffff\uffff"+
		"\u0000\u00cc\u00d2\u0003(\u0014\u0000\u00cd\u00ce\u0005\u001a\u0000\u0000"+
		"\u00ce\u00cf\u0003\u001e\u000f\u0000\u00cf\u00d0\u0005\u001b\u0000\u0000"+
		"\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00ca\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cc\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d2\'\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0015\u0000\u0000\u00d4"+
		"\u00d8\u0006\u0014\uffff\uffff\u0000\u00d5\u00d6\u0005\u0016\u0000\u0000"+
		"\u00d6\u00d8\u0006\u0014\uffff\uffff\u0000\u00d7\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8)\u0001\u0000\u0000\u0000"+
		"\u0012,/6@KPanx\u0088\u00a0\u00a8\u00b3\u00b5\u00c1\u00c3\u00d1\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}