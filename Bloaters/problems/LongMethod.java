package id.ac.binus.bloater.problems;

import java.util.Scanner;

/*
 * Smell Code : Long Method
 * Penyebab   : Developer menaruh banyak logika dalam 1 method
 * Solusi     : Extract Method
 */

public class LongMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int bilangan_pertama = scanner.nextInt();
		int bilangan_kedua = scanner.nextInt();
		int hasil = bilangan_pertama + bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama - bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama * bilangan_kedua;
		System.out.println("Hasil : " + hasil);
		hasil = bilangan_pertama / bilangan_kedua;
		System.out.println("Hasil : " + hasil);
	}

}
