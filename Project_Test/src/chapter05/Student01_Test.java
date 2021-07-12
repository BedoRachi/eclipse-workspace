package chapter05;

public class Student01_Test {

	int studentID;
	String studentName;
	int grade;
	String address;

	public void showStudentInfo() { // 입력값 없이 호출 시 print하며 반환값도 없다(void)
		System.out.println(studentName + "," + address);
	}

	public static int add(int n1, int n2) { // 입력값 int n1, int n2(인자)를 SUM 후 SUM 값을 (int로)반환 해주는 메소드 생성
		int result = n1 + n2; // Static 메소드에서는 Static 메소드만 호출 가능함
		return result;
	}

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		int sum = add(num1, num2); // 'add' 메소드를 호출하여 num1,num2를 입력하고 값을 반환 받아 sum 변수에 입력
		
		System.out.println(sum);

	}

}
