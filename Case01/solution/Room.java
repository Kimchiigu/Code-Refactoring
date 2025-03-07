package id.ac.binus.solution;

import java.util.ArrayList;

public class Room {

	private String roomtype;
	private long roomprice;
	private ArrayList<String> roomfacility = new ArrayList<>();
	
	public Room(String roomtype) {
		this.roomtype = roomtype;
		this.roomprice = calculateRoomPrice();
		this.roomfacility = determineRoomFacility();
	}
	
	private long calculateRoomPrice() {
		switch (roomtype.toLowerCase()) {
	        case "economy":
	            return 350000;
	        case "suit":
	            return 450000;
	        case "president":
	            return 600000;
	        default:
	            return 0;
	    }
	}
	
	private ArrayList<String> determineRoomFacility() {
		switch (roomtype.toLowerCase()) {
	        case "economy":
	        	roomfacility.add("Non-AC");
	        	roomfacility.add("Single Bed");
	        	roomfacility.add("Non-Water Heater");
	        case "suit":
	        	roomfacility.add("AC");
	        	roomfacility.add("Single Bed");
	        	roomfacility.add("Water Heater");
	        case "precident":
	        	roomfacility.add("AC");
	        	roomfacility.add("Bed : King size");
	        	roomfacility.add("Water Heater");
	        default:
	        	roomfacility.add("");
	    }
		return roomfacility;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public long getRoomprice() {
		return roomprice;
	}

	public ArrayList<String> getRoomfacility() {
		return roomfacility;
	}
	
}
