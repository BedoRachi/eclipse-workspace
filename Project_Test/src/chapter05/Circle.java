package chapter05;

public class Circle {

	int circleRadius;
	String circleName;

	public Circle() { // Circle�� �⺻������(��������)(Class�� �̸��� ������ �޼ҵ�)

	}

	public double getArea() {// �޼ҵ� ����(�Է°� X, ���� �� double �ڷ������� ��ȯ
		return 3.14 * circleRadius * circleRadius;
	}

	public void setRadius(int radius) {// �޼ҵ� ����(int �Է°�, ���� �� ��ȯ ����(void))

		circleRadius = radius;

	}

	public static void main(String[] args) {

		Circle pizza = new Circle(); // Circle�����ڸ� ȣ�� -> �޸𸮿� ���� �� Class �ʱ�ȭ -> ��ü ����, ���۷��� �̸� Pizza -> Pizza �ν��Ͻ� ����
										// �Ϸ�
		Circle donut = new Circle(); // Circle�����ڸ� ȣ�� -> �޸𸮿� ���� �� Class �ʱ�ȭ -> ��ü ����, ���۷��� �̸� Donut -> Donut �ν��Ͻ� ����
										// �Ϸ�

		pizza.setRadius(30);
		// CircleŬ������ ���� Pizza ��ü���� setRadius �޼ҵ带 ȣ���Ͽ� 30 �̶�� �Է°��� �ְ� ��ȯ ����
		System.out.println(pizza.getArea());
		// CircleŬ������ ���� Pizza ��ü���� getArea �޼ҵ带 ȣ�� �Ͽ��Է��� ���� double ��ȯ �޾� ���

		pizza.circleRadius = 10; // CircleŬ������ ���� Pizza ��ü���� circleRadius ������ ȣ���Ͽ� 10 �Է�
		pizza.circleName = "����";// CircleŬ������ ���� Pizza ��ü���� circleName ������ ȣ���Ͽ� ���� �Է�
		System.out.println(pizza.circleRadius + " " + pizza.circleName);
		// pizza ��ü���� circleRadius, circleName�� ȣ���Ͽ� ���

		System.out.println(pizza.getArea());
		// pizza ��ü���� getArea �޼ҵ� ȣ���Ͽ� ���

	}
}
