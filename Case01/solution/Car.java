package id.ac.binus.solution;

public class Car {
	private String carName;
	private Float carRating;
	private String engineName;
	private Integer enginePower;
	private String tireName;
	private Integer tireRadius;
	
	public Car(String carName, Float carRating, String engineName, Integer enginePower, String tireName,
			Integer tireRadius) {
		super();
		this.carName = carName;
		this.carRating = carRating;
		this.engineName = engineName;
		this.enginePower = enginePower;
		this.tireName = tireName;
		this.tireRadius = tireRadius;
	}
	
	public void displayCar(int index) {
		System.out.println("Car No."+(index+1));
		System.out.println(carName+" - "+carRating+"/10.0 (*)");
		System.out.println("\tEngine - "+engineName);
		System.out.println("\t\tPower: "+enginePower+" hp\n");
		System.out.println("\tTires - "+tireName);
		System.out.println("\t\tRadius: "+tireRadius+"\"");
		Util.displayBorder();
	}
	
	public String getCarName() {
		return carName;
	}
	public Float getCarRating() {
		return carRating;
	}
	public String getEngineName() {
		return engineName;
	}
	public Integer getEnginePower() {
		return enginePower;
	}
	public String getTireName() {
		return tireName;
	}
	public Integer getTireRadius() {
		return tireRadius;
	}
	
}
