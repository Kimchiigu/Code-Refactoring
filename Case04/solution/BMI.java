package id.ac.binus.solution.satu;

public class BMI {

	private float weight;
	private int height;
	private float bmi;
	
	public BMI(float weight, int height) {
		this.weight = weight;
		this.height = height;
		this.bmi = weight/(height*height);
	}
	
	public float getWeight() {
		return weight;
	}
	public int getHeight() {
		return height;
	}
	public float getBmi() {
		return bmi;
	}
	
	public void cekBMI() {
		if(this.bmi<17)
			System.out.println("BMI : " + this.bmi + ", You are Thin");
		else if(this.bmi>=17 && this.bmi<23)
			System.out.println("BMI : " + this.bmi + ", You are Normal");
		else if(this.bmi>=23 && this.bmi<27)
			System.out.println("BMI : " + this.bmi + ", You are ever Weight");
		else
			System.out.println("BMI : " + this.bmi + ", You are Obesitas");
	}
}
