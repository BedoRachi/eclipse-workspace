package map.hashmap;
//hashCode를 이용한 비교 이므로 중복된 값이 저장되지 않게 하는게 관건!
//containsKey를 이용하여 중복값일 경우 반환해버린다.
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
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1.hashCode());
		System.out.println(sonata2.hashCode());
		System.out.println(sonata1 == sonata2); //hashCode값끼리의 비교
		
		
	}
	
}
