package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		//배열 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//고객정보 입력
		Customer customerLee = new Customer(10010,"이순신");
		Customer customerShin = new Customer(10020,"신사임당");
		Customer customerHong = new GoldCustomer(10030,"홍길동");
		Customer customerYoul = new GoldCustomer(10040,"이율곡");
		Customer customerKim = new VipCustomer(10050,"김유신",12345);
		
		//고객정보 배열에 입력
		customerList.add(customerLee); //업캐스팅
		customerList.add(customerShin); //업캐스팅
		customerList.add(customerHong); //업캐스팅
		customerList.add(customerYoul); //업캐스팅
		customerList.add(customerKim); // = customerList.add(new VipCustomer(10050,"김유신",12345));
		
		// 고객 정보 출력부
		System.out.println("@@@@@ 고객 정보 출력 @@@@@");
		for(Customer costomer : customerList) {
			costomer.showCustomerInfo();
			System.out.println("------------------");
		}
		
		//고객 할일 및 포인트 정보 출력부
		System.out.println("@@@@@ 할인율, 포인트 @@@@@ ");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.printf("%S 님이 %d 원을 지불하셨습니다. %d 포인트 적립되었습니다. \n", customer.getCustomerName(), cost, (int)customer.getBonusPoint());
			
		}
		
	}
	
}
