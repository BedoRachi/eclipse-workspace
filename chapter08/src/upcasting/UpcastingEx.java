package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

		Student s = new Student("�����");
		Person p1 = (Person) s; // Upcasting
		Person p2 = new Student("TEST"); // Upcasting
		Person p3;
		p3 = s; // Upcasting

		p1.name = "�̿���";
		p1.id = "10";
		// p1.grade = "A"; //Error �߻�, Person Class���� grade��� Variable�� ����
		// p1.department = "HR"; // Error �߻�, Person Class���� id��� Variable�� ����

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}

}
