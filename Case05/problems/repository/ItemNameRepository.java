package id.ac.binus.problems.dua.repository;

import java.util.ArrayList;
import java.util.List;

public class ItemNameRepository {
	public static List<String> getAll() {
		List<String> data = new ArrayList<String>();
		
		data.add("Chitato 68g");
		data.add("Chiki Balls 55g");
		data.add("Pantene Anti-Dandruff 1200ml");
		
		return data;
	}
}
