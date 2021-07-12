package chapter06_Q5;

public class ToCafe {

	public static void main(String[] args) {
		Customer kim = new Customer("±è¾¾");
		Customer lee = new Customer("ÀÌ¾¾");
		
		Cafe star = new Cafe("StarCafe");
		Cafe kong = new Cafe("KongCafe");
		
		kim.takeAmericano(star);
		lee.takeRatte(kong);
		kim.takeAmericano(star);
		
		lee.showCustomerInfo();
		kim.showCustomerInfo();
		
		star.showCafeInfo();
		kong.showCafeInfo();

	}

}
