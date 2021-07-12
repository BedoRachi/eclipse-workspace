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
			System.out.print("합산할 범위를 입력하세요(종료시 0 입력). 1 ~ ");
			max = scan.nextInt();
			if (max == 0) {
				System.out.println("프로그램을 종료 합니다.");
				break;
			} else if (max > 0) {
				for (int i = 1; i <= max; i++) {// max 값까지 배열에 입력
					array.add(i);
				}

				for (int i = 0; i < array.size(); i++) { // 배열의 크기만큼 반복
					sum += array.get(i);
				}
				System.out.println("1~100까지의 합: " + sum);
			} else {
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
		}
	}

}
