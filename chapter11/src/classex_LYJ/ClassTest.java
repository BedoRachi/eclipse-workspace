package classex_LYJ;

public class ClassTest {
	//CLASSNAME.java(Person.java)의 CLASSNAME.class(Person.class) 정보를 가져옴
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass(); //Object.getClass() 메소드를 통해 person(Person) Class 정보 저장
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class; //Person Class의 Class 정보를 저장
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex_LYJ.Person"); //Class의 정보를 직접 저장
		System.out.println(pClass3.getName());
		
	}
}
