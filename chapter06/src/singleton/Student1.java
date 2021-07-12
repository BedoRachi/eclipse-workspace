package singleton;

import singleton.Student1;

public class Student1 {
	
	private static Student1 instance = new Student1(null); // �� ��ü�� �����ؼ� �����
	private static int serialNum = 100; // �� ��ü�� �����ؼ� �����
	private int studentID;
	private String studentName;
	private int grade;
	private String address;

	private Student1(String name) {
		this.studentName = name;
		this.studentID = serialNum++; // ��ü�� �߰��� ��� ��� �þ(��ü�� ����X)
	}
	
	public static Student1 getInstance(String name) {
		if(instance == null) {
			instance = new Student1(name);
		}
		return instance;
		//instacne��� ���밴ü�� ���� ���������ν� Student2���� ����Ǵ� ��� ��ü�� ���� �ּҰ��� ������ ��
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
