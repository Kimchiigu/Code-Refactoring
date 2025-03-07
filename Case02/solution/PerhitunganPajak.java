package ac.id.binus.solution;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Nama pegawai : ");
		String nama = sc.next();
		System.out.println("Alamat pegawai : ");
		String alamat = sc.next();
		System.out.println("Phone pegawai : ");
		String phone = sc.next();
		System.out.println("Nip  pegawai: ");
		String nip = sc.next();
		System.out.println("Usia pegawai : ");
		int usia = sc.nextInt();
		System.out.println("Posisi pegawai : ");
		String posisi = sc.next();
		System.out.println("Grade pegawai : ");
		int grade = sc.nextInt();
		System.out.println("Jumlah anak pegawai adalah : ");
		int jumlahAnak = sc.nextInt();
		
		System.out.println("Gaji Karyawan : ");
		double gaji = sc.nextDouble();
		System.out.println("Total tunjangan karyawan : ");
		double tunjangan = sc.nextDouble();
		System.out.println("Sudah Menikah : ");
		boolean menikah = sc.hasNext();
		
		tunjangan = Transaksi.tunjanganKaryawan(jumlahAnak);
		int tanggungan = Transaksi.tanggunganKaryawan(menikah, jumlahAnak);	
		float persertase_pajak = Transaksi.persentasePajakKaryawan(gaji);
		double pajak = Transaksi.pajakKaryawan(gaji, menikah, tanggungan, persertase_pajak);
		gaji = Transaksi.gajiKaryawan(gaji, persertase_pajak);
		
		Karyawan karyawan = new Karyawan(nama, alamat, phone, nip, posisi);
		Transaksi transaksi = new Transaksi(jumlahAnak, menikah, tunjangan, pajak, tanggungan, persertase_pajak, gaji);
		
		System.out.println("Jumlah pajak yang harus dibayarkan adalah : " + transaksi.getPajak());
		System.out.println("Gaji Bersih yang diterima adalah : " + transaksi.getGaji());
	}

}
