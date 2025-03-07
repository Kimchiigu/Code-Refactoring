package id.ac.binus.solution.lazyclass;

public class Price {
	private int value;

	public Price(int value) throws Exception {
		if(!isValidPrice(value)) {
			throw new Exception("price not valid");
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	private boolean isValidPrice(int value) {
		return value >= 0;
	}
}
