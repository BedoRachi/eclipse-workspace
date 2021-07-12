package Weakly_Test1;

import java.util.Scanner;

public class Q12_2 {

	public static void main(String[] args) {
		int[] unit = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 기준값 입력
		int src, temp = 0;
		Scanner scan = new Scanner(System.in);

		System.out.print("금액을 입력하시오. >>");
		src = scan.nextInt();

		for (int i = 0; i < unit.length; i++) { // 모든 기준값 비교를 위해 배열의 크기만큼 반복
			if (src > unit[i]) { // 입력값이 기준값보다 클 경우
				temp = src / unit[i]; // 몫
				System.out.println(unit[i] + "원 짜리: " + temp + " 개");
				src %= unit[i]; // 나머지는 다음 반복으로 넘김
			} else { // 입력값이 기준값 보다 작을 경우
				System.out.println(unit[i] + "원 짜리: 0 개");
			}
		}

	}
}
