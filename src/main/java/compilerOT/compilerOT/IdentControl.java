package compilerOT.compilerOT;

public final class IdentControl {
	public static int INSTANCE = 0;
	
	public static int getInstance() {
		return INSTANCE;
	}
	
	public static void upInstance() {
		INSTANCE++;
	}
	
	public static void downInstance() {
		INSTANCE--;
	}
	
}
