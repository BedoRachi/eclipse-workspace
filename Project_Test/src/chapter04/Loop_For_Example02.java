package chapter04;

public class Loop_For_Example02 {

	public static void main(String[] args) {

		int dan;
		int soo;
		int temp = 0;

		for (dan = 1; dan < 10; dan++) {
			if (dan % 2 == 0) {
				continue;
			}
			System.out.println(dan + "´Ü °öÇÏ±â");
			for (soo = 1; soo < 10; soo++) {
				if (soo % 2 == 0) {
					continue;
				}
				temp = dan * soo;
				System.out.println(dan + " X " + soo + " = " + temp);
			}
			System.out.println(" ");
		}
	}

}
