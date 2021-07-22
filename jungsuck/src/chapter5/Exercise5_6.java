package chapter5;

public class Exercise5_6 {
	public static void main(String[] args) {
		int money = 2860;
		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };
		System.out.println(money + " 원");

		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			coinNum = money / coinUnit[i];
			if (coin[i] > coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			money = money - (coinUnit[i] * coinNum);
			System.out.println(coinUnit[i] + "원: " + coinNum + " 개");
		}
		if (money > 0) {
			System.out.println("거스름돈이 부족함");
			System.exit(0);
		}
		System.out.println("= 남은 동전의 개수 = ");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 " + coin[i] + " 개 남음");
		}

	}

}
