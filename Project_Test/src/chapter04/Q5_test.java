package chapter04;

import java.util.Scanner;

public class Q5_test {

	public static void main(String[] args) {

		int lineCount = 0; // �ʱ�ȭ
		// ������ ��¿��� �Է°��� Ȧ�� �϶����� ��ü �ټ� = ���ϱ� ���� ĭ��(=�߰� ��)
		// �� ���� ���� ĭ���� ������ ����� ���ؼ��� ��ü �ټ��� �˸��
		int starCount = 1; // ù ����� �� 1��
		int i = 0; // �ʱ�ȭ
		int j = 0; // �ʱ�ȭ

		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� ��ü �� ���� �Է�(Ȧ��)");
		lineCount = scanner.nextInt();
		int spaceCount = lineCount / 2 + 1; // ��ĭ�� ä���� �ϴ��� Ȯ��(����ĭ��=lineCount/2 & �� 1��)
		if (lineCount % 2 == 1) {

			for (i = 0; i < lineCount; i++) {
				for (j = 0; j < spaceCount; j++) { // ���ʰ����� ä��
					System.out.print(" ");
				}
				for (j = 0; j < starCount; j++) {// ���� ����
					System.out.print("*");
				}
				for (j = 0; j < spaceCount; j++) {// ������ ������ ä��
					System.out.print(" ");
				}
				if (i < lineCount / 2) {// �߰��� �������� ��ܺδ� ���������� ������ +2 / ������� -2��
										// �� ������ ���� for���� 2�� �̹Ƿ� ���� -1�� ����
					spaceCount -= 1;
					starCount += 2;
				} else {// �߰��� �������� �ϴܺδ� ���������� ������ -2 / ������� +2��
						// �� ������ ���� for���� 2�� �̹Ƿ� ���� +1�� ����
					spaceCount += 1;
					starCount -= 2;
				}
				System.out.println(); // 1������ �ϼ��Ͽ��� ������ �����ٷ� �Ѿ
			}
		} else {
			System.out.println("�߸��� �Է��Դϴ�.(���� Ȧ���� �Է�)");
		}

	}

}
