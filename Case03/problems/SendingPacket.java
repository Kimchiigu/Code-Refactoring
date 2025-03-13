package id.ac.binus.problems;

import java.util.Scanner;

/*
 * Smell Code : Long Method
 * Reason	  : Developer menaruh banyak logic di dalam 1 method
 * Solution	  : Extract Method
 */

/*
 * Smell Code : Data Class
 * Reason	  : Atribut tidak dienkapsulasi
 * Solution	  : Extract Class
 */

/*
 * Smell Code : Duplicate Code
 * Reason	  : Ada function print spasi loop dan diulang berkali-kali
 * Solution	  : Extract Method
 */

public class SendingPacket {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do{

			for (int i = 0; i < 25; i++) {
				System.out.println();
			}
			
			System.out.println("1. Send Packet");
			System.out.println("2. Exit");
			System.out.print("Choose: ");
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
				
				System.out.println("Input packet type: ");
				String packetType = scan.nextLine();
				System.out.println("Input weight [in KG]: ");
				double weight = scan.nextDouble();
				System.out.println("Input description: ");
				String description = scan.nextLine();
				
				System.out.println("Input receiver name: ");
				String receiverName = scan.nextLine();
				System.out.println("Input receiver phone: ");
				String receiverPhone = scan.nextLine();
				
				System.out.println("Input receiver address: ");
				String receiverAddress = scan.nextLine();
				System.out.println("Input receiver city: ");
				String receiverCity = scan.nextLine();
				System.out.println("Input sender country: ");
				String receiverCountry = scan.nextLine();
				
				for (int i = 0; i < 25; i++) {
					System.out.println();
				}
				
				System.out.println("From");
				System.out.println("===========");
				System.out.println("Name\t: "+senderName);
				System.out.println("Phone\t: "+senderPhone);
				System.out.println("Address\t: "+senderAddress);
				System.out.println("City\t: "+senderCity);
				System.out.println("Country\t: "+senderCountry);
				System.out.println("");
				System.out.println("To");
				System.out.println("===========");
				System.out.println("Name\t: "+receiverName);
				System.out.println("Phone\t: "+receiverPhone);
				System.out.println("Address\t: "+receiverAddress);
				System.out.println("City\t: "+receiverCity);
				System.out.println("Country\t: "+receiverCountry);
				System.out.println("");
				System.out.println("Packet");
				System.out.println("===========");
				System.out.println("Packet Type\t: "+packetType);
				System.out.println("Weight\t\t: "+weight+" kg");
				System.out.println("Description\t: "+description);
				scan.nextLine();
				
				break;
			}
		}while(menu != 2);
	}

}
