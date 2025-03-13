package id.ac.binus.solution;

import java.util.Vector;

public class Mahasiswa {

	private String nim;
	private String nama;
	private float ipk;
	private Vector<Matakuliah> listMatakuliah;
	
	public Mahasiswa(String nim, String nama, float ipk, Vector<Matakuliah> listMatakuliah) {
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
		this.listMatakuliah = listMatakuliah;
	}

	public String getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public float getIpk() {
		return ipk;
	}
	public Vector<Matakuliah> getListMatakuliah() {
		return listMatakuliah;
	}
}
