package chapter04;

import java.util.Scanner;

public class If_Case_Q1_Example02 {
	// 책 123P Q1문제 switch-case, scanner를 이용한 사칙연산

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		String operator = "X";
		System.out.println("사칙연산 기호를 넣어주세요");
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
			System.out.println("잘못된 입력값 입니다. : " + operator);
		}
		System.out.println("SUM = " + sum);

	}

}
