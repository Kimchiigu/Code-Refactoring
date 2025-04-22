package id.ac.binus.solution.messagechains;

/*
 * Smell Code : Message Chain 
 * Reason     : Mendefinisikan method dan behavior tidak detail
 * Solution   : Move Method
 */

public class Destination {
	private String name;
	private Position position;
	public Destination(String name, Position position) {
		super();
		this.name = name;
		this.position = position;
	}
	public String getName() {
		return name;
	}
	private Position getPosition() {
		return position;
	}
	public double latitude() {
		return this.getPosition().getLatitude();
	}
	public double longitude() {
		return this.getPosition().getLongitude();
	}
}
