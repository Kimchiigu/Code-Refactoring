package id.ac.binus.problem;

/*
 * Smell Code : The Dispensable - Duplicate Code
 * Reason     : Copy-Paste yang mengakibatkan penggunaan/menampilkan 
 * 				data yang sama berulang kali
 * Solution   : Extract Method
 */

public class DuplicateCode {
	public void bar(){
		//clear screen
		for(int i = 0; i < 26; i++){
			System.out.println("");
		}
		
		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("Bar");

		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
	}
	
	public void baz(){
		//clear screen
		for(int i = 0; i < 26; i++){
			System.out.println("");
		}
		
		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("Baz");

		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
	}
	
	public void qux(){
		//clear screen
		for(int i = 0; i < 26; i++){
			System.out.println("");
		}
		
		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("Qux");

		//print = 3x
		for(int i = 0; i < 3; i++){
			System.out.print("=");
		}
		System.out.println("");
	}
}
