package Weakly_Test1;

public class Q13_2 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int one = 0, ten = 0, count = 1;// 1�� �ڸ� one / 10�� �ڸ� ten
		
		// 1~99���� �ݺ�
		for (int i = 0; i < array.length; i++, count++) { 
			array[i] = count; // �迭�� 1~99�� �Է�
			one = array[i] % 10; // �迭�� ���� 10���� ���� 1�� �ڸ��� ����
			ten = array[i] / 10; // �迭�� ���� 10���� ���� 10�� �ڸ��� ����
			
			// ��,���� �ڸ��� 369�� ��(0�� ������)
			if ((ten % 3 == 0) && (one % 3 == 0) && (one != 0) && (ten != 0)) { 
				System.out.println(array[i] + " �ڼ� ¦¦");
				
			//���� �ڸ��� 369�� ��(0�� ������) or ���� �ڸ��� 369 ��(0�� ������)
			} else if (((ten % 3 == 0) && (ten != 0)) || ((one % 3 == 0) && (one != 0))) { 
				System.out.println(array[i] + " �ڼ� ¦");
			}
		}
	}
}
