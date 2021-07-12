package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		//�迭 ����
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//������ �Է�
		Customer customerLee = new Customer(10010,"�̼���");
		Customer customerShin = new Customer(10020,"�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030,"ȫ�浿");
		Customer customerYoul = new GoldCustomer(10040,"������");
		Customer customerKim = new VipCustomer(10050,"������",12345);
		
		//������ �迭�� �Է�
		customerList.add(customerLee); //��ĳ����
		customerList.add(customerShin); //��ĳ����
		customerList.add(customerHong); //��ĳ����
		customerList.add(customerYoul); //��ĳ����
		customerList.add(customerKim); // = customerList.add(new VipCustomer(10050,"������",12345));
		
		// �� ���� ��º�
		System.out.println("@@@@@ �� ���� ��� @@@@@");
		for(Customer costomer : customerList) {
			costomer.showCustomerInfo();
			System.out.println("------------------");
		}
		
		//�� ���� �� ����Ʈ ���� ��º�
		System.out.println("@@@@@ ������, ����Ʈ @@@@@ ");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.printf("%S ���� %d ���� �����ϼ̽��ϴ�. %d ����Ʈ �����Ǿ����ϴ�. \n", customer.getCustomerName(), cost, (int)customer.getBonusPoint());
			
		}
		
	}
	
}
