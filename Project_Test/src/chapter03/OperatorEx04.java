package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		int gameScore = 150;

		int lastScore2 = ++gameScore;
		System.out.println(lastScore2);
		System.out.println(gameScore);

		int lastScore1 = ++gameScore; // 증가 후 변수에 입력
		System.out.println(lastScore1);
		System.out.println(gameScore);

		// int lastScore1 = gameScore++; // 변수 입력 후 증가
		// System.out.println(lastScore1);
		// System.out.println(gameScore);

		// int lastScore2 = gameScore--; // 변수 입력 후 감소
		// System.out.println(lastScore2);
		// System.out.println(gameScore);
	}
}
