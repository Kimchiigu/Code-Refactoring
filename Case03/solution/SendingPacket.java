package id.ac.binus.solution;

import java.util.Scanner;

public class SendingPacket {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int menu = 0;
		do{
			Menu.clearScreen();
			Menu.printMenu();
			menu = scan.nextInt(); scan.nextLine();
			switch(menu){
			case 1:
				System.out.print("Input sender name: ");
				String senderName = scan.nextLine();
				System.out.println("Input sender phone: ");
				String senderPhone = scan.nextLine();
				System.out.println("Input sender address: ");				
				String senderAddress = scan.nextLine();
				System.out.println("Input sender city: ");
				String senderCity = scan.nextLine();
				System.out.println("Input sender country: ");
				String senderCountry = scan.nextLine();
				Person sender = new Person(senderName, senderPhone, senderAddress, senderCity, senderCountry);
				
				System.out.println("Input packet type: ");
				String packetType = scan.nextLine();
				System.out.println("Input weight [in KG]: ");
				double weight = scan.nextDouble();
				System.out.println("Input description: ");
				String description = scan.nextLine();
				Packet packet = new Packet(packetType, weight, description);
				
				System.out.println("Input receiver name: ");
				String receiverName = scan.nextLine();
				System.out.println("Input receiver phone: ");
				String receiverPhone = scan.nextLine();
				System.out.println("Input receiver address: ");
				String receiverAddress = scan.nextLine();
				System.out.println("Input receiver city: ");
				String receiverCity = scan.nextLine();
				System.out.println("Input receiver country: ");
				String receiverCountry = scan.nextLine();
				Person receiver = new Person(receiverName, receiverPhone, receiverAddress, receiverCity, receiverCountry);
				
				Menu.clearScreen();
				Menu.printSendPacket(sender, receiver, packet);
				scan.nextLine();
				break;
			}
		}while(menu != 2);
	}

}
