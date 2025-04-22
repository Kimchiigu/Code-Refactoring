package id.ac.binus.problems.dua.user;

public class Customer {
	public static final int NORMAL = 0;
	public static final int VIP = 1;
	
	protected int id;
	protected String username;
	protected Address address;
	protected int tier;
	
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean setTier(int tier) {
		if(tier == NORMAL || tier == VIP) {
			this.tier = tier;
			return true;
		}
		return false;
	}
	public String getTier() {
		switch(tier) {
			case NORMAL:
				return "Blue";
			case VIP:
				return "VIP";
		}
		return null;
	}
	
	public int pay(int price) {
		switch(tier) {
			case NORMAL:
				return price;
			case VIP:
				return price - (price * 20 / 100);
		}
		return Integer.MIN_VALUE;
	}
}
