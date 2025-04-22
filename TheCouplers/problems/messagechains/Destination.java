package id.ac.binus.problems.messagechains;

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
	public Position getPosition() {
		return position;
	}
}
