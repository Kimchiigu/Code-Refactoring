package id.ac.binus.solution.satu;

public abstract class BangunDatar {

	protected float area;
	protected float around;
	private int wide;
	
	public BangunDatar(int wide) {
		this.wide = wide;
	}
	
	public float getArea() {
		return area;
	}
	public int getWide() {
		return wide;
	}
	public float getAround() {
		return around;
	}

	public abstract void hitungArea();
	public abstract void hitungAround();
}
