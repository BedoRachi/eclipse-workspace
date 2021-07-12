package inheritance;

public class Point {

	private int x, y; // child class에서 접근 불가
	public int x1; // child class 에서 접근 가능(외부,내부 패키지 O)
	protected int z1; // child class 에서 접근 가능(내부 패키지O, 외부 패키지는 상속시에만 접근 가능)
	int y1;  // child class 에서 접근 가능(내부패키지만 O)
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.printf("( %s : %s ) \n", x, y);
	}
	
	
}
