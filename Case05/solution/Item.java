package id.ac.binus.solution.dua;

public class Item {
	private int itemId;
	private String itemName;
	private int itemPrice;
	public Item(int itemId, String itemName, int itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public int getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	@Override
	public String toString() {
		return ". " + itemName + " - Rp." + itemPrice;
	}
}
