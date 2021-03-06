package overriding;

class Shape {
	public Shape next; //객체형 자료형

	public Shape() {
		next = null;//객체형 자료형을 초기화
	}

	public void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape { // 상속
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape { // 상속
	public void draw() { // 메소드 오버라이딩
		System.out.println("Ract");
	}
}

class Circle extends Shape { // 상속
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class OervrridingEx {
	static void paint(Shape p) {
		p.draw(); 
	}

	public static void main(String[] args) {
		/*
		 * Shape shape = new Shape(); shape.draw(); Line line = new Line(); line.draw();
		 * Rect rect = new Rect(); rect.draw(); Circle circle = new Circle();
		 * circle.draw();
		 */ 
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
