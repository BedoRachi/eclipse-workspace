package Weakly_Test1;

import java.util.Scanner;

public class Q12_2 {

	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // ���ذ� �Է�
		int src, temp = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("�ݾ��� �Է��Ͻÿ�. >>");
		src = scan.nextInt();

		for (int i = 0; i < unit.length; i++) { // ��� ���ذ� �񱳸� ���� �迭�� ũ�⸸ŭ �ݺ�
			if (src > unit[i]) { // �Է°��� ���ذ����� Ŭ ���
				temp = src / unit[i]; // ��
				System.out.println(unit[i] + "�� ¥��: " + temp + " ��");
				src %= unit[i]; // �������� ���� �ݺ����� �ѱ�
			} else { // �Է°��� ���ذ� ���� ���� ���
				System.out.println(unit[i] + "�� ¥��: 0 ��");
			}
		}

	}
}
