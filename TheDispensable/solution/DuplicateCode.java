package id.ac.binus.solution;

public class DuplicateCode {

	private void clearScreen() {
		for(int i = 0; i < 26; i++){
			System.out.println("");
		}
	}
	
	private void printSymbol() {
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
	}
	
	private void printEmpty() {
		System.out.println();
	}
	
	public void bar() {
		clearScreen();
		printSymbol();
		printEmpty();
		System.out.println("Bar");
		printSymbol();
		printEmpty();
	}
	public void baz() {
		clearScreen();
		printSymbol();
		printEmpty();
		System.out.println("Baz");
		printSymbol();
		printEmpty();
	}
	public void qux() {
		clearScreen();
		printSymbol();
		printEmpty();
		System.out.println("Qux");
		printSymbol();
		printEmpty();
	}
}
