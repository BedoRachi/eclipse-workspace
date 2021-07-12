package array;

public class TwoDimension02 {

	public static void main(String[] args) {

		// 배열 및 변수 선언
		int[][] array = new int[4][5];
		int hang = 1;
		double total = 1;

		// 생성한 배열에 값을 입력(0~20)
		for (int i = 0; i < array.length; i++) { // row(행)부분
			for (int j = 0; j < array[i].length; j++) {// colum(
				array[i][j] = hang; // 순차 값 입력
				total *= array[i][j]; // 값 곱하기 및 재입력
				hang++; // 다음 배열을 위해 값 1증가
			}
		}

		System.out.println("###########배열 좌표값 출력##############");
		for (int r = 0; r < array.length; r++) {// 배열 좌표+값 출력
			for (int c = 0; c < array[r].length; c++) {
				System.out.println("[" + r + "]" + "[" + c + "] : " + array[r][c]);
			}
		}

		System.out.println("###########배열 2차원 출력##############");
		for (int r = 0; r < array.length; r++) {// 배열 2차원 출력
			for (int c = 0; c < array[r].length; c++) {
				System.out.print(array[r][c]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("###########배열 전체 곱################");
		System.out.println("1~20 곱전체: " + total);
	}
}
