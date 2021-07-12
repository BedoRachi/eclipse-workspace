package chapter06_Q6;

public class Card {

	private static int cardNum = 0;
	private String name;
	private int customerNum;

	public Card(String name) {
		this.name = name;
		this.customerNum = cardNum++;
	}

	public int getCardNum() {
		return this.customerNum;
	}

	public String getCustomerName() {
		return this.name;
	}

}
