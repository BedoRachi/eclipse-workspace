package chapter9_LYJ.copy;

import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata()); // 업캐스팅
		carList.add(new Grandeur()); // 업캐스팅
		carList.add(new Avante()); // 업캐스팅
		carList.add(new Genesis()); // 업캐스팅
		for(int i=0;i<carList.size();i++) {
			Car car = carList.get(i);
			if(car instanceof Sonata)
				car.run("Sonata");
			else if(car instanceof Grandeur)
				car.run("Grandeur");
			else if(car instanceof Avante)
				car.run("Avante");
			else if(car instanceof Genesis)
				car.run("Genesis");
			
			System.out.println("=====================");
		}
	}

}
