package id.ac.binus.solution.dataclass;

public class User {

	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	
	public User(String firstName, String lastName, String address, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	
}
