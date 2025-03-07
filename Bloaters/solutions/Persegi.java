package id.ac.binus.bloater.solutions;

public class Persegi implements BangunDatar {

	private int sisi;
	
	public Persegi(int sisi) {
		super();
		this.sisi = sisi;
	}
	
	@Override
	public int luas() {
		return this.sisi * this.sisi;
	}

	@Override
	public int keliling() {
		return 4 * this.sisi;
	}

}
