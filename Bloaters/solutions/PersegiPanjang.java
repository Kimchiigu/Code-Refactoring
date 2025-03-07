package id.ac.binus.bloater.solutions;

public class PersegiPanjang implements BangunDatar {

	private int lebar;
	private int panjang;
	
	public PersegiPanjang(int lebar, int panjang) {
		super();
		this.lebar = lebar;
		this.panjang = panjang;
	}

	@Override
	public int luas() {
		return this.lebar * this.panjang;
	}

	@Override
	public int keliling() {
		return 2 * (this.lebar + this.panjang);
	}

}
