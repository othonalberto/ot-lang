package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class For implements ASTNode {
	private String 			var;
	private List<ASTNode> 	body;
	private List<ASTNode> 	params;
	
	public For(String var, List<ASTNode> params, List<ASTNode> body) {
		super();
		this.var = var;
		this.body = body;
		this.params = params;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {	
		try {
			arquivo.append("\n");
			for (int q = 0; q < i; q++) {
				
			}
			arquivo.append("for " + var + " in range(" +
							params.get(0).execute(symbolTable, null) +", " +
							params.get(1).execute(symbolTable, null) +", " +
							params.get(2).execute(symbolTable, null) + "):" + "\n");
			
			for (ASTNode n: body) {
				if (n.getClass().isInstance(new VarAssign("ok", null)) || n.getClass().isInstance(new Print("ok")) ) {
					arquivo.append("\t");
					n.execute(symbolTable, arquivo);
				} else {
					arquivo.append("\t" + n.execute(symbolTable, arquivo) + "\n");
				}
			}
			
		} catch (IOException e) {
			System.out.println("ERRO (FOR): " + e);
		}

		return symbolTable;
		
	}
}

