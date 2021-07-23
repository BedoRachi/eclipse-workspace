package chapter6;

import java.util.Arrays;

class Exercise6_20 {

	public static int[] shuffle(int[] arr) {

		int[] arrShuffle = arr;

		for (int i = 0; i < arrShuffle.length; i++) {
			int tmp = 0;
			int random = (int) (Math.random() * 9 + 1);
			tmp = arrShuffle[i];
			arrShuffle[i] = arrShuffle[random];
			arrShuffle[random] = tmp;
		}

		return arrShuffle;
	}

	public static void main(String[] args) {

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}
}