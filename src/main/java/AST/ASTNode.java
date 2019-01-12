package AST;

import java.util.Map;

import java.io.BufferedWriter;
import java.io.FileWriter;

public interface ASTNode {
	
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo);

}