package interfaceex_LYJ;

public class Customer implements Buy, Sell{ //다중 상속
	
	@Override
	public void sell() { // Sell Interface 재정의
		System.out.println("구매하기");
	}
	
	@Override
	public void buy() { // Buy Interface 재정의
		System.out.println("팔기");
	}
	
	@Override
	public void order() {
		//Buy.super.order();
		System.out.println("재정의한 구매주문");
	}

}
