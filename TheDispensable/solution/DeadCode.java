package id.ac.binus.solution;

public class DeadCode {

	public double calculate(double price, boolean isDiscount){
		double discountPrice = 0;
		
		if(isDiscount)
			discountPrice = price * 0.15;
		return price - discountPrice;
	}
}
