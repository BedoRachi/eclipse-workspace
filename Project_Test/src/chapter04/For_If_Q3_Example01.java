package chapter04;

public class For_If_Q3_Example01 {
// å 123P Q3���� 
	public static void main(String[] args) {
		int dan;
		int soo;
		int temp = 0;

		for (dan = 1; dan < 10; dan++) {
			System.out.println(dan + "�� ���ϱ�");
			for (soo = 1; soo < 10; soo++) {
				if (dan >= soo) {
					temp = dan * soo;
					System.out.println(dan + " X " + soo + " = " + temp);
				}
				else
					break;
			}
			System.out.println(" ");

		}

	}
}