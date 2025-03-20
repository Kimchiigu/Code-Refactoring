package id.ac.binus.solution.satu;

public class Rectangle extends BangunDatar {

	private int length;
	
	public Rectangle(int length, int wide) {
		super(wide);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	@Override
	public void hitungArea() {
		this.area = this.getLength() * this.getWide();
	}

	@Override
	public void hitungAround() {
		this.around = 2 * (this.getLength() + this.getWide());
	}
	
}
