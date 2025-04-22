package id.ac.binus.problems.featureenvy;

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
		if(isScored(exam)) {
			throw new IllegalArgumentException("exam already scored");
		}
		
		exam.setScore(this, score);
	}
	
	public boolean isScored(Exam exam) {
		return exam.getExaminer() != null;
	}
}
