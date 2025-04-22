package id.ac.binus.solution.dua;

public class Customer {
	private String username;
	private String password;
	private String street;
	private String city;
	private String country;
	private String tier;
	public Customer(String username, String password, String street, String city, String country, String tier) {
		super();
		this.username = username;
		this.password = password;
		this.street = street;
		this.city = city;
		this.country = country;
		this.tier = tier.equalsIgnoreCase("Normal")? "Blue":"VIP";
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public String getTier() {
		return tier;
	}
	
	@Override
	public String toString() {
		return street + ", " + city + ", " + country;
	}
}
