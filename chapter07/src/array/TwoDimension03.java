package array;

public class TwoDimension03 {

	public static void main(String[] args) {

		// �迭 �� ���� ����
		int[][] array = new int[4][5];
		double total = 1;

		// ������ �迭�� ���� �Է�(0~20)
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[0][3] = 4;
		array[0][4] = 5;
		array[1][0] = 6;
		array[1][1] = 7;
		array[1][2] = 8;
		array[1][3] = 9;
		array[1][4] = 10;
		array[2][0] = 11;
		array[2][1] = 12;
		array[2][2] = 13;
		array[2][3] = 14;
		array[2][4] = 15;
		array[3][0] = 16;
		array[3][1] = 17;
		array[3][2] = 18;
		array[3][3] = 19;
		array[3][4] = 20;

		System.out.println("###########�迭 ��ǥ�� ���##############");
		for (int r = 0; r < array.length; r++) {// �迭 ��ǥ+�� ���
			for (int c = 0; c < array[r].length; c++) {
				System.out.println("[" + r + "]" + "[" + c + "] : " + array[r][c]);
				total *= array[r][c];
			}
		}

		System.out.println("###########�迭 2���� ���##############");
		for (int r = 0; r < array.length; r++) {// �迭 2���� ���
			for (int c = 0; c < array[r].length; c++) {
				System.out.print(array[r][c]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("###########�迭 ��ü ��################");
		System.out.println("1~20 ����ü: " + total);
	}

}
