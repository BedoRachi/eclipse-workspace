package staticex;

public class Student2 {

	public static void main(String[] args) {
		Student1 lee = new Student1("이지원");
		Student1 son = new Student1("손수경");
		Student1 park = new Student1("박찬호");
		
		lee.setAddress("인천");
		lee.setGrade(80);
		
		
		System.out.println(lee.getStudentName());
		System.out.println(lee.getStudentID());
		System.out.println(lee.getGrade());
		System.out.println(lee.getAddress());
		System.out.println(son.getStudentID());
		System.out.println(park.getStudentID());
		
		System.out.println(lee==son);
		
		
	}
}
