package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "이연준");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("영어", 100);
		studentLee.addSubject("수학", 50);

		studentLee.showStudentInfo();
		
		studentLee.subjectList.get(0).showSubjectInfo();
		studentLee.subjectList.get(1).showSubjectInfo();
		studentLee.subjectList.get(2).showSubjectInfo();
		System.out.println(studentLee.subjectList.size());
	}

}

/*
 * 결과값 
 * 과목명: 국어 점수: 100 
 * 과목명: 영어 점수: 100 
 * 과목명: 수학 점수: 50 
 * 학생명: 이연준 학생번호: 1001 학생총점: 250
 * 과목명: 국어 점수: 100 
 * 과목명: 영어 점수: 100 
 * 과목명: 수학 점수: 50
 * 3
 */
