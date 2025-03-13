package id.ac.binus.solution;

public class Menu {

	public static void clearScreen() {
		for (int i = 0; i < 25; i++) {
			System.out.println();
		}
	}
	
	public static void printMenu() {
		System.out.println("1. Send Packet");
		System.out.println("2. Exit");
		System.out.print("Choose: ");
	}
	
	public static void printSendPacket(Person sender, Person receiver, Packet packet) {
		System.out.println("From");
		System.out.println("===========");
		System.out.println("Name\t: "+sender.getName());
		System.out.println("Phone\t: "+sender.getPhone());
		System.out.println("Address\t: "+sender.getAddress());
		System.out.println("City\t: "+sender.getCity());
		System.out.println("Country\t: "+sender.getCountry());
		System.out.println("");
		System.out.println("To");
		System.out.println("===========");
		System.out.println("Name\t: "+receiver.getName());
		System.out.println("Phone\t: "+receiver.getPhone());
		System.out.println("Address\t: "+receiver.getAddress());
		System.out.println("City\t: "+receiver.getCity());
		System.out.println("Country\t: "+receiver.getCountry());
		System.out.println("");
		System.out.println("Packet");
		System.out.println("===========");
		System.out.println("Packet Type\t: "+packet.getPacketType());
		System.out.println("Weight\t\t: "+packet.getWeight()+" kg");
		System.out.println("Description\t: "+packet.getDescription());
	}
}
