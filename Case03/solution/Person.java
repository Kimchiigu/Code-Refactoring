package id.ac.binus.solution;

public class Person {

	private String name;
	private String phone;				
	private String address;
	private String city;
	private String country;
	
	public Person(String name, String phone, String address, String city, String country) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
}
