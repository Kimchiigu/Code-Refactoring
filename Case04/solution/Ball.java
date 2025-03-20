package id.ac.binus.solution.satu;

public class Ball extends BangunRuang {

	public Ball(int wide) {
		super(wide);
		hitungVolume();
		hitungArea();
		hitungAround();
	}

	@Override
	public void hitungVolume() {
		this.volume = (float) (4 * 3.14 * this.getWide() * this.getWide());
	}

	@Override
	public void hitungArea() {
		this.area = (float) ((4/3) * 3.14 * this.getWide() * this.getWide() * this.getWide());
	}

	@Override
	public void hitungAround() {
		this.around = 0;
	}
}
