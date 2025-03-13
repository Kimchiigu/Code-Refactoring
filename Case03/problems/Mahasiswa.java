package id.ac.binus.problems;

import java.util.Scanner;

/*
 * Smell Code : Primitive Obsession
 * Reason	  : Data Mahasiswa disimpan dalam beberapa String[] terpisah
 * Solution   : Membuat Class Mahasiswa
 */

/*
 * Smell Code : Long Method
 * Reason	  : Developer menaruh banyak code di dalam 1 method
 * Solution   : Extract Method
 */

/*
 * Smell Code : Data Class
 * Reason	  : Tidak ada encapsulation data Mahasiswa
 * Solution   : Extract Class
 */

public class Mahasiswa {

	public static void main(String[] args) {
		String[] nim = new String[5];
		String[] nama = new String[5];
		String[][] matakuliah = new String[5][5];
		int[][] sks = new int[5][5];
		int[][] nilai = new int[5][5];
		float[] ipk = new float[5];
		int totalnilai = 0;
		int totalsks = 0;
		
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nama mahasiswa ke-"+i+" adalah : ");
			nama[i] = in.next();
			System.out.println("NIM mahasiswa ke-"+i+" adalah : ");
			nim[i] = in.next();
			for (int j = 0; j < 5; j++) {
				System.out.println("Matakuliah ke-"+i+" adalah : ");
				matakuliah[i][j] = in.next();
				System.out.println("Nilai ke-"+i+" adalah : ");
				nilai[i][j] = in.nextInt();
				System.out.println("SKS ke-"+i+" adalah : ");
				sks[i][j] = in.nextInt();
				totalnilai += nilai[i][j]*sks[i][j];
				totalsks += sks[i][j];
				ipk[i] = totalnilai/totalsks;
			}
		}
		System.out.println("Here are the students : ");
		for (int i = 0; i < 5; i++) {
			System.out.println(nim[i]+" - "+nama[i]);
			System.out.println(ipk[i]);
			for (int j = 0; j < 5; j++) {
				System.out.println(matakuliah[i][j] + " - " + sks[i][j] + ", Grade : " + nilai[i][j]);
			}
		}
	}

}
