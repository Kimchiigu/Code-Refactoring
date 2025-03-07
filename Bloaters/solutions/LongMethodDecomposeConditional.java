package id.ac.binus.bloater.solutions;

/*
 * Format jawaban buat ujian yang bakal dichecklist (boleh indo/inggris)
 * Smell Code : Long Method
 * Penyebab   : Developer menumpuk code di parameter condition
 * Solusi     : Decompose Conditional
 */

public class LongMethodDecomposeConditional {

	public static boolean isOddPositive(int bilangan) {
		if(bilangan > 0) {
			if(bilangan % 2 == 1) {
				return true;
			}
		} 
		
		return false;
	}
	
	public static void main(String[] args) {
		int bilangan = 11;
		
		if(isOddPositive(bilangan)) {
			System.out.println("Bilangan bulat ganjil positif");
		} else {
			System.out.println("Bukan bilangan bulat ganjil positif");
		}
	}

}
