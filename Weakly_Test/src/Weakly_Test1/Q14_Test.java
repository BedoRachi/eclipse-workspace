package Weakly_Test1;

import java.util.Scanner;

public class Q14_Test {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score[] = { 95, 88, 76, 62, 55 };
		Q14 total[] = new Q14[score.length];// course, score �迭�� ��ĥ ����(Q14)
		Scanner scan = new Scanner(System.in);
		String name = "";

		// course(String), score(int) �迭�� total(Object Q14) �迭�� �Է�
		for (int i = 0; i < total.length; i++) {
			total[i] = new Q14(course[i], score[i]);
		}

		// �����(���ѹݺ�)
		while (true) {
			int count = 0; // count �ʱ�ȭ
			System.out.print("���� �̸�>> ");
			name = scan.nextLine();

			// �Է°��� "�׸�"�� ��� while ����
			if (name.equals("�׸�")) {
				System.out.println("�շ��մϴ�.");
				break;
			}

			// �Է°��� �˻� �� ���
			for (int j = 0; j < total.length; j++) {// �迭�� ũ�⸸ŭ �ݺ�
				if (total[j].getCourseName().equals(name)) { // ��ü�迭���� �Է°��� ����� ��
					System.out.println(total[j].getCourseName() + " �� ������: " + total[j].getScoreInt());
					count++; // ���࿩�� Count
					break; // ��� �� for break -> while�� ���ư� ���Է�
				}
			}
			if (count == 0) { // �������� �ʾ��� ���(="�׸�", ������� �ƴ�)
				System.out.println("���� ���� �Դϴ�.");
			}
		}
	}
}
