package id.ac.binus.solution.satu;

public class Square extends BangunDatar {

	private float around;
	
	public Square(int wide) {
		super(wide);
		hitungArea();
		hitungAround();
	}
	
	public float getAround() {
		return around;
	}

	@Override
	public void hitungArea() {
		this.area = this.getWide() * this.getWide();
	}

	@Override
	public void hitungAround() {
		this.around = 4 * this.getWide();
	}
}
