package chapter04;

import java.util.Scanner;

public class Q5_test {

	public static void main(String[] args) {

		int lineCount = 0; // 초기화
		// 마름모 출력에서 입력값이 홀수 일때에는 전체 줄수 = 제일긴 줄의 칸수(=중간 줄)
		// 즉 제일 많은 칸수를 기준을 만들기 위해서는 전체 줄수만 알면됨
		int starCount = 1; // 첫 출력은 별 1개
		int i = 0; // 초기화
		int j = 0; // 초기화

		Scanner scanner = new Scanner(System.in);
		System.out.println("만들어야할 전체 줄 수를 입력(홀수)");
		lineCount = scanner.nextInt();
		int spaceCount = lineCount / 2 + 1; // 몇칸을 채워야 하는지 확인(공백칸수=lineCount/2 & 별 1개)
		if (lineCount % 2 == 1) {

			for (i = 0; i < lineCount; i++) {
				for (j = 0; j < spaceCount; j++) { // 왼쪽공백을 채움
					System.out.print(" ");
				}
				for (j = 0; j < starCount; j++) {// 별을 찍음
					System.out.print("*");
				}
				for (j = 0; j < spaceCount; j++) {// 오른쪽 공백을 채움
					System.out.print(" ");
				}
				if (i < lineCount / 2) {// 중간줄 기준으로 상단부는 내려갈수록 별수는 +2 / 공백수는 -2임
										// 단 공백을 넣은 for문이 2개 이므로 각각 -1씩 줄임
					spaceCount -= 1;
					starCount += 2;
				} else {// 중간줄 기준으로 하단부는 내려갈수록 별수는 -2 / 공백수는 +2임
						// 단 공백을 넣은 for문이 2개 이므로 각각 +1씩 줄임
					spaceCount += 1;
					starCount -= 2;
				}
				System.out.println(); // 1개줄을 완성하였기 때문에 다음줄로 넘어감
			}
		} else {
			System.out.println("잘못된 입력입니다.(정수 홀수만 입력)");
		}

	}

}
