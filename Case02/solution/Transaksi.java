package ac.id.binus.solution;

public class Transaksi {
	
	private int jumlahAnak = 0;
	private boolean menikah = false;
	private double tunjangan = 0;
	private double pajak = 0;
	private int tanggungan = 0;
	private float persertase_pajak =0;
	private double gaji = 0;

	public Transaksi(int jumlahAnak, boolean menikah, double tunjangan, double pajak, int tanggungan,
			float persertase_pajak, double gaji) {
		super();
		this.jumlahAnak = jumlahAnak;
		this.menikah = menikah;
		this.tunjangan = tunjangan;
		this.pajak = pajak;
		this.tanggungan = tanggungan;
		this.persertase_pajak = persertase_pajak;
		this.gaji = gaji;
	}

	public int getJumlahAnak() {
		return jumlahAnak;
	}

	public boolean isMenikah() {
		return menikah;
	}

	public double getTunjangan() {
		return tunjangan;
	}

	public double getPajak() {
		return pajak;
	}

	public int getTanggungan() {
		return tanggungan;
	}

	public float getPersertase_pajak() {
		return persertase_pajak;
	}

	public double getGaji() {
		return gaji;
	}

	public static double tunjanganKaryawan(int jumlahAnak) {
		if(jumlahAnak < 3) {
			return 750000*3;
		} else {
			return jumlahAnak * 500000;
		}
	}
	
	public static int tanggunganKaryawan(boolean menikah, int jumlahAnak) {
		if(menikah) {
			if(jumlahAnak > 3) {
				return 3;
			}
		}
		return 1;
	}
	
	public static float persentasePajakKaryawan(double gaji) {
		if(gaji <= 50000000){
			return 0;
		}else if(gaji<=100000000){
			return 0.05f;
		}else if(gaji<200000000){
			return 0.1f;
		}else if(gaji<300000000){
			return 0.15f;
		}else{
			return  0.25f;
		}
	}
	
	public static double pajakKaryawan(double gaji, boolean menikah, int tanggungan, float persertase_pajak) {
		double pajak = 0;
		if(gaji <= 50000000)
			pajak = 0;
		else{
			if(menikah)
				pajak = pajakKaryawanMenikah(gaji, tanggungan, persertase_pajak);
			else
				pajak = pajakKaryawanBelumMenikah(gaji, persertase_pajak);
		}
		return pajak;
	}
	
	public static double pajakKaryawanMenikah(double gaji, int tanggungan, float persertase_pajak) {
		return (gaji-(50000000+2500000+(tanggungan*2000000)))*persertase_pajak;
	}
	
	public static double pajakKaryawanBelumMenikah(double gaji, float persertase_pajak) {
		return (gaji - 50000000)*persertase_pajak;
	}
	
	public static double gajiKaryawan(double gaji, double pajak) {
		return gaji - pajak;
	}
	
}
