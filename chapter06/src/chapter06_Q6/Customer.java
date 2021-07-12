package chapter06_Q6;

public class Customer {
	
	public static void main(String[] args) {
		

		CardCompany shinHan = CardCompany.addInstance();
		CardCompany woori = CardCompany.addInstance();
		Card lee = shinHan.addCard("이연준");
		Card kim = woori.addCard("김동식");
		
		System.out.print(lee.getCustomerName());
		System.out.println(lee.getCardNum());
		System.out.print(kim.getCustomerName());
		System.out.println(kim.getCardNum());
		System.out.println(lee == kim);
		System.out.println(shinHan == woori);
	}
	


}
