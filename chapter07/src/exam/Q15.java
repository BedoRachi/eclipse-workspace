package exam;

public class Q15 {

	public static void main(String[] args) {
		int a, b; // a=10�� �ڸ�, b=1�� �ڸ�

		for (int i = 1; i < 100; i++) {
			a = i / 10; // 10�� �ڸ��� ����
			b = i % 10; // 1�� �ڸ��� ����
			if ((a == 3 || a == 6 || a == 9) && (b == 3 || b == 6 | b == 9)) { //10,1�� �ڸ��� 369 �ϋ�
				System.out.println(i + " �ڼ� ¦¦");
			} else if ((a == 3 || a == 6 || a == 9) && (b != 3 || b != 6 | b != 9)) { //10�� �ڸ��� 369�϶�
				System.out.println(i + " �ڼ� ¦");
			} else if ((a != 3 || a != 6 || a != 9) && (b == 3 || b == 6 | b == 9)) { //1�� �ڸ��� 369�϶�
				System.out.println(i + " �ڼ� ¦");
			}
		}
	}
}
