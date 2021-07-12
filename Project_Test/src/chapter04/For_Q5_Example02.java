package chapter04;

import java.util.Scanner;

public class For_Q5_Example02 {
	// 7일차 PDF Q5 반복문 테스트02(조건문X, 스캐너O 만들기)

	public static void main(String[] args) {
		int count;
		int blink;
		int star;
		int starCount;
		int maxCount;
		
		System.out.println("반복횟수를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		maxCount = scanner.nextInt();//최대 반복횟수 입력
		
		for (count = 1, star = 1; count <= maxCount; count++) { // 1차 반복문(최대 반복 횟수)
			for (blink = maxCount; count < blink; blink--) {//1-1 반복문(최대 반복 횟수-1 번 반복하여 빈칸을 만드며 매 반복때 마다 -1칸이 됨)
				System.out.print(" "); //빈칸 만들기
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 반복문(별의 갯수를 홀수번 출럭)
				System.out.print("*"); //별 만들기
			}
			star += 2; // (별의 갯수를 홀수 개씩 증가시킴
			System.out.println(""); //다음줄로 변경
		}
		for (count = maxCount-1, star-=4; count > 0; count--) { // 2차 반복문
			for (blink = maxCount; count < blink; blink--) {// 2-1 반복문
				System.out.print(" "); // 빈칸 만들기
			}
			for (starCount = 0; starCount < star; starCount++) { // 2-2 반복문
				System.out.print("*"); // 별 만들기
			}
			star -= 2; // 홀수씩 감소
			System.out.println(""); // 다음줄로 변경
		}
	}
}

