package staticex;

public class Student1 {

	private static int serialNum = 100;//데이터 영역에 저장됨
	private int studentID;
	private String studentName;
	private int grade;
	private String address;

	public Student1(String name) {
		studentName = name;
		studentID = serialNum++;
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
