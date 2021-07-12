package staticex;

public class Student3 {
	public static int serialNum = 100;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student3(String name) {
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
