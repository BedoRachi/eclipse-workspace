package array;

public class ArrayTest04 {

	public static void main(String[] args) {

		double[] data = new double[5]; // 5개의 방을 만듬
		int size = 0;
		double total = 1;
		
		data[0] = 10.0; // 사전에 만든 방에 값을 입력
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
		int[] data2 = { 1, 2, 3, 4, 5, }; // 배열 선언과 동시에 값 할당

		for (int i : data2) { // data2의 배열일 처음부터 끝까지 int i에 입력
			System.out.println(i);

		}
	}
}
