package id.ac.binus.problem.lazyclass;

/*
 * Smell Code : The Dispensable - Lazy Class
 * Reason     : Developer mendefinisikan 1 class dengan 1 method dimana
 * 				datanya merupakan kepemilikan dari class lain
 * Solution   : Move Method
 */

public class PriceValidator {
	public static boolean validate(int value){
		return value >= 0;
	}
}
