package game;

public class Punto2D {

	protected int x;
	protected int y;

	public Punto2D() {
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void SetPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

}