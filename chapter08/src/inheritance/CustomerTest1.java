package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("?̼???");
		customerLee.setBonusPoint(1000);
		customerLee.showCustomerInfo();
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("??????");
		customerKim.setBonusPoint(10000);
		customerKim.showCustomerInfo();
	}
}
