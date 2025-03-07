package id.ac.binus.bloater.problems;

/*
 * Smell Code : Large Class
 * Reason     : Developer memasukkan method terus menerus ke dalam 1 class
 * Solution   : Extract Class
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
		
	}

}
