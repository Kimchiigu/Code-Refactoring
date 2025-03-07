package id.ac.binus.solution.speculativegenerality;

public class Price {

	private int value;
	private Currency currency;
	
	public Price(int value, Currency currency) {
		super();
		this.value = value;
		this.currency = currency;
	}

	public int getValue() {
		return value;
	}

	public Currency getCurrency() {
		return currency;
	}
	
}
