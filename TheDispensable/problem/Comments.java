package id.ac.binus.problem;

import java.util.Scanner;

/*
 * Smell Code : Comments
 * Reason     : Developer menambahkan komen untuk mengingat tujuan 
 *              dari masing-masing line of code
 * Solution   : Extract Method
 */

public class Comments {
		//print kemudian scan dan return hasil scan
		public int printMenu(){
			//print header
			System.out.println("====");
			System.out.println("Menu");
			System.out.println("====");
			
			//print menu
			System.out.println("1. Foo");
			System.out.println("2. Bar");
			System.out.println("3. Baz");
			System.out.println("4. Exit");
			
			//scan input
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
}
