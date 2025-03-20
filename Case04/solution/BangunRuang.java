package id.ac.binus.solution.satu;

public abstract class BangunRuang extends BangunDatar {

	protected float volume;

	public BangunRuang(int wide) {
		super(wide);
	}

	public float getVolume() {
		return volume;
	}
	
	public abstract void hitungVolume();
	
}
