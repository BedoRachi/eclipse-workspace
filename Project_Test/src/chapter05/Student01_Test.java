package chapter05;

public class Student01_Test {

	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() { // �Է°� ���� ȣ�� �� print�ϸ� ��ȯ���� ����(void)
		System.out.println(studentName + "," + address);
	}

	public static int add(int n1, int n2) { // �Է°� int n1, int n2(����)�� SUM �� SUM ���� (int��)��ȯ ���ִ� �޼ҵ� ����
		int result = n1 + n2; // Static �޼ҵ忡���� Static �޼ҵ常 ȣ�� ������
		return result;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum = add(num1, num2); // 'add' �޼ҵ带 ȣ���Ͽ� num1,num2�� �Է��ϰ� ���� ��ȯ �޾� sum ������ �Է�
		
		System.out.println(sum);

	}

}
