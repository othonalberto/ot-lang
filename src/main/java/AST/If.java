package AST;

import java.util.Map;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

public class If implements ASTNode {
	private String 			condition;
	private List<ASTNode> 	body;
	private List<ASTNode> 	elseBody;
	
	public If(String condition, List<ASTNode> body, List<ASTNode> elseBody) {
		super();
		this.condition = condition;
		this.body = body;
		this.elseBody = elseBody;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {
		
		int p = 0,
			fim = 0,
			inicial = 0;
		
		boolean entrou = false;
		
		try {	
			arquivo.append("\n");
			String p1, p2, p3;
			
			p = condition.indexOf("and");
			if (p != -1) {
				entrou = true;
				inicial = p;
				fim = p + 3;
			}
			
			p = condition.indexOf("or");
			if (p != -1) {
				entrou = true;
				inicial = p;
				fim = p + 2;
			}
			
			if (entrou) {
				p1 = condition.substring(0, inicial);
				p2 = condition.substring(inicial, fim);
				p3 = condition.substring(fim, condition.length());

				arquivo.append("if " + p1 + " " + p2 + " " + p3 + ":" + "\n");
				
			} else 
				arquivo.append("if " + condition + ":" + "\n");
			
			
			for (ASTNode n: body) {
				if (n.getClass().isInstance(new VarAssign("ok", null)) || n.getClass().isInstance(new Print("ok"))) {
					arquivo.append("\t");
					n.execute(symbolTable, arquivo);
				} else {
					arquivo.append("\t" + n.execute(symbolTable, arquivo) + "\n");
				}
			}

			if (elseBody != null) {
				arquivo.append("else:" + "\n");
				for (ASTNode n: elseBody) {
					if (n.getClass().isInstance(new VarAssign("ok", null)) || n.getClass().isInstance(new Print("ok"))) {
						arquivo.append("\t");
						n.execute(symbolTable, arquivo);
					} else {
						arquivo.append("\t" + n.execute(symbolTable, arquivo) + "\n");
					}
				}
			}
			
			arquivo.append("\n");
			
		} catch (IOException e) {
			System.out.println("ERRO (IF): " + e);
		}
		
		return symbolTable;
	}
}
