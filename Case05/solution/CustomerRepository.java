package id.ac.binus.solution.dua;

import java.util.ArrayList;

public class CustomerRepository {
	
	ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public int authenticate(String username, String password) {
		int index = 0;
		for(Customer customer : customers) {
			if(customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
				return index;
			}
			index++;
		}
		return -1;
	}
	
	public CustomerRepository() {
		customers.add(new Customer("Jason","jason123","Jl. Minyak","Balikpapan","Indonesia","Normal"));
		customers.add(new Customer("Therawan","therawan123","Jl. Darma Bakti","Pekalongan","Indonesia","VIP"));
	}
	
	public int due(int index, int price) {
		if(customers.get(index).getTier().equalsIgnoreCase("VIP")) {
			return (int)(price*0.8);
		}
		return price;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
}
