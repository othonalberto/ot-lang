// Generated from compilerOT.g4 by ANTLR 4.4
package compilerOT.compilerOT;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerOTLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINT=3, CONDITIONAL=4, ELSE=5, LOOP=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, COMP_SYMBOLS=11, ASSIGN=12, BRACKET_OPEN=13, BRACKET_CLOSE=14, 
		PAR_OPEN=15, PAR_CLOSE=16, SEMICOLON=17, BOOLEAN=18, ID=19, STRING=20, 
		NUMBER=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "PRINT", "CONDITIONAL", "ELSE", "LOOP", "PLUS", "MINUS", 
		"MULT", "DIV", "COMP_SYMBOLS", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "BOOLEAN", "ID", "STRING", "NUMBER", 
		"WS"
	};


	public compilerOTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilerOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0097\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fe\n\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23|\n\23\3\24\3\24\7\24\u0080\n\24"+
		"\f\24\16\24\u0083\13\24\3\25\3\25\7\25\u0087\n\25\f\25\16\25\u008a\13"+
		"\25\3\26\6\26\u008d\n\26\r\26\16\26\u008e\3\27\6\27\u0092\n\27\r\27\16"+
		"\27\u0093\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\4\2"+
		">>@@\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\u00a1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\67"+
		"\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rI\3\2\2\2\17N\3\2\2\2\21P"+
		"\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35"+
		"j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%{\3\2\2\2\'}\3\2\2\2)\u0084"+
		"\3\2\2\2+\u008c\3\2\2\2-\u0091\3\2\2\2/\60\7o\2\2\60\61\7c\2\2\61\62\7"+
		"k\2\2\62\63\7p\2\2\63\64\7*\2\2\64\65\7+\2\2\65\66\7\"\2\2\66\4\3\2\2"+
		"\2\678\7x\2\289\7c\2\29:\7t\2\2:\6\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7k\2\2"+
		">?\7p\2\2?@\7v\2\2@\b\3\2\2\2AB\7k\2\2BC\7h\2\2C\n\3\2\2\2DE\7g\2\2EF"+
		"\7n\2\2FG\7u\2\2GH\7g\2\2H\f\3\2\2\2IJ\7n\2\2JK\7q\2\2KL\7q\2\2LM\7r\2"+
		"\2M\16\3\2\2\2NO\7-\2\2O\20\3\2\2\2PQ\7/\2\2Q\22\3\2\2\2RS\7,\2\2S\24"+
		"\3\2\2\2TU\7\61\2\2U\26\3\2\2\2VW\7?\2\2We\7?\2\2XY\7#\2\2Ye\7?\2\2Z["+
		"\7c\2\2[\\\7p\2\2\\e\7f\2\2]^\7q\2\2^e\7t\2\2_e\t\2\2\2`a\7@\2\2ae\7?"+
		"\2\2bc\7>\2\2ce\7?\2\2dV\3\2\2\2dX\3\2\2\2dZ\3\2\2\2d]\3\2\2\2d_\3\2\2"+
		"\2d`\3\2\2\2db\3\2\2\2e\30\3\2\2\2fg\7?\2\2g\32\3\2\2\2hi\7}\2\2i\34\3"+
		"\2\2\2jk\7\177\2\2k\36\3\2\2\2lm\7*\2\2m \3\2\2\2no\7+\2\2o\"\3\2\2\2"+
		"pq\7=\2\2q$\3\2\2\2rs\7V\2\2st\7t\2\2tu\7w\2\2u|\7g\2\2vw\7H\2\2wx\7c"+
		"\2\2xy\7n\2\2yz\7u\2\2z|\7g\2\2{r\3\2\2\2{v\3\2\2\2|&\3\2\2\2}\u0081\t"+
		"\3\2\2~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082(\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0088"+
		"\t\3\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089*\3\2\2\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008d\t\5\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f,\3\2\2\2\u0090\u0092\t\6\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\b\27\2\2\u0096.\3\2\2\2\t\2d{\u0081"+
		"\u0088\u008e\u0093\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}