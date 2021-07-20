package map.hashmap;
//hashCode�� �̿��� �� �̹Ƿ� �ߺ��� ���� ������� �ʰ� �ϴ°� ����!
//containsKey�� �̿��Ͽ� �ߺ����� ��� ��ȯ�ع�����.
class Car{
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

public class CarTest {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car sonata1 = factory.createCar("���� ��");
		Car sonata2 = factory.createCar("���� ��");
		System.out.println(sonata1.hashCode());
		System.out.println(sonata2.hashCode());
		System.out.println(sonata1 == sonata2); //hashCode�������� ��
		
		
	}
	
}
