package id.ac.binus.bloater.problems;

/*
 * Smell Code : Long Method Decompose Conditional
 * Reason	  : Developer menaruh kondisi yang panjang pada if statement
 * Solution	  : Extract Parameter Method
 */

public class LongMethodDecomposeConditional {

	public static void main(String[] args) {
		int bilangan = 11;
		
		if(bilangan % 2 == 1 && bilangan > 0) {
			System.out.println("Bilangan bulat ganjil positif");
		} else {
			System.out.println("Bukan bilangan bulat ganjil positif");
		}
	}

}
