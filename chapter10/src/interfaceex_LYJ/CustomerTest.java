package interfaceex_LYJ;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		System.out.println("### Buy,Sell로 업캐스팅  ###");
		Buy buyer = customer; // 업캐스팅(Customer -> Buy)
		buyer.buy(); // = customer.buy();
		buyer.order(); //  = customer.order(); -> 재정의한 order()가 출력됨
		
		Sell seller = customer; // 업캐스팅(Customer -> Sell)
		seller.sell(); // = customer.sell();
		seller.order(); //  = customer.order(); -> 재정의한 order()가 출력됨
		
		if(seller instanceof Customer) {//다운캐스팅 전 검사
			System.out.println("### Customer로 다운캐스팅 ###");
			Customer customer2 =(Customer)seller; // 다운캐스팅(Sell -> Customer)
			customer2.buy(); // = seller.buy();
			customer2.sell(); // = seller.sell();
			customer2.order(); // = seller.order();
		}
		if(buyer instanceof Customer) {
			System.out.println("### Customer로 다운캐스팅 ###");
			Customer customer3 =(Customer)buyer; // 다운캐스팅(Buy -> Customer)
			customer3.buy(); // = seller.buy();
			customer3.sell(); // = seller.sell();
			customer3.order(); // = seller.order();
		}
	}
}
