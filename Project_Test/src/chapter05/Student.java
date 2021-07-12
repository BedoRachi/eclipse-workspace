package chapter05;

//@클래스(Class)생성 / 변수와 메소드를 호출 및 사용하여 합쳐 필요한 목적 또는 결과값을 도출
public class Student {

	// @멤버 변수(Member Variable)생성 / 학번, 주민번호, 이름과 같은 속성값을 받기 위해 생성
	int studentID;
	String studentName;
	int grade;
	String address;

	// @메소드(method)생성 / 실제 기능 또는 작업을 하기 위해서 생성 후 필요시 호출하여 사용
	public void showStudentInfo() {
		System.out.println(studentName + "+" + address);
	}

	public String getStudentName() {
		return studentName;

	}

	public void setStudentName(String name) {
		studentName = name;
	}

	// @메인 메소드(Main Method) / Class의 가장 첫번째 또는 처음 실행되는 메소드
	public static void main(String[] args) {
		Student studentAhn = new Student(); // Student Class를 호출하여 studentAhn에 적용
		studentAhn.studentName = "안연수"; // Student Class에서 studentName 변수를 불러와 값을 저장

		System.out.println(studentAhn.studentName); // Student Class의 studentName을 호출-> 위에서 저장된 값이 불러와짐
		System.out.println(studentAhn.getStudentName()); // Student Class의 getStudentName method를 호출 -> Method 내에 기능이 실행
															// -> studentName을 반환(Return) -> Return된 값을 출력(Print)

	}

}
