package id.ac.binus.problem.dataclass;

/*
 * Smell Code : The Dispensable - Data Class
 * Reason     : Atribut tidak di enkapsulasi dengan baik
 * Solution	  : Membuat class User menjadi class data yang memiliki behavior
 */

public class User {
	private FullName fullName;
	
	private String address;
	private String phone;
	
	//...
	//another User behaviors...
	//...
	
	public void login() {
		//...
	}
	
	public void logout() {
		//...
	}
}
