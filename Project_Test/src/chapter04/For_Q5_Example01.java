package chapter04;

public class For_Q5_Example01 {
	// 7���� PDF Q5 �ݺ��� �׽�Ʈ01(���ǹ� ���� �����)

	public static void main(String[] args) {
		int count;
		int blink = 0;
		int star;
		int starCount;

		for (count = 0, star = 1; count < 4; count++) { // 1�� �ݺ���
			for (blink = 3; count < blink; blink--) {// 1-1 �ݺ���
				System.out.print(" "); // ��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 �ݺ���
				System.out.print("*"); // �� �����
			}
			star += 2; // Ȧ���� ����
			System.out.println(""); // �����ٷ� ����
		}
		for (count = 3, star=5; count > 0; count--) { // 2�� �ݺ���
			for (blink = 4; count < blink; blink--) {// 2-1 �ݺ���
				System.out.print(" "); // ��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 2-2 �ݺ���
				System.out.print("*"); // �� �����
			}
			star -= 2; // Ȧ���� ����
			System.out.println(""); // �����ٷ� ����
		}
	}
}
