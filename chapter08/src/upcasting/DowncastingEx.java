package upcasting;

public class DowncastingEx {

	public static void main(String[] args) {

		Person p = new Student("ÀÌ¼ø½Å"); // upcasting
		p.id = "100";

		Student s = (Student) p; // downcasting
		s.grade = "A";
		s.department = "HR";

		System.out.println(s.name);
		System.out.println(s.id);
		System.out.println(s.department);
		System.out.println(s.grade);

	}

}
