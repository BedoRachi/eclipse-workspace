package chapter04;

import java.util.Scanner;

public class If_Case_Q1_Example01 {
//å 123P Q1���� if-else, scanner�� �̿��� ��Ģ����
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		String operator = "X";
		Scanner scanner = new Scanner(System.in);

		System.out.println("��Ģ���� ��ȣ�� �־��ּ���");
		operator = scanner.nextLine();

		if (operator.equals("+"))
			sum = num1 + num2;
		else if (operator.equals("-"))
			sum = num1 - num2;
		else if (operator.equals("/"))
			sum = num1 / num2;
		else if (operator.equals("*"))
			sum = num1 * num2;
		else
			System.out.println("�߸��� �Է°� �Դϴ�. : " + operator);

		System.out.println("SUM = " + sum);

	}

}
