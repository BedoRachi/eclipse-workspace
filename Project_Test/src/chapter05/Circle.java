package chapter05;

public class Circle {

	int circleRadius;
	String circleName;

	public Circle() { // Circle의 기본생성자(생략가능)(Class와 이름이 동일한 메소드)

	}

	public double getArea() {// 메소드 생성(입력값 X, 연산 후 double 자료형으로 반환
		return 3.14 * circleRadius * circleRadius;
	}

	public void setRadius(int radius) {// 메소드 생성(int 입력값, 연산 후 반환 없음(void))

		circleRadius = radius;

	}

	public static void main(String[] args) {

		Circle pizza = new Circle(); // Circle생성자를 호출 -> 메모리에 적재 및 Class 초기화 -> 객체 생성, 레퍼런스 이름 Pizza -> Pizza 인스턴스 생성
										// 완료
		Circle donut = new Circle(); // Circle생성자를 호출 -> 메모리에 적재 및 Class 초기화 -> 객체 생성, 레퍼런스 이름 Donut -> Donut 인스턴스 생성
										// 완료

		pizza.setRadius(30);
		// Circle클래스로 만든 Pizza 객체에서 setRadius 메소드를 호출하여 30 이라는 입력값을 넣고 반환 없음
		System.out.println(pizza.getArea());
		// Circle클래스로 만든 Pizza 객체에서 getArea 메소드를 호출 하여입력은 없고 double 반환 받아 출력

		pizza.circleRadius = 10; // Circle클래스로 만든 Pizza 객체에서 circleRadius 변수를 호출하여 10 입력
		pizza.circleName = "피자";// Circle클래스로 만든 Pizza 객체에서 circleName 변수를 호출하여 피자 입력
		System.out.println(pizza.circleRadius + " " + pizza.circleName);
		// pizza 객체에서 circleRadius, circleName을 호출하여 출력

		System.out.println(pizza.getArea());
		// pizza 객체에서 getArea 메소드 호출하여 출력

	}
}
