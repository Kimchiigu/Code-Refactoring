package id.ac.binus.solution.dua;

import java.util.Scanner;

public class App {
	
	Scanner sc = new Scanner(System.in);
	
	public void clearScreen() {
		for(int i = 0; i < 10; i++) System.out.println();
	}
	
	public int credential() {
		int check = -1;
		CustomerRepository customerRepo = new CustomerRepository();
		do {
			System.out.println("CoRe Shop 1.0");
			System.out.print("Please input your username: ");
			String username = sc.next();
			System.out.print
			("Please input your password: ");
			String password = sc.next();
			check = customerRepo.authenticate(username, password);
			if(check == -1) System.out.println("Wrong username or password!");
			clearScreen();
		} while(check == -1);
		return check;
	}
	
	public void displayCustomer(Customer customer) {
		System.out.println("CoRe Shop 1.0");
		System.out.println("Welcome, " + customer.getUsername());
		System.out.println(customer.getTier() + " Tier");
		System.out.println("==============================");
		System.out.println("What do you want to buy today?");
	}
	
	public void displayItems(ItemRepository itemRepo) {
		int num = 1;
		for(Item item : itemRepo.getItems()) {
			System.out.println(num + item.toString());
			num++;
		}
		System.out.println("0. Exit");
		System.out.println("==============================");
		System.out.print(">> ");
	}
	
	public void checkout(Item item, int due) {
		System.out.println("You have bought : " + item.getItemName());
		System.out.println("Payment due     : Rp." + due);
		if(item.getItemPrice() > due) {
			System.out.println("You saved       : Rp." + (item.getItemPrice() - due));
		}
	}
	
	public void run() {
		int choice = 0;
		int index = credential();
		
		do {
			CustomerRepository customerRepo = new CustomerRepository();
			Customer customer = customerRepo.getCustomers().get(index);
			displayCustomer(customer);
			
			ItemRepository itemRepo = new ItemRepository();
			displayItems(itemRepo);
			choice = sc.nextInt();
			if(choice==0) break;
			
			Item item = itemRepo.getItems().get(choice-1);
			int due = customerRepo.due(index,item.getItemPrice());
			
			checkout(item,due);
			System.out.println("Sending to      : " + customer.toString());
			
			System.out.print("Press Enter to continue...");
			sc.nextLine(); sc.nextLine();
			
			clearScreen();
		} while(choice!=0);
	}
	
}
