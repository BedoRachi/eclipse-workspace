package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student4 studentLee = new Student4(1001,"Lee");
		
		studentLee.setKorean("국어", 100);
		studentLee.setMath("수학", 50);
		studentLee.showStudentInfo();

	}

}
