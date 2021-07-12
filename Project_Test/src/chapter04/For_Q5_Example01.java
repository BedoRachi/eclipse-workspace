package chapter04;

public class For_Q5_Example01 {
	// 7일차 PDF Q5 반복문 테스트01(조건문 없이 만들기)

	public static void main(String[] args) {
		int count;
		int blink = 0;
		int star;
		int starCount;

		for (count = 0, star = 1; count < 4; count++) { // 1차 반복문
			for (blink = 3; count < blink; blink--) {// 1-1 반복문
				System.out.print(" "); // 빈칸 만들기
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 반복문
				System.out.print("*"); // 별 만들기
			}
			star += 2; // 홀수씩 증가
			System.out.println(""); // 다음줄로 변경
		}
		for (count = 3, star=5; count > 0; count--) { // 2차 반복문
			for (blink = 4; count < blink; blink--) {// 2-1 반복문
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
