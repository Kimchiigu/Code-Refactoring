package id.ac.binus.problem;

/*
 * Smell Code : The Dispensable - Dead Code
 * Reason     : Developer menambahkan code yang tidak perlu
 * Solution   : Code nya dihapus
 */

public class DeadCode {
	public double calculate(double price, boolean isDiscount){
		double discountPrice = 0;
		
		//jika harga kurang dari 10000, diskon 10%
		//selain itu, diskon 20%
		if(isDiscount){
			if(price < 10000){
				discountPrice = price * 0.1;
			} else {
				discountPrice = price * 0.2;
			}
		}
		
		//requirement berubah
		//diskon diketok rata 15%
		if(isDiscount)
			discountPrice = price * 0.15;
		return price - discountPrice;
	}
}
