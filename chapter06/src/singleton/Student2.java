package singleton;

public class Student2 {

	public static void main(String[] args) {
		Student1 lee = Student1.getInstance("������");
		Student1 son = Student1.getInstance("�����");
		Student1 park = Student1.getInstance("����ȣ");

		lee.setAddress("��õ");
		lee.setGrade(80);

		System.out.println(lee.getStudentName());
		System.out.println(lee.getStudentID());
		System.out.println(lee.getGrade());
		System.out.println(lee.getAddress());
		System.out.println(son.getStudentID());
		System.out.println(park.getStudentID());
		
		System.out.println(lee == son);
		System.out.println(son == park);

	}
}
