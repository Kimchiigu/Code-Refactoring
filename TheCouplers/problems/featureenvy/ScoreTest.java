package id.ac.binus.problems.featureenvy;

public class ScoreTest {
	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer("D9876", "Pak Budi");
		Student student = new Student("1234567890", "Amir");
		
		Exam exam = new Exam(student);
		
		lecturer.giveScore(exam, 70);
	}
}
