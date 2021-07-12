package chapter05.circle;

public class Circle {

	public int circleRadius;
	public String circleName;

	public Circle() { // Circle의 기본생성자(생략가능)(Class와 이름이 동일한 메소드)

	}

	public double getArea() {// 메소드 생성(입력값 X, 연산 후 double 자료형으로 반환
		return 3.14 * circleRadius * circleRadius;
	}

	public void setRadius(int radius) {// 메소드 생성(int 입력값, 연산 후 반환 없음(void))

		circleRadius = radius;

	}

	public static void main(String[] args) {

	}

}
