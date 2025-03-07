package ac.id.binus.solution;

public class Karyawan {

	private String nama = "";
	private String alamat = "";
	private String phone = "";
	private String nip = "";
	private String posisi = "";
	
	public Karyawan(String nama, String alamat, String phone, String nip, String posisi) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.phone = phone;
		this.nip = nip;
		this.posisi = posisi;
	}

	public String getNama() {
		return nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public String getPhone() {
		return phone;
	}

	public String getNip() {
		return nip;
	}

	public String getPosisi() {
		return posisi;
	}
	
}
