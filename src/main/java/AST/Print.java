package AST;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Map;

public class Print implements ASTNode {
	private String objeto;
	
	public Print(String objeto) {
		this.objeto = objeto;
	}

	@Override
	public Object execute(Map<String, Object> symbolTable, BufferedWriter arquivo) {
		try {
			arquivo.append("print(" + objeto + ")" + "\n");
		} catch (IOException e) {
			System.out.println("ERRO (PRINT): " + e);
		}
		
		return null;
	}
}
