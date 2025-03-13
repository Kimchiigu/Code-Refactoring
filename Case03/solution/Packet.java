package id.ac.binus.solution;

public class Packet {

	private String packetType;
	private double weight;
	private String description;
	
	public Packet(String packetType, double weight, String description) {
		this.packetType = packetType;
		this.weight = weight;
		this.description = description;
	}
	
	public String getPacketType() {
		return packetType;
	}
	public double getWeight() {
		return weight;
	}
	public String getDescription() {
		return description;
	}
}
