package arraylist;

import java.util.ArrayList;


public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList; //Array�� ����

	public Student(int id, String name) { //Student Class�� ȣ���ҋ�����(=�л��� �߰� �ɶ� ����)
		this.studentID = id; // Student ID
		this.studentName = name; // Student Name
		subjectList = new ArrayList<Subject>(); //Array ����
	}

	public void addSubject(String name, int score) {//������� Student�� ����� ������ �߰��ϱ� ���� ȣ��
		Subject subject = new Subject(); // ���� Object�� ȣ��
		subject.setName(name); //���� Object�� ����� �Է�
		subject.setScore(score); // ���� Object�� ������ �Է�
		subjectList.add(subject); //������ ������ ArrayList�� �Է�
	}

	public void showStudentInfo() {
		int total = 0;
		for (Subject s : subjectList) {
			total += s.getScore();
			s.showSubjectInfo();
		}

		System.out.println("�л���: " + this.studentName + " �л���ȣ: " + this.studentID + " �л�����: " + total);
	}

}
