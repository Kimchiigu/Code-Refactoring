package id.ac.binus.solution.inappropriateintimacy;

import java.util.UUID;

/*
 * Smell Code : Inappropriate Intimacy
 * Reason	  : Codingan mengikuti konsep ERD (PK & FK) dalam menentukan data classnya
 * Solution	  : Move Field
 */

public class Product {
	private UUID id;
	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.price = price;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
}
