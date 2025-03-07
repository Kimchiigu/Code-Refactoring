package ac.id.binus.problems;

import java.util.Scanner;

/*
 * Smell Code : Long Method
 * Reason     : Developer menambahkan/update kodingan hanya di 1 method setiap kali penambahan/update fitur
 * Solution   : Extract Method
 */

/*
 * Smell Code : Large Class
 * Reason     : Kita menambahkan method terus menerus ke dalam 1 class
 * Solution   : Extract Class
 */

public class PerhitunganPajak {
	
	public static void main(String[] args) {
		String nama = "";
		String alamat = "";
		String phone = "";
		String nip = "";
		String posisi = "";
		int grade = 0;
		int usia = 0;
		int jumlahAnak = 0;
		double tunjangan = 0;
		
		double gaji = 0;
		double pajak = 0;
		boolean menikah = false;
		int tanggungan = 0;
		float persertase_pajak =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nama pegawai : ");
		nama = sc.next();
		System.out.println("Alamat pegawai : ");
		alamat = sc.next();
		System.out.println("Phone pegawai : ");
		phone = sc.next();
		System.out.println("Nip  pegawai: ");
		nip = sc.next();
		System.out.println("Usia pegawai : ");
		usia = sc.nextInt();
		System.out.println("Posisi pegawai : ");
		posisi = sc.next();
		System.out.println("Grade pegawai : ");
		grade = sc.nextInt();
		System.out.println("Jumlah anak pegawai adalah : ");
		jumlahAnak = sc.nextInt();
		if (jumlahAnak<3)
			tunjangan = 750000*3;
		else
			tunjangan = jumlahAnak*500000;
		
		System.out.println("Gaji Karyawan : ");
		gaji = sc.nextDouble();
		System.out.println("Total tunjangan karyawan : ");
		tunjangan = sc.nextDouble();
		System.out.println("Sudah Menikah : ");
		menikah = sc.hasNext();
		if(menikah){
			if(jumlahAnak>3)
				tanggungan = 3;
		}		
		
		if(gaji <= 50000000){
			persertase_pajak = 0;
		}else if(gaji<=100000000){
			persertase_pajak= 0.05f;
		}else if(gaji<200000000){
			persertase_pajak = 0.1f;
		}else if(gaji<300000000){
			persertase_pajak = 0.15f;
		}else{
			persertase_pajak =  0.25f;
		}
		
		if(gaji <= 50000000)
			pajak = 0;
		else{
			if(menikah)
				pajak = (gaji-(50000000+2500000+(tanggungan*2000000)))*persertase_pajak;
			else
				pajak = (gaji - 50000000)*persertase_pajak;
			if(pajak<0)
				pajak = 0;
		}
		
		gaji = gaji - pajak;
		
		System.out.println("Jumlah pajak yang harus dibayarkan adalah : " + pajak);
		System.out.println("Gaji Bersih yang diterima adalah : " +gaji);
	}

}
