package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "�̿���");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);

		studentLee.showStudentInfo();
		
		studentLee.subjectList.get(0).showSubjectInfo();
		studentLee.subjectList.get(1).showSubjectInfo();
		studentLee.subjectList.get(2).showSubjectInfo();
		System.out.println(studentLee.subjectList.size());
	}

}

/*
 * ����� 
 * �����: ���� ����: 100 
 * �����: ���� ����: 100 
 * �����: ���� ����: 50 
 * �л���: �̿��� �л���ȣ: 1001 �л�����: 250
 * �����: ���� ����: 100 
 * �����: ���� ����: 100 
 * �����: ���� ����: 50
 * 3
 */
