package reference;

public class Student4 {

	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student4(int i, String string) {
		this.studentID = i;
		this.studentName = string;
		
		korean = new Subject();
		math = new Subject();
	}

	public void setKorean(String string, int i) {
		korean.subjectName = string;
		korean.scorePoint = i;
		
	}

	public void setMath(String string, int i) {
		math.scorePoint = i;
		math.subjectName = string;
		
	}

	public void showStudentInfo() {
		int total =  korean.getScorePoint() + math.getScorePoint();
		System.out.println("รัมก = " + total);
		System.out.println(korean.subjectName);
		System.out.println(math.subjectName);
		
	}

}
