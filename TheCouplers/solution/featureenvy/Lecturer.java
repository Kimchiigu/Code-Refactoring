package id.ac.binus.solution.featureenvy;

/*
 * Smell Code 		  : Feature Envy
 * Reason	  	      : Class Lecturer pada method giveScore & isScored tidak 
 * 						menggunakan data classnya sendiri, tetapi data class 
 * 						lain yaitu class Exam
 * Solution/Treatment : Move Method
 */

public class Lecturer extends Binusian{

	public Lecturer(String id, String name) {
		super(id, name);
		if(id.length() != 5) {
			throw new IllegalArgumentException();
		}
	}
	
	public void giveScore(Exam exam, int score) {
		exam.setScore(this, score);
	}
	
}
