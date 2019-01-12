package AST;

import java.io.BufferedWriter;
import java.util.Map;

public class VarDecl implements ASTNode {

	private String name;
	
	public VarDecl(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {
		symbolTable.put(name, new Object());
		return null;
	}
}
