package id.ac.binus.solution;

public class Matakuliah {

	private String matakuliah;
	private int sks;
	private int nilai;
	
	public Matakuliah(String matakuliah, int sks, int nilai) {
		this.matakuliah = matakuliah;
		this.sks = sks;
		this.nilai = nilai;
	}
	
	public String getMatakuliah() {
		return matakuliah;
	}
	public int getSks() {
		return sks;
	}
	public int getNilai() {
		return nilai;
	}
}
