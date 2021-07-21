package chapter4;

public class Exercise4_6 {

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
				}
			}
		}

	}

}
