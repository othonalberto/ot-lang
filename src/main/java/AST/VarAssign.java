package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

public class VarAssign implements ASTNode {

	private String name;
	private ASTNode expression;

	public VarAssign(String name, ASTNode expression) {
		super();
		this.name = name;
		this.expression = expression;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {
		if (symbolTable.get(name) == null) {
			symbolTable.put(name, new Object());
		}
		
		symbolTable.put(name, expression.execute(symbolTable, null));
		try {
			arquivo.append(name + " = " + symbolTable.get(name) + "\n");
		} catch (IOException e) {
			System.out.println("ERRO (VAR ASSIGN): " + e);
		}
		
		return (name + "=" + symbolTable.get(name));
	}
	
}
