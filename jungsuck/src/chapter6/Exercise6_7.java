package chapter6;

class MyPoint {
	int x, y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
		return Math.sqrt(Math.pow(Math.abs(x - this.x), 2) + Math.pow(Math.abs(y - this.y), 2));
	}
}

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));

	}
}
