package classex_LYJ;

public class NewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
		Person person1 = new Person(); //�Ϲ����� Person Ŭ���� ��ü ����
		System.out.println(person1);
		
		Class pClass = Class.forName("classex_LYJ.Person"); //pClass�� Person Ŭ���� ���� ����
		Person person2 = (Person)pClass.newInstance(); //newInstance�� ���� pClass�� ����� Ŭ���� ����(Person)�� ������� ��ü ���� �� Object to Person���� ����ȯ
		System.out.println(person2);
	}

}
