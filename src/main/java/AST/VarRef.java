package AST;

import java.io.BufferedWriter;
import java.util.Map;

public class VarRef implements ASTNode {
	private String name;
	
	public VarRef(String name) {
		super();
		this.name = name;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {
		return symbolTable.get(name);
	}
}
