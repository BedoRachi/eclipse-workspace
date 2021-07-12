package chapter06_Q6;

public class CardCompany {

	private static CardCompany instance = new CardCompany();

	private CardCompany() {

	}

	public static CardCompany addInstance() {
		if (instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}

	public Card addCard(String name) {
		return new Card(name);
	}

}
