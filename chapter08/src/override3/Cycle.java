package override3;

class Shape {
	protected String name;
	protected String test;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}


public class Cycle extends Shape {
	protected String name;
	
	public void draw() { // 메소드 재정의
	name = "Circle"; // 자식 클래스의 name에 입력
	super.name = "Shape"; //부모 클래스의 name에 입력
	super.test = "Test"; //부모 클래스의 test에 입력
	super.draw(); // 부모 클래스의 name을 출력
	System.out.println(name); //자식 클래스의 name을 출력
	System.out.println(test); //자식클래스의 test를 출력(자식 클래스에서 재정의가 없었으므로 부모 클래스껄 사용함)
	}
	
	public static void main(String[] args) {
		Shape b = new Cycle(); // 업캐스팅(Shape의 변수와 메소드만 사용)
		b.paint();

	}

}
