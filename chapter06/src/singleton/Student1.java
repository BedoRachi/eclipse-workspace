package singleton;

import singleton.Student1;

public class Student1 {
	
	private static Student1 instance = new Student1(null); // 각 객체간 공유해서 사용함
	private static int serialNum = 100; // 각 개체간 공유해서 사용함
	private int studentID;
	private String studentName;
	private int grade;
	private String address;

	private Student1(String name) {
		this.studentName = name;
		this.studentID = serialNum++; // 객체를 추가할 경우 계속 늘어남(객체별 생성X)
	}
	
	public static Student1 getInstance(String name) {
		if(instance == null) {
			instance = new Student1(name);
		}
		return instance;
		//instacne라는 공용객체를 통해 선언함으로써 Student2에서 선언되는 모든 객체는 같은 주소값을 가지게 됨
	}

	public String getStudentName() {
		return studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int getStudentID() {
		return studentID;
	}

}
