package chapter07_Q;

public class Q1_Array {

	public static void main(String[] args) {

		int[] array = new int[5];
		int num = 0;
		int total = 0;

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				array[num] = i;
				total += array[num];
				num++;

			}
		}
		System.out.println("1~10ÀÇ Â¦¼ö ÇÕÀº= " + total);
	}

}
