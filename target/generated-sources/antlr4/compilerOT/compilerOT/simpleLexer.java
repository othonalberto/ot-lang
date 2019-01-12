// Generated from compilerOT/compilerOT/compilerOT.g4 by ANTLR 4.5.1
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
public class simpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, CONDITIONAL=4, LOOP=5, PLUS=6, MINUS=7, MULT=8, 
		DIV=9, EQUAL=10, AND=11, OR=12, NOT=13, GT=14, LT=15, GEQ=16, LEQ=17, 
		EQ=18, NEQ=19, ASSIGN=20, BRACKET_OPEN=21, BRACKET_CLOSE=22, PAR_OPEN=23, 
		PAR_CLOSE=24, SEMICOLON=25, ID=26, NUMBER=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "PRINTLN", "CONDITIONAL", "LOOP", "PLUS", "MINUS", "MULT", 
		"DIV", "EQUAL", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", 
		"ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", 
		"ID", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main() '", "'var'", "'println'", "'if'", "'loop'", "'+'", "'-'", 
		"'*'", "'/'", null, "'&&'", "'||'", "'!'", "'>'", "'<'", "'>='", "'<='", 
		null, "'!='", "'='", "'{'", "'}'", "'('", "')'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "VAR", "PRINTLN", "CONDITIONAL", "LOOP", "PLUS", "MINUS", 
		"MULT", "DIV", "EQUAL", "AND", "OR", "NOT", "GT", "LT", "GEQ", "LEQ", 
		"EQ", "NEQ", "ASSIGN", "BRACKET_OPEN", "BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", 
		"SEMICOLON", "ID", "NUMBER", "WS"
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


	public simpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilerOT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u0089\n\33\f\33\16\33\u008c"+
		"\13\33\3\34\6\34\u008f\n\34\r\34\16\34\u0090\3\35\6\35\u0094\n\35\r\35"+
		"\16\35\u0095\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2"+
		"\13\f\17\17\"\"\u009b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\3;\3\2\2\2\5C\3\2\2\2\7G\3\2\2\2\tO\3\2\2\2\13R\3\2"+
		"\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27b\3"+
		"\2\2\2\31e\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2\2#q\3\2"+
		"\2\2%t\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+|\3\2\2\2-~\3\2\2\2/\u0080\3\2\2\2"+
		"\61\u0082\3\2\2\2\63\u0084\3\2\2\2\65\u0086\3\2\2\2\67\u008e\3\2\2\29"+
		"\u0093\3\2\2\2;<\7o\2\2<=\7c\2\2=>\7k\2\2>?\7p\2\2?@\7*\2\2@A\7+\2\2A"+
		"B\7\"\2\2B\4\3\2\2\2CD\7x\2\2DE\7c\2\2EF\7t\2\2F\6\3\2\2\2GH\7r\2\2HI"+
		"\7t\2\2IJ\7k\2\2JK\7p\2\2KL\7v\2\2LM\7n\2\2MN\7p\2\2N\b\3\2\2\2OP\7k\2"+
		"\2PQ\7h\2\2Q\n\3\2\2\2RS\7n\2\2ST\7q\2\2TU\7q\2\2UV\7r\2\2V\f\3\2\2\2"+
		"WX\7-\2\2X\16\3\2\2\2YZ\7/\2\2Z\20\3\2\2\2[\\\7,\2\2\\\22\3\2\2\2]^\7"+
		"\61\2\2^\24\3\2\2\2_`\7?\2\2`a\7?\2\2a\26\3\2\2\2bc\7(\2\2cd\7(\2\2d\30"+
		"\3\2\2\2ef\7~\2\2fg\7~\2\2g\32\3\2\2\2hi\7#\2\2i\34\3\2\2\2jk\7@\2\2k"+
		"\36\3\2\2\2lm\7>\2\2m \3\2\2\2no\7@\2\2op\7?\2\2p\"\3\2\2\2qr\7>\2\2r"+
		"s\7?\2\2s$\3\2\2\2tu\7?\2\2uv\7?\2\2v&\3\2\2\2wx\7#\2\2xy\7?\2\2y(\3\2"+
		"\2\2z{\7?\2\2{*\3\2\2\2|}\7}\2\2},\3\2\2\2~\177\7\177\2\2\177.\3\2\2\2"+
		"\u0080\u0081\7*\2\2\u0081\60\3\2\2\2\u0082\u0083\7+\2\2\u0083\62\3\2\2"+
		"\2\u0084\u0085\7=\2\2\u0085\64\3\2\2\2\u0086\u008a\t\2\2\2\u0087\u0089"+
		"\t\3\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\66\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\t\4\2"+
		"\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u00918\3\2\2\2\u0092\u0094\t\5\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\b\35\2\2\u0098:\3\2\2\2\6\2\u008a\u0090\u0095\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}