package compilerOT.compilerOT;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "ot";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Compilando... " + program);

		compilerOTLexer lexer = new compilerOTLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		compilerOTParser parser = new compilerOTParser(tokens);

		compilerOTParser.ProgramContext tree = parser.program();

		compilerOTCustomVisitor visitor = new compilerOTCustomVisitor();
		visitor.visit(tree);

		System.out.println("Compilação finalizada.");
	}
}
