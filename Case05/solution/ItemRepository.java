package id.ac.binus.solution.dua;

import java.util.ArrayList;

public class ItemRepository {
	
	ArrayList<Item> items = new ArrayList<Item>();

	public ItemRepository() {
		items.add(new Item(1,"Chitato 68g",12000));
		items.add(new Item(4,"Chiki Balls 55g",6500));
		items.add(new Item(11,"Pantene Anti-Dandruff 1200ml",130000));
		
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
}
