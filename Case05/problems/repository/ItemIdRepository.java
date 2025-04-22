package id.ac.binus.problems.dua.repository;

import java.util.ArrayList;
import java.util.List;

public class ItemIdRepository {
	public static List<Integer> getAll() {
		List<Integer> data = new ArrayList<Integer>();
		
		data.add(1);
		data.add(4);
		data.add(11);
		
		return data;
	}
}
