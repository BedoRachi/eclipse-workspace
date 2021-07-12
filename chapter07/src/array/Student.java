package array;

public class Student {

	private String  studentID;
	private String name;
	
	public Student(String id, String name) {
		this.studentID = id;
		this.name = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentID +", " + name);
	}
	
}
