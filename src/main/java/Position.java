
public class Position {

	private int x, y;

	public Position(int i, int j) {
		this.x = i;
		this.y = j;
	}

	public int getX() {
		return x;
	}

	public void setX(byte x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(byte y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

}
