package id.ac.binus.problems.middleman;

public class ShoppingCartTest {

	public static void main(String[] args) {
		Item item1 = new Item("indomie", 3000);
		Item item2 = new Item("telur", 1000);
		
		ShoppingCart cart = new ShoppingCart();
		cart.add(item1);
		cart.add(item2);
		
		//assertEquals(cart.totalPrice(), 4000);
	}

}
