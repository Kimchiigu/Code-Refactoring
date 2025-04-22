package id.ac.binus.solution.inappropriateintimacy;

public class CatalogTest {

	public static void main(String[] args) {
		Catalog cat = new Catalog("sembako");
		
		cat.addProduct(new Product("indomie", 2500));
		cat.addProduct(new Product("minyak", 15000));

		cat.print();
		System.out.println("");
		
		cat.addProduct(new Product("telur", 500));
		cat.addProduct(new Product("beras", 5000));
		
		cat.print();
		System.out.println("");
	}

}
