package id.ac.binus.problems;

import java.util.Scanner;

/*
 * Smell Code : Long Method
 * Reason     : Developer menambahkan/update kodingan hanya di 1 method setiap 
 * 				kali penambahan/update fitur
 * Solution   : Extract Method
 */

/*
 * Smell Code : Primitive Obsession
 * Reason     : Informasi tentang tipe kamar, fasilitas, dan harga disimpan 
 * 				dalam array primitif terpisah
 * Solution   : Membuat Class Room
 */

/*
 * Smell Code : Dead Code
 * Reason	  : Terdapat variabel yang tidak digunakan (roomnumber)
 * Solution	  : Menghapus variabel yang tidak dipakai
 */

public class HotelReservation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = "";
		String address = "";
		System.out.println("Visitor's name : ");
		name = in.next();
		System.out.println("Visitor's address : ");
		address = in.next();
		
		System.out.println("how many room?");
		int totalofRoom = in.nextInt();
		int totalPrice = 0;
		
		int roomnumber = 0;
		String[] roomtype = new String[totalofRoom];
		String[] roomfacility = new String[3];
		long roomprice = 0;
		int daysrent = 0;
		
		System.out.println("how many days?");
		daysrent = in.nextInt();
		
		for (int i = 0; i < totalofRoom; i++) {
			System.out.println("Type of room");
			roomtype[i] = in.next();
			if(roomtype[i].equalsIgnoreCase("economy")){
				roomprice = 350000;
			}else if(roomtype[i].equalsIgnoreCase("suit")){
				roomprice = 450000;
			}else if(roomtype[i].equalsIgnoreCase("precident")){
				roomprice = 600000;
			}else
				roomprice = 0;
			
			if(roomtype[i].equalsIgnoreCase("economy")){
				roomfacility[0] = "Non-AC";
				roomfacility[1] = "Singgle bed";
				roomfacility[2] = "Non-Water Heater ";
			}else if(roomtype[i].equalsIgnoreCase("suit")){
				roomfacility[0] = "AC";
				roomfacility[1] = "Singgle bed";
				roomfacility[2] = "Water Heater";
			}else if(roomtype[i].equalsIgnoreCase("precident")){
				roomfacility[0] = "AC";
				roomfacility[1] = "Bed : King size";
				roomfacility[2] = "Water Heater";
			}else{
				roomfacility[0] = "";
				roomfacility[1] = "";
				roomfacility[2] = "";
			}
			
			totalPrice += (daysrent*roomprice); 
		}
		System.out.println("Total : " + totalPrice);
	}
}
