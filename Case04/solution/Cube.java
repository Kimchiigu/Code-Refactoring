package id.ac.binus.solution.satu;

public class Cube extends BangunRuang {

	public Cube(int wide) {
		super(wide);
		hitungVolume();
		hitungArea();
		hitungAround();
	}

	@Override
	public void hitungVolume() {
		this.volume = this.getWide() * this.getWide() * this.getWide();
	}

	@Override
	public void hitungArea() {
		this.area = 6 * this.getWide() * this.getWide();
	}

	@Override
	public void hitungAround() {
		this.around = 12 * this.getWide();
	}
}
