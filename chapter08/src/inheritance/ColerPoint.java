package inheritance;

public class ColerPoint extends Point {//parent class : Point, child clas: ColerPoing
	
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint(); //Point(parent class)에서 상속받은 Method이다.
	}
}
