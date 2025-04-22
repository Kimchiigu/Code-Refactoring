package id.ac.binus.problems.messagechains;



public class DistanceTest {

	static BojekDriver driver;
	static Destination destination;
	
	public static void manhattan() {
		DistanceCalculator calc = new Manhattan();
		double result = calc.distance(
			driver.getCurrentPosition().getLatitude(), 
			driver.getCurrentPosition().getLongitude(), 
			destination.getPosition().getLatitude(), 
			destination.getPosition().getLongitude()
		);
		
		double expected = 0.000007;
		//assertEquals(expected, result);
	}
	
	public static void euclidean() {
		DistanceCalculator calc = new Euclidean();
		double result = calc.distance(
			driver.getCurrentPosition().getLatitude(), 
			driver.getCurrentPosition().getLongitude(), 
			destination.getPosition().getLatitude(), 
			destination.getPosition().getLongitude()
		);

		double expected = 0.000005;
		//assertEquals(expected, result);
	}
	
	public static void main(String[] args) {
		driver = new BojekDriver("Amir", new Position(-6.201932, 106.781529));
		destination = new Destination("Binus Anggrek", new Position(-6.201935, 106.781525));
		
		manhattan();
		euclidean();
	}

}
