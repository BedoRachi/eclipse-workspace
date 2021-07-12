package arraylist;

import java.util.ArrayList;


public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //Array의 선언

	public Student(int id, String name) { //Student Class를 호출할떄마다(=학생이 추가 될때 마다)
		this.studentID = id; // Student ID
		this.studentName = name; // Student Name
		subjectList = new ArrayList<Subject>(); //Array 생성
	}

	public void addSubject(String name, int score) {//만들어진 Student에 과목과 점수를 추가하기 위해 호출
		Subject subject = new Subject(); // 과목 Object를 호출
		subject.setName(name); //과목 Object에 과목명 입력
		subject.setScore(score); // 과목 Object에 점수명 입력
		subjectList.add(subject); //사전에 생성한 ArrayList에 입력
	}

	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScore();
			s.showSubjectInfo();
		}

		System.out.println("학생명: " + this.studentName + " 학생번호: " + this.studentID + " 학생총점: " + total);
	}

}
