package staticex;

public class Student2 {

	public static void main(String[] args) {
		Student1 lee = new Student1("������");
		Student1 son = new Student1("�ռ���");
		Student1 park = new Student1("����ȣ");
		
		lee.setAddress("��õ");
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
