package inheritance;

public class CustomerTest2 {
	
	public static void main(String[] args) {
		VipCustomer customerKim = new VipCustomer(10020, "김유신", 112);
		//customerKim.setCustomerID(10020);
		//customerKim.setCustomerName("김유신");
		customerKim.setBonusPoint(10000);
		customerKim.showCustomerInfo();
	}

}

/*
 * 출력값
 *
 * Customer 생성자 호출 
 * VIPCustomer 생성자 호출 
 * 이름: 김유신 
 * 번호: 10020 
 * 등급: VIP 
 * 포인트: 10000.0
 */