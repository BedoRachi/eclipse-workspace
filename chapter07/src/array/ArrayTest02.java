package array;

public class ArrayTest02 {
	//�迭 �׽�Ʈ
	public static void main(String[] args) {
		double[] data = new double[5]; //5���� ���� ����
		
		data[0] = 10.0; //������ ���� �濡 ���� �Է�
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i =0; i< data.length ; i++) {
			System.out.println(data[i]);
		}
		
		int[] data2 = {1,2,3,4,5,}; //�迭 ����� ���ÿ� �� �Ҵ�
		
		for(int i : data2) { // data2�� �迭�� ó������ ������ int i�� �Է�
			System.out.println(i);
		}
	}

}


/* �����
 * 10.0 
 * 20.0 
 * 30.0 
 * 0.0 
 * 0.0
 * 1
 * 2
 * 3
 * 4
 * 5
 */