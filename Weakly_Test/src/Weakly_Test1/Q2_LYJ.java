package Weakly_Test1;

import java.util.Scanner;
import java.util.ArrayList;

public class Q2_LYJ {

	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();

		while (true) {
			System.out.print("�ջ��� ������ �Է��ϼ���(����� 0 �Է�). 1 ~ ");
			max = scan.nextInt();
			if (max == 0) {
				System.out.println("���α׷��� ���� �մϴ�.");
				break;
			} else if (max > 0) {
				for (int i = 1; i <= max; i++) {// max ������ �迭�� �Է�
					array.add(i);
				}

				for (int i = 0; i < array.size(); i++) { // �迭�� ũ�⸸ŭ �ݺ�
					sum += array.get(i);
				}
				System.out.println("1~100������ ��: " + sum);
			} else {
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
