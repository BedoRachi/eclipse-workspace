package Weakly_Test1;

public class Q6 {

	public static void main(String[] args) {
		int max=0;
		
		int[] array = {4,5,1,2,3}; //������ �迭 �Է�
		for(int i=0; i<array.length;i++) { //�迭�� ũ�⸸ŭ �ݺ�
			if(array[i] > max) { //�迭�� ������ MAX�� ���Ͽ� Ŭ ��� MAX ����
				max=array[i];
			}
		}
		System.out.println("MAX: " + max);

	}
}
