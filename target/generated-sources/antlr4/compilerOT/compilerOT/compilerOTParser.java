// Generated from compilerOT.g4 by ANTLR 4.4
package compilerOT.compilerOT;

	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;

	import AST.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compilerOTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINT=3, CONDITIONAL=4, ELSE=5, LOOP=6, PLUS=7, MINUS=8, 
		MULT=9, DIV=10, COMP_SYMBOLS=11, ASSIGN=12, BRACKET_OPEN=13, BRACKET_CLOSE=14, 
		PAR_OPEN=15, PAR_CLOSE=16, SEMICOLON=17, BOOLEAN=18, ID=19, STRING=20, 
		NUMBER=21, WS=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'main() '", "'var'", "'print'", "'if'", "'else'", "'loop'", 
		"'+'", "'-'", "'*'", "'/'", "COMP_SYMBOLS", "'='", "'{'", "'}'", "'('", 
		"')'", "';'", "BOOLEAN", "ID", "STRING", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_var_decl = 2, RULE_var_assign = 3, 
		RULE_print = 4, RULE_conditional = 5, RULE_comp = 6, RULE_loop = 7, RULE_expression = 8, 
		RULE_factor = 9, RULE_term = 10, RULE_forparams = 11;
	public static final String[] ruleNames = {
		"program", "sentence", "var_decl", "var_assign", "print", "conditional", 
		"comp", "loop", "expression", "factor", "term", "forparams"
	};

	@Override
	public String getGrammarFileName() { return "compilerOT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		Map<String, Object> symbolTable = new HashMap<String, Object>();
		BufferedWriter buffer;
		IdentControl i = new IdentControl();

	public compilerOTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SentenceContext sentence;
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(compilerOTParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(compilerOTParser.BRACKET_OPEN, 0); }
		public TerminalNode PROGRAM() { return getToken(compilerOTParser.PROGRAM, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(PROGRAM);
			setState(25); match(BRACKET_OPEN);

				List<ASTNode> body = new ArrayList<ASTNode>();
					Map<String, Object> symbolTable = new HashMap<String, Object>();
				
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << CONDITIONAL) | (1L << ID))) != 0)) {
				{
				{
				setState(27); ((ProgramContext)_localctx).sentence = sentence();
				body.add(((ProgramContext)_localctx).sentence.node);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(BRACKET_CLOSE);

					try {
						buffer = new BufferedWriter(new FileWriter("./saida.py"));
						buffer.append("# Código gerado através do compilador OT Lang\n\n");
			        } catch (IOException ex) {
			        	System.out.println(ex);
			        }
			        
					for(ASTNode n : body) {
						if (n != null)
							n.execute(symbolTable, buffer);
					}
					
					try {
						buffer.close();
					} catch (IOException ex) {
			        	System.out.println(ex);
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

	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public PrintContext print;
		public ConditionalContext conditional;
		public Var_declContext var_decl;
		public Var_assignContext var_assign;
		public LoopContext loop;
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public Var_assignContext var_assign() {
			return getRuleContext(Var_assignContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); ((SentenceContext)_localctx).print = print();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).print.node;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41); ((SentenceContext)_localctx).conditional = conditional();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).conditional.node;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); ((SentenceContext)_localctx).var_decl = var_decl();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).var_decl.node;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47); ((SentenceContext)_localctx).var_assign = var_assign();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).var_assign.node;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50); ((SentenceContext)_localctx).loop = loop();
				((SentenceContext)_localctx).node = ((SentenceContext)_localctx).loop.node;
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

	public static class Var_declContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public TerminalNode ID() { return getToken(compilerOTParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(compilerOTParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(compilerOTParser.VAR, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(VAR);
			setState(56); ((Var_declContext)_localctx).ID = match(ID);
			setState(57); match(SEMICOLON);
			((Var_declContext)_localctx).node =  new VarDecl((((Var_declContext)_localctx).ID!=null?((Var_declContext)_localctx).ID.getText():null));
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

	public static class Var_assignContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(compilerOTParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(compilerOTParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(compilerOTParser.SEMICOLON, 0); }
		public TerminalNode VAR() { return getToken(compilerOTParser.VAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Var_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterVar_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitVar_assign(this);
		}
	}

	public final Var_assignContext var_assign() throws RecognitionException {
		Var_assignContext _localctx = new Var_assignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(60); match(VAR);
				}
			}

			setState(63); ((Var_assignContext)_localctx).ID = match(ID);
			setState(64); match(ASSIGN);
			setState(65); ((Var_assignContext)_localctx).expression = expression();
			setState(66); match(SEMICOLON);

					((Var_assignContext)_localctx).node =  new VarAssign((((Var_assignContext)_localctx).ID!=null?((Var_assignContext)_localctx).ID.getText():null), ((Var_assignContext)_localctx).expression.node);
				
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

	public static class PrintContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public TerminalNode SEMICOLON() { return getToken(compilerOTParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(compilerOTParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(PRINT);
			setState(70); ((PrintContext)_localctx).expression = expression();
			setState(71); match(SEMICOLON);

					((PrintContext)_localctx).node =  new Print((((PrintContext)_localctx).expression!=null?_input.getText(((PrintContext)_localctx).expression.start,((PrintContext)_localctx).expression.stop):null));
				
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

	public static class ConditionalContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public SentenceContext s2;
		public SentenceContext s3;
		public TerminalNode ELSE() { return getToken(compilerOTParser.ELSE, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(compilerOTParser.PAR_CLOSE, 0); }
		public TerminalNode CONDITIONAL() { return getToken(compilerOTParser.CONDITIONAL, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> BRACKET_CLOSE() { return getTokens(compilerOTParser.BRACKET_CLOSE); }
		public TerminalNode PAR_OPEN() { return getToken(compilerOTParser.PAR_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> BRACKET_OPEN() { return getTokens(compilerOTParser.BRACKET_OPEN); }
		public TerminalNode BRACKET_OPEN(int i) {
			return getToken(compilerOTParser.BRACKET_OPEN, i);
		}
		public TerminalNode BRACKET_CLOSE(int i) {
			return getToken(compilerOTParser.BRACKET_CLOSE, i);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(CONDITIONAL);
			setState(75); match(PAR_OPEN);
			setState(76); ((ConditionalContext)_localctx).expression = expression();
			setState(77); match(PAR_CLOSE);

					
					List<ASTNode> 	body = new ArrayList<ASTNode>(),
									elseBody = null;
									
				
			setState(79); match(BRACKET_OPEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << CONDITIONAL) | (1L << ID))) != 0)) {
				{
				{
				setState(80); ((ConditionalContext)_localctx).s2 = sentence();
				body.add(((ConditionalContext)_localctx).s2.node);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(BRACKET_CLOSE);
			setState(101);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(89); match(ELSE);

						elseBody = new ArrayList<ASTNode>();
					
				setState(91); match(BRACKET_OPEN);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << CONDITIONAL) | (1L << ID))) != 0)) {
					{
					{
					setState(92); ((ConditionalContext)_localctx).s3 = sentence();
					elseBody.add(((ConditionalContext)_localctx).s3.node);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100); match(BRACKET_CLOSE);
				}
			}


					((ConditionalContext)_localctx).node =  new If((((ConditionalContext)_localctx).expression!=null?_input.getText(((ConditionalContext)_localctx).expression.start,((ConditionalContext)_localctx).expression.stop):null), body, elseBody);
				
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

	public static class CompContext extends ParserRuleContext {
		public ASTNode node;
		public TerminalNode ID() { return getToken(compilerOTParser.ID, 0); }
		public TerminalNode COMP_SYMBOLS() { return getToken(compilerOTParser.COMP_SYMBOLS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(ID);
			setState(106); match(COMP_SYMBOLS);
			setState(107); expression();
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

	public static class LoopContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ForparamsContext s1;
		public SentenceContext s2;
		public TerminalNode ID() { return getToken(compilerOTParser.ID, 0); }
		public TerminalNode LOOP() { return getToken(compilerOTParser.LOOP, 0); }
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(compilerOTParser.BRACKET_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(compilerOTParser.BRACKET_OPEN, 0); }
		public ForparamsContext forparams(int i) {
			return getRuleContext(ForparamsContext.class,i);
		}
		public List<ForparamsContext> forparams() {
			return getRuleContexts(ForparamsContext.class);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); ((LoopContext)_localctx).ID = match(ID);
			setState(110); match(LOOP);

					List<ASTNode> params = new ArrayList<ASTNode>();
					List<ASTNode> body = new ArrayList<ASTNode>();
				
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(112); ((LoopContext)_localctx).s1 = forparams();
				params.add(((LoopContext)_localctx).s1.node);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(BRACKET_OPEN);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << PRINT) | (1L << CONDITIONAL) | (1L << ID))) != 0)) {
				{
				{
				setState(121); ((LoopContext)_localctx).s2 = sentence();
				body.add(((LoopContext)_localctx).s2.node);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129); match(BRACKET_CLOSE);

					if (params.size() > 3) {
						System.out.println("ERRO! Mais que 3 parâmetros.");
						
					}
					
					((LoopContext)_localctx).node =  new For((((LoopContext)_localctx).ID!=null?((LoopContext)_localctx).ID.getText():null), params, body);
				
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

	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext t1;
		public FactorContext t2;
		public FactorContext t3;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public TerminalNode MINUS(int i) {
			return getToken(compilerOTParser.MINUS, i);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(compilerOTParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(compilerOTParser.MINUS); }
		public TerminalNode PLUS(int i) {
			return getToken(compilerOTParser.PLUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); ((ExpressionContext)_localctx).t1 = factor();
			((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).t1.node;
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134); match(PLUS);
					setState(135); ((ExpressionContext)_localctx).t2 = factor();
					((ExpressionContext)_localctx).node =  new Addition(_localctx.node, ((ExpressionContext)_localctx).t2.node);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143); match(MINUS);
					setState(144); ((ExpressionContext)_localctx).t3 = factor();
					((ExpressionContext)_localctx).node =  new Subtraction(_localctx.node, ((ExpressionContext)_localctx).t3.node);
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext t1;
		public TermContext t2;
		public TermContext t3;
		public TerminalNode MULT(int i) {
			return getToken(compilerOTParser.MULT, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(compilerOTParser.MULT); }
		public List<TerminalNode> DIV() { return getTokens(compilerOTParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(compilerOTParser.DIV, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_factor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152); ((FactorContext)_localctx).t1 = term();
			((FactorContext)_localctx).node =  ((FactorContext)_localctx).t1.node;
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154); match(MULT);
					setState(155); ((FactorContext)_localctx).t2 = term();
					((FactorContext)_localctx).node =  new Multiplication(_localctx.node, ((FactorContext)_localctx).t2.node);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); match(DIV);
					setState(164); ((FactorContext)_localctx).t3 = term();
					{
					((FactorContext)_localctx).node =  new Division(_localctx.node, ((FactorContext)_localctx).t3.node);
					}
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public Token BOOLEAN;
		public Token ID;
		public ExpressionContext expression;
		public CompContext comp;
		public TerminalNode ID() { return getToken(compilerOTParser.ID, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(compilerOTParser.PAR_CLOSE, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode PAR_OPEN() { return getToken(compilerOTParser.PAR_OPEN, 0); }
		public TerminalNode NUMBER() { return getToken(compilerOTParser.NUMBER, 0); }
		public TerminalNode BOOLEAN() { return getToken(compilerOTParser.BOOLEAN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); ((TermContext)_localctx).NUMBER = match(NUMBER);
				((TermContext)_localctx).node =  new Constant(Double.parseDouble((((TermContext)_localctx).NUMBER!=null?((TermContext)_localctx).NUMBER.getText():null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); ((TermContext)_localctx).BOOLEAN = match(BOOLEAN);
				((TermContext)_localctx).node =  new Constant(Boolean.parseBoolean((((TermContext)_localctx).BOOLEAN!=null?((TermContext)_localctx).BOOLEAN.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); ((TermContext)_localctx).ID = match(ID);
				((TermContext)_localctx).node =  new VarRef((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(PAR_OPEN);
				setState(179); ((TermContext)_localctx).expression = expression();
				((TermContext)_localctx).node =  ((TermContext)_localctx).expression.node;
				setState(181); match(PAR_CLOSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183); ((TermContext)_localctx).comp = comp();
				((TermContext)_localctx).node =  ((TermContext)_localctx).comp.node;
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

	public static class ForparamsContext extends ParserRuleContext {
		public ASTNode node;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(compilerOTParser.NUMBER, 0); }
		public ForparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).enterForparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compilerOTListener ) ((compilerOTListener)listener).exitForparams(this);
		}
	}

	public final ForparamsContext forparams() throws RecognitionException {
		ForparamsContext _localctx = new ForparamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forparams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); ((ForparamsContext)_localctx).NUMBER = match(NUMBER);
			((ForparamsContext)_localctx).node =  new Constant(Integer.parseInt((((ForparamsContext)_localctx).NUMBER!=null?((ForparamsContext)_localctx).NUMBER.getText():null)));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00c2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5@\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7V\n\7\f\7\16"+
		"\7Y\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7b\n\7\f\7\16\7e\13\7\3\7\5\7h"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tv\n\t\f\t\16\t"+
		"y\13\t\3\t\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t\u0082\13\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\n\3\n\3\n\3\n"+
		"\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u00a1\n\13\f\13\16\13\u00a4\13\13\3\13\3\13\3\13\3\13\7\13\u00aa\n\13"+
		"\f\13\16\13\u00ad\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\2\u00c8\2\32\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\b?\3\2\2\2\nG\3"+
		"\2\2\2\fL\3\2\2\2\16k\3\2\2\2\20o\3\2\2\2\22\u0086\3\2\2\2\24\u009a\3"+
		"\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2\2\32\33\7\3\2\2\33\34\7\17\2\2"+
		"\34\"\b\2\1\2\35\36\5\4\3\2\36\37\b\2\1\2\37!\3\2\2\2 \35\3\2\2\2!$\3"+
		"\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\20\2\2&\'\b\2\1"+
		"\2\'\3\3\2\2\2()\5\n\6\2)*\b\3\1\2*8\3\2\2\2+,\5\f\7\2,-\b\3\1\2-8\3\2"+
		"\2\2./\5\6\4\2/\60\b\3\1\2\608\3\2\2\2\61\62\5\b\5\2\62\63\b\3\1\2\63"+
		"8\3\2\2\2\64\65\5\20\t\2\65\66\b\3\1\2\668\3\2\2\2\67(\3\2\2\2\67+\3\2"+
		"\2\2\67.\3\2\2\2\67\61\3\2\2\2\67\64\3\2\2\28\5\3\2\2\29:\7\4\2\2:;\7"+
		"\25\2\2;<\7\23\2\2<=\b\4\1\2=\7\3\2\2\2>@\7\4\2\2?>\3\2\2\2?@\3\2\2\2"+
		"@A\3\2\2\2AB\7\25\2\2BC\7\16\2\2CD\5\22\n\2DE\7\23\2\2EF\b\5\1\2F\t\3"+
		"\2\2\2GH\7\5\2\2HI\5\22\n\2IJ\7\23\2\2JK\b\6\1\2K\13\3\2\2\2LM\7\6\2\2"+
		"MN\7\21\2\2NO\5\22\n\2OP\7\22\2\2PQ\b\7\1\2QW\7\17\2\2RS\5\4\3\2ST\b\7"+
		"\1\2TV\3\2\2\2UR\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2"+
		"\2\2Zg\7\20\2\2[\\\7\7\2\2\\]\b\7\1\2]c\7\17\2\2^_\5\4\3\2_`\b\7\1\2`"+
		"b\3\2\2\2a^\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2"+
		"fh\7\20\2\2g[\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\7\1\2j\r\3\2\2\2kl\7\25"+
		"\2\2lm\7\r\2\2mn\5\22\n\2n\17\3\2\2\2op\7\25\2\2pq\7\b\2\2qw\b\t\1\2r"+
		"s\5\30\r\2st\b\t\1\2tv\3\2\2\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2"+
		"xz\3\2\2\2yw\3\2\2\2z\u0080\7\17\2\2{|\5\4\3\2|}\b\t\1\2}\177\3\2\2\2"+
		"~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0085\b"+
		"\t\1\2\u0085\21\3\2\2\2\u0086\u0087\5\24\13\2\u0087\u008e\b\n\1\2\u0088"+
		"\u0089\7\t\2\2\u0089\u008a\5\24\13\2\u008a\u008b\b\n\1\2\u008b\u008d\3"+
		"\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0097\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\n"+
		"\2\2\u0092\u0093\5\24\13\2\u0093\u0094\b\n\1\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\23\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\26\f\2\u009b\u00a2"+
		"\b\13\1\2\u009c\u009d\7\13\2\2\u009d\u009e\5\26\f\2\u009e\u009f\b\13\1"+
		"\2\u009f\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00ab\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\f\2\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\b\13\1\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\27\2"+
		"\2\u00af\u00bd\b\f\1\2\u00b0\u00b1\7\24\2\2\u00b1\u00bd\b\f\1\2\u00b2"+
		"\u00b3\7\25\2\2\u00b3\u00bd\b\f\1\2\u00b4\u00b5\7\21\2\2\u00b5\u00b6\5"+
		"\22\n\2\u00b6\u00b7\b\f\1\2\u00b7\u00b8\7\22\2\2\u00b8\u00bd\3\2\2\2\u00b9"+
		"\u00ba\5\16\b\2\u00ba\u00bb\b\f\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00ae\3"+
		"\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b4\3\2\2\2\u00bc"+
		"\u00b9\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf\u00c0\b\r\1"+
		"\2\u00c0\31\3\2\2\2\17\"\67?Wcgw\u0080\u008e\u0097\u00a2\u00ab\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}