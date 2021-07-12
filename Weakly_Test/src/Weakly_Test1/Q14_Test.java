package Weakly_Test1;

import java.util.Scanner;

public class Q14_Test {

	public static void main(String[] args) {
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };
		Q14 total[] = new Q14[score.length];// course, score 배열을 합칠 목적(Q14)
		Scanner scan = new Scanner(System.in);
		String name = "";

		// course(String), score(int) 배열를 total(Object Q14) 배열에 입력
		for (int i = 0; i < total.length; i++) {
			total[i] = new Q14(course[i], score[i]);
		}

		// 실행부(무한반복)
		while (true) {
			int count = 0; // count 초기화
			System.out.print("과목 이름>> ");
			name = scan.nextLine();

			// 입력값이 "그만"일 경우 while 종료
			if (name.equals("그만")) {
				System.out.println("죵료합니다.");
				break;
			}

			// 입력값을 검사 및 출력
			for (int j = 0; j < total.length; j++) {// 배열의 크기만큼 반복
				if (total[j].getCourseName().equals(name)) { // 객체배열에서 입력값과 과목명 비교
					System.out.println(total[j].getCourseName() + " 의 점수는: " + total[j].getScoreInt());
					count++; // 실행여부 Count
					break; // 출력 후 for break -> while로 돌아가 재입력
				}
			}
			if (count == 0) { // 실행하지 않았을 경우(="그만", 과목명이 아님)
				System.out.println("없는 과목 입니다.");
			}
		}
	}
}
