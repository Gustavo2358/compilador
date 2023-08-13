// Generated from Grammar.g4 by ANTLR 4.13.0
package br.edu.ufabc.compiler.parser;

	import java.util.ArrayList;
	import br.edu.ufabc.compiler.symbols.*;
	import br.edu.ufabc.compiler.expression.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OP_ADD=15, OP_MULT=16, 
		OP_REL=17, OP_BOOL=18, ID=19, TEXTO=20, INTEGER=21, REAL=22, SC=23, COMMA=24, 
		WS=25, AP=26, FP=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "OP_ADD", "OP_MULT", "OP_REL", 
			"OP_BOOL", "ID", "TEXTO", "INTEGER", "REAL", "SC", "COMMA", "WS", "AP", 
			"FP"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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
		"\u0004\u0000\u001b\u00cd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u008d\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0098\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u009e\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00a2\b\u0012\n\u0012"+
		"\f\u0012\u00a5\t\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u00a9\b\u0013"+
		"\n\u0013\f\u0013\u00ac\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0004"+
		"\u0014\u00b1\b\u0014\u000b\u0014\f\u0014\u00b2\u0001\u0015\u0004\u0015"+
		"\u00b6\b\u0015\u000b\u0015\f\u0015\u00b7\u0001\u0015\u0001\u0015\u0004"+
		"\u0015\u00bc\b\u0015\u000b\u0015\f\u0015\u00bd\u0003\u0015\u00c0\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u00aa\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001\u0000\b"+
		"\u0002\u0000++--\u0002\u0000**//\u0002\u0000<<>>\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0001\u0000\"\"\u0001\u000009\u0003\u0000\t\n\r\r  \u00d8"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000"+
		"\u0003@\u0001\u0000\u0000\u0000\u0005I\u0001\u0000\u0000\u0000\u0007N"+
		"\u0001\u0000\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000b\\\u0001\u0000"+
		"\u0000\u0000\ra\u0001\u0000\u0000\u0000\u000fi\u0001\u0000\u0000\u0000"+
		"\u0011l\u0001\u0000\u0000\u0000\u0013o\u0001\u0000\u0000\u0000\u0015q"+
		"\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000\u0000\u0019y\u0001\u0000"+
		"\u0000\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0087\u0001\u0000"+
		"\u0000\u0000\u001f\u008c\u0001\u0000\u0000\u0000!\u0097\u0001\u0000\u0000"+
		"\u0000#\u009d\u0001\u0000\u0000\u0000%\u009f\u0001\u0000\u0000\u0000\'"+
		"\u00a6\u0001\u0000\u0000\u0000)\u00b0\u0001\u0000\u0000\u0000+\u00b5\u0001"+
		"\u0000\u0000\u0000-\u00c1\u0001\u0000\u0000\u0000/\u00c3\u0001\u0000\u0000"+
		"\u00001\u00c5\u0001\u0000\u0000\u00003\u00c9\u0001\u0000\u0000\u00005"+
		"\u00cb\u0001\u0000\u0000\u000078\u0005p\u0000\u000089\u0005r\u0000\u0000"+
		"9:\u0005o\u0000\u0000:;\u0005g\u0000\u0000;<\u0005r\u0000\u0000<=\u0005"+
		"a\u0000\u0000=>\u0005m\u0000\u0000>?\u0005a\u0000\u0000?\u0002\u0001\u0000"+
		"\u0000\u0000@A\u0005f\u0000\u0000AB\u0005i\u0000\u0000BC\u0005m\u0000"+
		"\u0000CD\u0005p\u0000\u0000DE\u0005r\u0000\u0000EF\u0005o\u0000\u0000"+
		"FG\u0005g\u0000\u0000GH\u0005.\u0000\u0000H\u0004\u0001\u0000\u0000\u0000"+
		"IJ\u0005r\u0000\u0000JK\u0005e\u0000\u0000KL\u0005a\u0000\u0000LM\u0005"+
		"l\u0000\u0000M\u0006\u0001\u0000\u0000\u0000NO\u0005i\u0000\u0000OP\u0005"+
		"n\u0000\u0000PQ\u0005t\u0000\u0000QR\u0005e\u0000\u0000RS\u0005i\u0000"+
		"\u0000ST\u0005r\u0000\u0000TU\u0005o\u0000\u0000U\b\u0001\u0000\u0000"+
		"\u0000VW\u0005t\u0000\u0000WX\u0005e\u0000\u0000XY\u0005x\u0000\u0000"+
		"YZ\u0005t\u0000\u0000Z[\u0005o\u0000\u0000[\n\u0001\u0000\u0000\u0000"+
		"\\]\u0005l\u0000\u0000]^\u0005e\u0000\u0000^_\u0005i\u0000\u0000_`\u0005"+
		"a\u0000\u0000`\f\u0001\u0000\u0000\u0000ab\u0005e\u0000\u0000bc\u0005"+
		"s\u0000\u0000cd\u0005c\u0000\u0000de\u0005r\u0000\u0000ef\u0005e\u0000"+
		"\u0000fg\u0005v\u0000\u0000gh\u0005a\u0000\u0000h\u000e\u0001\u0000\u0000"+
		"\u0000ij\u0005:\u0000\u0000jk\u0005=\u0000\u0000k\u0010\u0001\u0000\u0000"+
		"\u0000lm\u0005s\u0000\u0000mn\u0005e\u0000\u0000n\u0012\u0001\u0000\u0000"+
		"\u0000op\u0005{\u0000\u0000p\u0014\u0001\u0000\u0000\u0000qr\u0005}\u0000"+
		"\u0000r\u0016\u0001\u0000\u0000\u0000st\u0005s\u0000\u0000tu\u0005e\u0000"+
		"\u0000uv\u0005n\u0000\u0000vw\u0005a\u0000\u0000wx\u0005o\u0000\u0000"+
		"x\u0018\u0001\u0000\u0000\u0000yz\u0005e\u0000\u0000z{\u0005n\u0000\u0000"+
		"{|\u0005q\u0000\u0000|}\u0005u\u0000\u0000}~\u0005a\u0000\u0000~\u007f"+
		"\u0005n\u0000\u0000\u007f\u0080\u0005t\u0000\u0000\u0080\u0081\u0005o"+
		"\u0000\u0000\u0081\u001a\u0001\u0000\u0000\u0000\u0082\u0083\u0005f\u0000"+
		"\u0000\u0083\u0084\u0005a\u0000\u0000\u0084\u0085\u0005c\u0000\u0000\u0085"+
		"\u0086\u0005a\u0000\u0000\u0086\u001c\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0007\u0000\u0000\u0000\u0088\u001e\u0001\u0000\u0000\u0000\u0089\u008d"+
		"\u0007\u0001\u0000\u0000\u008a\u008b\u0005/\u0000\u0000\u008b\u008d\u0005"+
		"/\u0000\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d \u0001\u0000\u0000\u0000\u008e\u0098\u0007\u0002\u0000"+
		"\u0000\u008f\u0090\u0005>\u0000\u0000\u0090\u0098\u0005=\u0000\u0000\u0091"+
		"\u0092\u0005<\u0000\u0000\u0092\u0098\u0005=\u0000\u0000\u0093\u0094\u0005"+
		"=\u0000\u0000\u0094\u0098\u0005=\u0000\u0000\u0095\u0096\u0005!\u0000"+
		"\u0000\u0096\u0098\u0005=\u0000\u0000\u0097\u008e\u0001\u0000\u0000\u0000"+
		"\u0097\u008f\u0001\u0000\u0000\u0000\u0097\u0091\u0001\u0000\u0000\u0000"+
		"\u0097\u0093\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000"+
		"\u0098\"\u0001\u0000\u0000\u0000\u0099\u009a\u0005&\u0000\u0000\u009a"+
		"\u009e\u0005&\u0000\u0000\u009b\u009c\u0005|\u0000\u0000\u009c\u009e\u0005"+
		"|\u0000\u0000\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e$\u0001\u0000\u0000\u0000\u009f\u00a3\u0007\u0003\u0000"+
		"\u0000\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4&\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00aa\u0007\u0005\u0000\u0000"+
		"\u00a7\u00a9\t\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0005\u0000\u0000\u00ae"+
		"(\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0006\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3*\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0007\u0006\u0000\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00bf\u0001"+
		"\u0000\u0000\u0000\u00b9\u00bb\u0005.\u0000\u0000\u00ba\u00bc\u0007\u0006"+
		"\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000"+
		"\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0,\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005;\u0000\u0000\u00c2.\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005,\u0000\u0000\u00c40\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007"+
		"\u0007\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006"+
		"\u0018\u0000\u0000\u00c82\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005(\u0000"+
		"\u0000\u00ca4\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005)\u0000\u0000\u00cc"+
		"6\u0001\u0000\u0000\u0000\n\u0000\u008c\u0097\u009d\u00a3\u00aa\u00b2"+
		"\u00b7\u00bd\u00bf\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}