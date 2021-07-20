package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class CarFactory {
	private HashMap<String, Car> hashMap;
	
	public CarFactory() {
		hashMap = new HashMap<String, Car>();
	}
	
	public static CarFactory getInstance() {
		CarFactory car = new CarFactory();
		return car;
	}
	
	public Car createCar(String name) {
		if(hashMap.containsKey(name)) { //name을 key로 사용하는 Value를 검색
			return hashMap.get(name);  //해당 value를 반환(여기선 Car)
		}
		Car car = new Car(name);
		hashMap.put(name, car);
		return car;
	}

}
