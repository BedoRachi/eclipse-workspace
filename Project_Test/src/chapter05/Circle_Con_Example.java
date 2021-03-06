package chapter05;

public class Circle_Con_Example { // 클래스

	int radius;
	String name;

	public Circle_Con_Example() { // 기본 생성자
		radius = 1; // 기본 생성자에 값 추가(생성자를 통해 객체 생성시 적용)
		name = "";
	}

	public Circle_Con_Example(int r, String n) {// int, String의 입력값(매개변수가 있는)을 받는 생성자
		radius = r;// 생성자에 값 추가(생성자를 통해 객체 생성시 적용)
		name = n;

	}

	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {

		Circle_Con_Example cce1 = new Circle_Con_Example();
		cce1.name = "java";

		Circle_Con_Example cce2 = new Circle_Con_Example(2, "pizza");

		System.out.println(cce1.getArea() + " " + cce1.name);
		System.out.println(cce2.getArea() + " " + cce2.name);

	}

}
