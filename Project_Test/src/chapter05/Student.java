package chapter05;

//@Ŭ����(Class)���� / ������ �޼ҵ带 ȣ�� �� ����Ͽ� ���� �ʿ��� ���� �Ǵ� ������� ����
public class Student {

	// @��� ����(Member Variable)���� / �й�, �ֹι�ȣ, �̸��� ���� �Ӽ����� �ޱ� ���� ����
	int studentID;
	String studentName;
	int grade;
	String address;

	// @�޼ҵ�(method)���� / ���� ��� �Ǵ� �۾��� �ϱ� ���ؼ� ���� �� �ʿ�� ȣ���Ͽ� ���
	public void showStudentInfo() {
		System.out.println(studentName + "+" + address);
	}

	public String getStudentName() {
		return studentName;

	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// @���� �޼ҵ�(Main Method) / Class�� ���� ù��° �Ǵ� ó�� ����Ǵ� �޼ҵ�
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student Class�� ȣ���Ͽ� studentAhn�� ����
		studentAhn.studentName = "�ȿ���"; // Student Class���� studentName ������ �ҷ��� ���� ����

		System.out.println(studentAhn.studentName); // Student Class�� studentName�� ȣ��-> ������ ����� ���� �ҷ�����
		System.out.println(studentAhn.getStudentName()); // Student Class�� getStudentName method�� ȣ�� -> Method ���� ����� ����
															// -> studentName�� ��ȯ(Return) -> Return�� ���� ���(Print)

	}

}
