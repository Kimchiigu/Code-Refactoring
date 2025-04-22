package id.ac.binus.problems.dua.repository;

import java.util.ArrayList;
import java.util.List;

public class ItemPriceRepository {
	public static List<Integer> getAll() {
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(12000);
		data.add(6500);
		data.add(130000);
		
		return data;
	}
}
