package witharraylist;

public class GoldCustomer extends Customer {
	double saleRatio;

	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		System.out.println("GoldCustomer(int,String) 생성자 호출");
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

}
