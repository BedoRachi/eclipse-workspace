package classex_LYJ;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		Person person1 = new Person(); //일반적인 Person 클래스 객체 생성
		System.out.println(person1);
		
		Class pClass = Class.forName("classex_LYJ.Person"); //pClass에 Person 클래스 정보 저장
		Person person2 = (Person)pClass.newInstance(); //newInstance를 통해 pClass에 저장된 클래스 정보(Person)를 기반으로 객체 생성 및 Object to Person으로 형변환
		System.out.println(person2);
	}

}
