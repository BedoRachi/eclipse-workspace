package chapter7;

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	int i = 0;

	SutdaDeck() {
		for (i = 0; i < CARD_NUM / 2; i++) {
			if (i == 0 || i == 2 || i == 7) {
				cards[i] = new SutdaCard(i + 1, true);
			} else {
				cards[i] = new SutdaCard(i + 1, false);
			}
		}
		for (; i < CARD_NUM; i++) {
			cards[i] = new SutdaCard(i + 1, false);
		}

	}

	public void shuffle() {
		SutdaCard tmp = null;
		int random = 0;
		for (int i = 0; i < cards.length; i++) {
			random = (int) (Math.random() * 19 + 1);
			tmp = cards[i];
			cards[i] = cards[random];
			cards[random] = tmp;
		}
	}

	public SutdaCard pick(int index) {
		return cards[index];
	}

	public SutdaCard pick() {
		return cards[(int) (Math.random() * 19 + 1)];
	}
}

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;

	}

	@Override
	public String toString() {
		return num + (isKwang ? "K" : ""); // Kwang 이 true일 경우
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++)
			System.out.print(deck.cards[i] + ",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
