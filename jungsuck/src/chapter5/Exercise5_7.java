package chapter5;

public class Exercise5_7 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println(money);
		for(int i=0; i<coinUnit.length;i++) {
			System.out.println(coinUnit[i] + "¿ø: " + money/coinUnit[i] + " °³");
			money %= coinUnit[i];
		}

	}

}
