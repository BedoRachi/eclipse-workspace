package chapter04;

public class For_Q2_Example01 {
// ������ ¦���� ���
	public static void main(String[] args) {
		int dan;
		int soo;
		int temp = 0;

		for (dan = 1; dan < 10; dan++) {
			if (dan % 2 == 1) {
				continue;
			}
			System.out.println(dan + "�� ���ϱ�");
			for (soo = 1; soo < 10; soo++) {
				temp = dan * soo;
				System.out.println(dan + " X " + soo + " = " + temp);
			}
			System.out.println(" ");
		}
	}
}