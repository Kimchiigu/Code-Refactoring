package id.ac.binus.bloater.solutions;

import java.util.Scanner;

/*
 * Format jawaban buat ujian yang bakal dichecklist (boleh indo/inggris)
 * Smell Code : Long Method
 * Penyebab   : Developer menumpuk code di satu method
 * Solusi     : Extract Method
 */

public class LongMethod {

	public int penjumlahanBilangan(int bilangan_pertama, int bilangan_kedua) {
		return bilangan_pertama + bilangan_kedua;
	}
	
	public int penguranganBilangan(int bilangan_pertama, int bilangan_kedua) {
		return bilangan_pertama - bilangan_kedua;
	}
	
	public int perkalianBilangan(int bilangan_pertama, int bilangan_kedua) {
		return bilangan_pertama * bilangan_kedua;
	}
	
	public int pembagianBilangan(int bilangan_pertama, int bilangan_kedua) {
		return bilangan_pertama / bilangan_kedua;
	}
	
	public int luasPersegi(int sisi) {
		return perkalianBilangan(sisi, sisi);
	}
	
	public int kelilingPersegi(int sisi) {
		return perkalianBilangan(4, sisi);
	}
	
	public int luasPersegiPanjang(int panjang, int lebar) {
		return perkalianBilangan(panjang, lebar);
	}
	
	public int kelilingPersegiPanjang(int panjang, int lebar) {
		return perkalianBilangan(2, penjumlahanBilangan(panjang, lebar));
	}
	
	public int luasSegitiga(int alas, int tinggi) {
		return pembagianBilangan(perkalianBilangan(alas, tinggi), 2);
	}
	
	public LongMethod() {
		Scanner scanner = new Scanner(System.in);
		int bilangan_pertama = scanner.nextInt();
		int bilangan_kedua = scanner.nextInt();
		int hasil = penjumlahanBilangan(bilangan_pertama, bilangan_kedua);
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama - bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama * bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama / bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		
		int sisi = 0;
		System.out.print("Silahkan input panjang sisi persegi : ");
		sisi = scanner.nextInt();
		int luas = luasPersegi(sisi);
		int keliling = kelilingPersegi(sisi);
		System.out.println("Luas persegi dengan sisi " + sisi + " adalah : " + luas);
		System.out.println("Keliling persegi dengan sisi " + sisi + " adalah : " + keliling);
		
		int panjang = 0;
		int lebar = 0;
		System.out.print("Silahkan input panjang persegi panjang : ");
		panjang = scanner.nextInt();
		System.out.print("Silahkan input lebar persegi panjang : ");
		lebar = scanner.nextInt();
		luas = luasPersegiPanjang(panjang, lebar);
		keliling = kelilingPersegiPanjang(panjang, lebar);
		System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah : " + luas);
		System.out.println("Keliling persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah : " + keliling);
		
		int alas = 0;
		int tinggi = 0;
		System.out.print("Silahkan input alas segitiga : ");
		alas = scanner.nextInt();
		System.out.print("Silahkan input tinggi segitiga : ");
		tinggi = scanner.nextInt();
		luas = luasSegitiga(alas, tinggi);
		System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah : " + luas);
	}
	
	public static void main(String[] args) {
		new LongMethod();
	}

}
