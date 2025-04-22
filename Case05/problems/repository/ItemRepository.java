package id.ac.binus.problems.dua.repository;

import java.util.List;

public class ItemRepository {
	public static List<Integer> getAllIds() {
		return ItemIdRepository.getAll();
	}
	
	public static List<String> getAllNames() {
		return ItemNameRepository.getAll();
	}
	
	public static List<Integer> getAllPrices() {
		return ItemPriceRepository.getAll();
	}
}
