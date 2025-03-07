package id.ac.binus.bloater.solutions;

/*
 * Format jawaban buat ujian yang bakal dichecklist
 * Smell Code : Large Class
 * Penyebab   :
 * Solusi     : Extract Class
 */

public class LargeClass {

	public int luasPersegi(int sisi) {
		return sisi * sisi;
	}
	
	public int kelilingPersegi(int sisi) {
		return 4 * sisi;
	}
	
	public int luasPersegiPanjang(int lebar, int panjang) {
		return panjang * lebar;
	}
	
	public int kelilingPersegiPanjang(int lebar, int panjang) {
		return 2 * (panjang + lebar);
	}
	
	public int luasSegitiga(int alas, int tinggi) {
		return (alas * tinggi) / 2;
	}
	
	public static void main(String[] args) {
		Persegi persegi = new Persegi(5);
		System.out.println("Luas persegi : " + persegi.luas());
		System.out.println("Keliling persegi : " + persegi.keliling());
		
		PersegiPanjang persegiPanjang = new PersegiPanjang(5, 7);
		System.out.println("Luas persegi panjang : " + persegiPanjang.luas());
		System.out.println("Keliling persegi panjang : " + persegiPanjang.keliling());
		
		BangunDatar segitiga = new BangunDatar() {
			
			@Override
			public int luas() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int keliling() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		segitiga.luas();
		segitiga.keliling();
	}

}
