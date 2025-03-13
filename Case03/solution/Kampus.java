package id.ac.binus.solution;

import java.util.Scanner;
import java.util.Vector;

public class Kampus {

	private static Scanner in = new Scanner(System.in);
	private static Vector<Mahasiswa> listMahasiswa = new Vector<>();
	
	private static int hitungTotalNilai(int nilai, int sks) {
		return nilai * sks;
	}
	
	private static float hitungIPK(int totalnilai, int totalsks) {
		return totalnilai / totalsks;
	}
	
	public static void main(String[] args) {
		int totalnilai = 0;
		int totalsks = 0;
		float ipk = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Nama mahasiswa ke-"+i+" adalah : ");
			String nama = in.next();
			System.out.println("NIM mahasiswa ke-"+i+" adalah : ");
			String nim = in.next();
			Vector<Matakuliah> listMatakuliah = new Vector<>();
			for (int j = 0; j < 5; j++) {
				System.out.println("Matakuliah ke-"+j+" adalah : ");
				String matakuliah = in.next();
				System.out.println("Nilai ke-"+j+" adalah : ");
				int nilai = in.nextInt();
				System.out.println("SKS ke-"+j+" adalah : ");
				int sks = in.nextInt();
				totalnilai += hitungTotalNilai(nilai, sks);
				totalsks += sks;
				ipk = hitungIPK(totalnilai, totalsks);
				listMatakuliah.add(new Matakuliah(matakuliah, nilai, sks));
			}
			
			listMahasiswa.add(new Mahasiswa(nama, nim, ipk, listMatakuliah));
		}
		
		System.out.println("Here are the students : ");
		for (Mahasiswa mahasiswa : listMahasiswa) {
			System.out.println(mahasiswa.getNim()+" - "+mahasiswa.getNama());
			System.out.println(mahasiswa.getIpk());
			for (Matakuliah matakuliahMahasiswa : mahasiswa.getListMatakuliah()) {
				System.out.println(matakuliahMahasiswa.getMatakuliah() + " - " + matakuliahMahasiswa.getSks() + ", Grade : " + matakuliahMahasiswa.getNilai());
			}
		}
	}
}
