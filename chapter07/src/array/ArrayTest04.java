package array;

public class ArrayTest04 {

	public static void main(String[] args) {

		double[] data = new double[5]; // 5���� ���� ����
		int size = 0;
		double total = 1;
		
		data[0] = 10.0; // ������ ���� �濡 ���� �Է�
		size++;
		data[1] = 20.0;
		size++;
		data[2] = 30.0;
		size++;
		
		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
			total *=data[i];
		}
		System.out.println(total);
		int[] data2 = { 1, 2, 3, 4, 5, }; // �迭 ����� ���ÿ� �� �Ҵ�

		for (int i : data2) { // data2�� �迭�� ó������ ������ int i�� �Է�
			System.out.println(i);

		}
	}
}
