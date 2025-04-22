package id.ac.binus.problems.dua.app;

import java.util.List;
import java.util.Scanner;

import id.ac.binus.problems.dua.repository.CustomerRepository;
import id.ac.binus.problems.dua.repository.ItemIdRepository;
import id.ac.binus.problems.dua.repository.ItemNameRepository;
import id.ac.binus.problems.dua.repository.ItemPriceRepository;
import id.ac.binus.problems.dua.repository.Response;
import id.ac.binus.problems.dua.user.Customer;

/*
 * Smell Code : Comment
 * Reason     : Ada part of code yang dikomen
 * Treatment  : Hapus Comment
 */

public class App {
	

	private Scanner scan;
	
	public void run() {
		scan = new Scanner(System.in);
		final int angka = 50;
		//add(new) = 'STEP' 
		Customer customer;
		CustomerRepository repo = new CustomerRepository();
		
		class CustomerResponse<T> extends Response {
			private String message;
			private T payload;
			
			public CustomerResponse(boolean success, String message, T payload) {
				super(success);
				this.message = message;
				this.payload = payload;
			}
			
			public String getMessage() {
				return message;
			}
			public T getPayload() {
				return payload;
			}
		}

		
		class ItemRepository {
			public List<Integer> getAllIds() {
				return ItemIdRepository.getAll();
			}
			
			public List<String> getAllNames() {
				return ItemNameRepository.getAll();
			}
			
			public List<Integer> getAllPrices() {
				return ItemPriceRepository.getAll();
			
				
		while(true) {
			for(int i = 0; i < step; i++) {
				System.out.println();
			}
			
			System.out.println("CoRe Shop 1.0");
			System.out.println("Welcome, " + customer.getUsername());
			System.out.println(customer.getTier() + " Tier");
			System.out.println("==================================");
			System.out.println("What do you want to buy today?");
			
			int size = itemIds.size();
			
			for(int i = 0; i < size; i++) {
				System.out.println((i+1) + ". " + itemNames.get(i) + " - Rp." + itemPrices.get(i));
			}
			
			System.out.println("0. Exit");
			System.out.println("==================================");
			
			String tempChoice = "";
			int choice = -1;
			while(choice < 0 || choice > (size+1)) {
				try {
					System.out.print("> ");
					tempChoice = scan.nextLine();
					choice = Integer.parseInt(tempChoice);
				}
				catch(Exception ex) { 
					choice = -1;
				}
			}
			
			if(choice == 0) break;
			
			int due = customer.pay(itemPrices.get(choice-1));
			
			System.out.println();
			System.out.println("You have bought : " + itemNames.get(choice-1) + " [" + itemIds.get(choice-1) + "]");
			System.out.println("Payment due     : Rp." + due);
			if(itemPrices.get(choice-1) > due) {
				System.out.println("You saved       : Rp." + (itemPrices.get(choice-1) - due));
			}
			System.out.println("Sending to      : " 
					+ customer.getAddress().getStreet() + ", "
					+ customer.getAddress().getCity() + ", "
					+ customer.getAddress().getCountry());
			
			System.out.print("Press Enter to continue...");
			scan.nextLine();
				}
			}

		}
	}
}
	
