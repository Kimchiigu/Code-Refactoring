package id.ac.binus.solution;

public class Penjualan {
	public void tampilkanPenjualan(Barang barang) {
		System.out.println("ID barang : " + barang.getId());
		System.out.println("Nama barang : " + barang.getNama());
		System.out.println("Tipe barang : " + barang.getTipe());
		System.out.println("Harga barang : " + barang.getHarga());
	}
	
}
