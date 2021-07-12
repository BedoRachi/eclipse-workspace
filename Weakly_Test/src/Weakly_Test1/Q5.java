package Weakly_Test1;

public class Q5 {

	public static void main(String[] args) {
		int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };//1~10까지 배열 생성
		int total = 0;

		for (int i = 0; i < scores.length; i++) {//배열 크기만큼 반복하여 합산
			total += scores[i];
		}
		System.out.println("배열 1~10의 합: " + total);
	}
}
