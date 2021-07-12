package overriding2;

class Shape1 {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("Shape");
	}
}

public class Circle extends Shape1 {
	
	@Override //Anotation의 역할이 주석의 역할도 있지만 Method Override를 위한 검사(실수방지)도 한다.
	public void draw() {
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {

		Shape1 a = new Circle(); // Upcasting
		Shape1 b = new Shape1(); 
		a.paint(); //overriding된 draw가 출력
		b.paint(); // 원본 draw가 출력
		
	}

}