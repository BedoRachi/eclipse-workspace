package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

		Student s = new Student("박장우");
		Person p1 = (Person) s; // Upcasting
		Person p2 = new Student("TEST"); // Upcasting
		Person p3;
		p3 = s; // Upcasting

		p1.name = "이연준";
		p1.id = "10";
		// p1.grade = "A"; //Error 발생, Person Class에는 grade라는 Variable이 없음
		// p1.department = "HR"; // Error 발생, Person Class에는 id라는 Variable이 없음

		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
	}

}
