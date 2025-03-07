package id.ac.binus.bloater.solutions;

public class Segitiga implements BangunDatar {

	private int alas;
	private int tinggi;
	
	@Override
	public int luas() {
		return (this.alas * this.tinggi) / 2;
	}

	@Override
	public int keliling() {
		return 0;
	}

}
