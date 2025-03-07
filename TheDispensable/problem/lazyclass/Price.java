package id.ac.binus.problem.lazyclass;

public class Price {
	private int value;

	public Price(int value) throws Exception {
		if(!PriceValidator.validate(value)) {
			throw new Exception("price not valid");
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
