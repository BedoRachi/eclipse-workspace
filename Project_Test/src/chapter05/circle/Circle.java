package chapter05.circle;

public class Circle {

	public int circleRadius;
	public String circleName;

	public Circle() { // Circle�� �⺻������(��������)(Class�� �̸��� ������ �޼ҵ�)

	}

	public double getArea() {// �޼ҵ� ����(�Է°� X, ���� �� double �ڷ������� ��ȯ
		return 3.14 * circleRadius * circleRadius;
	}

	public void setRadius(int radius) {// �޼ҵ� ����(int �Է°�, ���� �� ��ȯ ����(void))

		circleRadius = radius;

	}

	public static void main(String[] args) {

	}

}
