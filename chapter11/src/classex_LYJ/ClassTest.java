package classex_LYJ;

public class ClassTest {
	//CLASSNAME.java(Person.java)�� CLASSNAME.class(Person.class) ������ ������
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass(); //Object.getClass() �޼ҵ带 ���� person(Person) Class ���� ����
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; //Person Class�� Class ������ ����
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex_LYJ.Person"); //Class�� ������ ���� ����
		System.out.println(pClass3.getName());
		
	}
}
