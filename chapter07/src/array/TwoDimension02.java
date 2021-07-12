package array;

public class TwoDimension02 {

	public static void main(String[] args) {

		// �迭 �� ���� ����
		int[][] array = new int[4][5];
		int hang = 1;
		double total = 1;

		// ������ �迭�� ���� �Է�(0~20)
		for (int i = 0; i < array.length; i++) { // row(��)�κ�
			for (int j = 0; j < array[i].length; j++) {// colum(
				array[i][j] = hang; // ���� �� �Է�
				total *= array[i][j]; // �� ���ϱ� �� ���Է�
				hang++; // ���� �迭�� ���� �� 1����
			}
		}

		System.out.println("###########�迭 ��ǥ�� ���##############");
		for (int r = 0; r < array.length; r++) {// �迭 ��ǥ+�� ���
			for (int c = 0; c < array[r].length; c++) {
				System.out.println("[" + r + "]" + "[" + c + "] : " + array[r][c]);
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
