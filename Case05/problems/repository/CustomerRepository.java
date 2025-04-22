package id.ac.binus.problems.dua.repository;

import java.util.ArrayList;
import java.util.List;

import id.ac.binus.problems.dua.user.Address;
import id.ac.binus.problems.dua.user.Customer;

public class CustomerRepository {

	private class Dummy {
		public Customer user;
		public String pass;
		
		public Dummy(Customer user, String pass) {
			this.user = user;
			this.pass = pass;
		}
	}
	
	private List<Dummy> dummies;
	
	public CustomerRepository() {
		dummies = new ArrayList<Dummy>();
		
		Address address1 = new Address();
		address1.setStreet("Jl. Minyak");
		address1.setCity("Balikpapan");
		address1.setCountry("Indonesia");
		
		Customer user1 = new Customer();
		user1.setId(1);
		user1.setUsername("Robert");
		user1.setAddress(address1);
		user1.setTier(Customer.NORMAL);
		
		dummies.add(new Dummy(user1, "robrob"));
		
		Address address2 = new Address();
		address2.setStreet("Jl. Darma Bakti");
		address2.setCity("Pekalongan");
		address2.setCountry("Indonesia");
		
		Customer user2 = new Customer();
		user2.setId(2);
		user2.setUsername("Siti");
		user2.setAddress(address2);
		user2.setTier(Customer.VIP);
		
		dummies.add(new Dummy(user2, "s1"));
	}
	
	public CustomerResponse<Customer> authenticate(String username, String password) {
		Customer found = null;
		
		int size = dummies.size();
		for(int i = 0; i < size; i++) {
			Dummy current = dummies.get(i);
			if(current.user.getUsername().equals(username) && current.pass.equals(password)) {
				found = current.user;
				break;
			}
		}
		
		if(found != null) {
			return new CustomerResponse<Customer>(true, "", found);
		}
		
		return new CustomerResponse<Customer>(false, "Wrong username or password", found);
		
	}
}
