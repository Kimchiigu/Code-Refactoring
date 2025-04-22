package id.ac.binus.solution.messagechains;

public class BojekDriver {
	private String name;
	private Position currentPosition;
	public BojekDriver(String name, Position currentPosition) {
		super();
		this.name = name;
		this.currentPosition = currentPosition;
	}
	public String getName() {
		return name;
	}
	private Position getCurrentPosition() {
		return currentPosition;
	}
	public double latitude() {
		return this.getCurrentPosition().getLatitude();
	}
	public double longitude() {
		return this.getCurrentPosition().getLongitude();
	}
}
