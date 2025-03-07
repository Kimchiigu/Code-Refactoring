package id.ac.binus.solution;

import java.util.Scanner;
import java.util.Vector;

public class Util {
	private static Scanner java = new Scanner(System.in);
	
	public static void clearScreen() {
		for(int i=0;i<25;i++){
			System.out.println();
		}
	}
	
	public static void displayBorder() {
		for(int j=0;j<80;j++){
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void displayMenu() {
		System.out.println("1. View Car Spesification");
		System.out.println("2. Delete Car");
		System.out.println("3. Exit");
	}
	
	public static void displayAllCars(Vector<Car> cars) {
		for(int i=0;i<cars.size();i++) {
			cars.get(i).displayCar(i);
		}
	}
	
	private static boolean isBetween(int low, int high,int value){
		if(value<low || value>high) return false;
		return true;
	}
	
	public static int displayInput(String text, int low, int high, int value) {
		do{
			System.out.print(text);
			value = java.nextInt(); java.nextLine();
		}while(!isBetween(low,high,value));
		
		return value;
	}
}
