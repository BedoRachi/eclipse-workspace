package chapter04;

import java.util.Scanner;

public class If_Example06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//String input = "";
		int score = 0;
		char grade = 'X';

		System.out.println("당신의 점수를 입력해 주세여 0 ~ 100");
		//input = scan.nextLine();
		//score = Integer.parseInt(input);
		score = scan.nextInt();
		scan.close();
		
		if (score < 101 && score >= 0) {
			if (score >= 90) {
				grade = 'A';
			} else if (score >= 80) {
				grade = 'B';
			} else if (score >= 70) {
				grade = 'C';
			} else if (score >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			System.out.println("당신의 점수는 " + score + "점이고 학점은 " + grade + " 입니다.");
		} else {
			System.out.println("잘못된 값을 입력하였습니다.0~100의 값을 넣으시요");
		}
		
	}
}
