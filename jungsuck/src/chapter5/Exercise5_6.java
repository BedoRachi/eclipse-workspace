package chapter5;

public class Exercise5_6 {
	public static void main(String[] args) {
		int money = 2860;
		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };
		System.out.println(money + " ��");

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
			System.out.println(coinUnit[i] + "��: " + coinNum + " ��");
		}
		if (money > 0) {
			System.out.println("�Ž������� ������");
			System.exit(0);
		}
		System.out.println("= ���� ������ ���� = ");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "�� " + coin[i] + " �� ����");
		}

	}

}
