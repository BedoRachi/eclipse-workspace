package Weakly_Test1;

public class Q13_1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		double total=0;
		
		System.out.print("������ ������: ");
		for(int i=0;i<array.length;i++) {//�迭�� ũ�⸸ŭ �ݺ�
			array[i] = (int)(Math.random()*10+1);//������ ������ �迭�� �Է�
			total+=array[i]; //������ ������ �ջ�
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("�����: " + (total/array.length)); //���� �ջ��� �迭�� ũ��� ����(���)
	}
}

