package chapter05.circle;

public class Circle_Test {

	public static void main(String[] args) {
		Circle pizza = new Circle(); 
		// Circle생성자를 호출 -> 메모리에 적재 및 Class 초기화 -> 객체 생성, 레퍼런스 이름 Pizza 
		//-> Pizza 인스턴스 생성완료
		
		Circle donut = new Circle(); 
		// Circle생성자를 호출 -> 메모리에 적재 및 Class 초기화 -> 객체 생성, 레퍼런스 이름 Donut 
		//-> Donut 인스턴스 생성완료

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
