package id.ac.binus.solution;

import java.util.Scanner;
import java.util.Vector;

public class CarRepair {
	private Scanner java = new Scanner(System.in);
	private Vector<Car> cars = new Vector<Car>();

	private void initializeCar() {
		cars.add(new Car("Mazda RX-8", 8.9f, "Mazda 13B-MSP Renesis", 247, "PROXES R1R", 18));
		cars.add(new Car("Acura NSX", 9.3f, "Longitudinally mounted 3.5L Twin-Turbo V6", 480, "Ventus V2", 16));
		cars.add(new Car("BMW M4", 9.1f, "3.0 L S55B30T0 twin turbo I6", 425, "Azenis FK510", 19));
	}
	
	private void viewCarSpesification() {
		Util.clearScreen();
		Util.displayBorder();
		Util.displayAllCars(cars);
		java.nextLine();
	}
	
	private void deleteCar() {
		Util.clearScreen();
		Util.displayBorder();
		Util.displayAllCars(cars);
		int idx=0;
		idx = Util.displayInput("Which one you want to delete [1-%d]? ", 1, cars.size(), idx);
		idx--;
		cars.remove(idx);
		System.out.println("Delete Success!");
		java.nextLine();
	}
	
	public CarRepair() {
		initializeCar();
		int n = 0;
		do{
			Util.clearScreen();
			Util.displayMenu();
			n = Util.displayInput("Choose: ", 1, 2, n);
			switch(n){
			case 1:
				viewCarSpesification();
				break;
			case 2:
				deleteCar();
				break;
			}
		}while(n!=3);
	}

	public static void main(String[] args) {
		new CarRepair();
	}
}
