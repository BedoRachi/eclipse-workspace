package staticex;

public class StudentTest2 {

	public static void main(String[] args) {
		Student3 lee = new Student3("������");
		Student3 son = new Student3("�ռ���");
		Student3 park = new Student3("����ȣ");

		lee.setAddress("��õ");
		lee.setGrade(80);

		System.out.println(lee.getStudentName());
		System.out.println(lee.serialNum);
		System.out.println(Student3.serialNum);
		System.out.println(lee.studentID);
		System.out.println(lee.studentName);
		
		System.out.println(lee == son);

	}

}
