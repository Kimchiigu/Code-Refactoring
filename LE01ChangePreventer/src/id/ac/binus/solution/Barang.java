package id.ac.binus.solution;

public class Barang {

	private int id;
	private String nama;
	private String tipe;
	private float harga;
	private boolean isImported;
	private int pajak;
	
	public Barang(int id, String nama, String tipe, float harga, boolean isImported, int pajak) {
		super();
		this.id = id;
		this.nama = nama;
		this.tipe = tipe;
		this.harga = harga;
		this.isImported = isImported;
		this.pajak = pajak;
	}
	
	public int getId() {
		return id;
	}
	public String getNama() {
		return nama;
	}
	public String getTipe() {
		return tipe;
	}
	public float getHarga() {
		return harga;
	}
	public boolean isImported() {
		return isImported;
	}
	public int getPajak() {
		return pajak;
	}
	
}
