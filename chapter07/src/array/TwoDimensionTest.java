package array;

public class TwoDimensionTest {

	public static void main(String[] args) {
		int[][] arr = new int[13][2];
		for (int i = 0; i < arr.length; i++) { //За
			for (int j = 0; j < arr[i].length; j++) { //ї­
				arr[i][j] = i + j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
				j++;
				System.out.println(arr[i][j]);
			}
		}
	}

}
