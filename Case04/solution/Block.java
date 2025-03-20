package id.ac.binus.solution.satu;

public class Block extends BangunRuang {

	private int length;
	private int height;
	
	public Block(int wide, int length, int height) {
		super(wide);
		this.length = length;
		this.height = height;
		hitungVolume();
		hitungArea();
		hitungAround();
	}

	public int getLength() {
		return length;
	}
	
	public int getHeight() {
		return height;
	}

	@Override
	public void hitungVolume() {
		this.volume = 2 * ((this.getLength() * this.getWide()) + (this.getLength() * this.getHeight()) + (this.getWide() * this.getHeight()));
	}

	@Override
	public void hitungArea() {
		this.area = this.getLength() * this.getWide() * this.getHeight();
	}

	@Override
	public void hitungAround() {
		this.around = this.getLength() * this.getWide() * this.getHeight();
	}
	
}
