package id.ac.binus.solution;

import java.util.Scanner;

public class Comments {

	private void printHeader() {
		System.out.println("====");
		System.out.println("Menu");
		System.out.println("====");
	}
	
	private void printMenu() {
		System.out.println("1. Foo");
		System.out.println("2. Bar");
		System.out.println("3. Baz");
		System.out.println("4. Exit");
	}
	
	private int getInput() {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Input [1-4]: ");
			sc.nextInt();
			sc.nextLine();
		}while(input < 1 || input > 4);
		sc.close();
		return input;
	}
	
	public int printPageAndGetInput() {
		printHeader();
		printMenu();
		return getInput();
	}
}
