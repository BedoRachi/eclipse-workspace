package chapter04;

import java.util.Scanner;

public class If_Case_Q1_Example02 {
	// å 123P Q1���� switch-case, scanner�� �̿��� ��Ģ����

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		String operator = "X";
		System.out.println("��Ģ���� ��ȣ�� �־��ּ���");
		operator = scanner.next();

		switch (operator) {
		case "+":
			sum = num1 + num2;
			break;
		case "-":
			sum = num1 - num2;
			break;
		case "/":
			sum = num1 / num2;
			break;
		case "*":
			sum = num1 * num2;
			break;
		default:
			System.out.println("�߸��� �Է°� �Դϴ�. : " + operator);
		}
		System.out.println("SUM = " + sum);

	}

}
