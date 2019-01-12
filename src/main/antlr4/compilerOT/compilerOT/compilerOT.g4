grammar compilerOT;

@parser::header{
	import java.util.Map;
	import java.util.HashMap;
	import java.util.List;
	import java.util.ArrayList;

	import AST.*;
	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;
}

@parser::members{
	Map<String, Object> symbolTable = new HashMap<String, Object>();
	BufferedWriter buffer;
	IdentControl i = new IdentControl();
}

/*parser */
program: PROGRAM BRACKET_OPEN {
	List<ASTNode> body = new ArrayList<ASTNode>();
		Map<String, Object> symbolTable = new HashMap<String, Object>();
	}
	
	(sentence {body.add($sentence.node);})*
	BRACKET_CLOSE
	{
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
	};

sentence returns [ASTNode node]: 
	print {$node=$print.node;}
	| conditional {$node=$conditional.node;}
	| var_decl {$node=$var_decl.node;}
	| var_assign {$node=$var_assign.node;}
	| loop {$node=$loop.node;}
; 

var_decl returns [ASTNode node]:
	VAR ID SEMICOLON {$node = new VarDecl($ID.text);}
;
	
var_assign returns [ASTNode node]:
	(VAR)? ID ASSIGN expression SEMICOLON {
		$node = new VarAssign($ID.text, $expression.node);
	} // por conta do (VAR)? suporta declaracao e atribuicao ao mesmo tempo. Ex.: var y = 3;
;

print returns [ASTNode node]:
	PRINT expression SEMICOLON {
		$node = new Print($expression.text);
	}
;

conditional returns [ASTNode node]:
	CONDITIONAL PAR_OPEN expression PAR_CLOSE
	{
		
		List<ASTNode> 	body = new ArrayList<ASTNode>(),
						elseBody = null;
						
	}
	BRACKET_OPEN (s2=sentence{body.add($s2.node);})* BRACKET_CLOSE
	(ELSE
	{
		elseBody = new ArrayList<ASTNode>();
	}
	BRACKET_OPEN (s3=sentence{elseBody.add($s3.node);})* BRACKET_CLOSE)?
	// a linha acima com o indicador "?" dá suporte à não existência do else.
	{
		$node = new If($expression.text, body, elseBody);
	}
	;

comp returns [ASTNode node]:
	ID COMP_SYMBOLS expression;
	
loop returns [ASTNode node]:
	ID LOOP
	{
		List<ASTNode> params = new ArrayList<ASTNode>();
		List<ASTNode> body = new ArrayList<ASTNode>();
	}
	(s1=forparams{params.add($s1.node);})* // NUMBERS
	BRACKET_OPEN (s2=sentence{body.add($s2.node);})* BRACKET_CLOSE
	{
		if (params.size() > 3) {
			System.out.println("ERRO! Mais que 3 parâmetros.");
			
		}
		
		$node = new For($ID.text, params, body);
	}
	;

expression returns [ASTNode node]:
	t1=factor{$node = $t1.node;} 
	(PLUS t2=factor{$node = new Addition($node, $t2.node);})*
	(MINUS t3=factor{$node = new Subtraction($node, $t3.node);})*
	;

factor returns [ASTNode node]:
	t1=term{$node = $t1.node;}
	(MULT t2=term{$node = new Multiplication($node, $t2.node);})*
	(DIV t3 = term({$node = new Division($node, $t3.node);}))*
	;

term returns [ASTNode node]:
	NUMBER {$node = new Constant(Double.parseDouble($NUMBER.text));}
	| BOOLEAN {$node = new Constant(Boolean.parseBoolean($BOOLEAN.text));}
	| ID {$node = new VarRef($ID.text);}
	| PAR_OPEN expression {$node = $expression.node;} PAR_CLOSE
	| comp {$node = $comp.node;}
	;

forparams returns [ASTNode node]:
	NUMBER {$node = new Constant(Integer.parseInt($NUMBER.text));};
	
/* Lexer */
PROGRAM: 'main() ';
VAR: 'var';

PRINT: 'print';
CONDITIONAL: 'if';
ELSE: 'else';
LOOP: 'loop';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
COMP_SYMBOLS: '==' | '!=' | 'and' | 'or' | '>' | '<' | '>=' | '<=' ;

ASSIGN: '=';
BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';
PAR_OPEN: '(';
PAR_CLOSE:')';
SEMICOLON: ';';
BOOLEAN: 'True' | 'False';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
STRING: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
WS: [ \n\t\r]+ -> skip;