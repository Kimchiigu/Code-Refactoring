package id.ac.binus.solution;

import java.util.Scanner;

public class HotelReservation {
	private static long calculatePrice(int daysrent, long roomprice) {
		return daysrent * roomprice;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Visitor's name : ");
		String name = in.next();
		
		System.out.println("Visitor's address : ");
		String address = in.next();
		
		System.out.println("how many room?");
		int totalofRoom = in.nextInt();
		
		System.out.println("how many days?");
		int daysrent = in.nextInt();
		
		long totalPrice = 0;
		for (int i = 0; i < totalofRoom; i++) {
			System.out.println("Type of room");
			String roomtype = in.next();
			Room room = new Room(roomtype);
			totalPrice += calculatePrice(daysrent, room.getRoomprice()); 
		}
		System.out.println("Total : " + totalPrice);
	}
}
