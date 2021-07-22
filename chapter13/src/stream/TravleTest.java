package stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		List<TravelCustomer> customerList = new ArrayList<>(); //객체형 ArrayList 생성
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println("고객의 명단을 출력합니다.");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		//ArrayList에서 각 객체의 getName을 가져와서 순차적으로 Println 한다.
		
		System.out.println();
		System.out.println("여행의 총 비용을 계산합니다.");
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		//ArrayList에서 각 객체의 getPrice를 Int로 가져와서 sum 후 반환한다.
		System.out.println("총 비용은: " + total + " 원 입니다.");
		
		System.out.println();
		System.out.println("고객 중 20세 이상인 사람의 이름을 정렬하여 출력합니다.");
		customerList.stream().filter(c-> c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		//ArrayList의 각 객체의 getAge을 20과 비교하여 true인 객체들의 getName을 가져와서 정렬 후 순차적으로 Println한다.
	}
	
	
	
}
