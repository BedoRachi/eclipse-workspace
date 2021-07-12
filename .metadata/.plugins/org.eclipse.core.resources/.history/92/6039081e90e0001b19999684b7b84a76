package chapter9_LYJ;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata()); // 업캐스팅
		carList.add(new Grandeur()); // 업캐스팅
		carList.add(new Avante()); // 업캐스팅
		carList.add(new Genesis()); // 업캐스팅
		for(Car car : carList) {
			car.run(); //템플릿 메소드 실행
			System.out.println("=====================");
		}
	}

}
