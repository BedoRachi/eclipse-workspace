package Weakly_Test1;

import java.util.Scanner;

public class Q12_1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);
		
		//���� ���� �Էº�
		System.out.print("�������� "+ array.length+" ���� �Է��Ͻÿ� >> ");
		for(int i=0; i<array.length;i++) { //�迭�� ũ�⸸ŭ �ݺ�
			array[i] = scan.nextInt(); // �Է°��� �迭�� ����
		}
		
		//���� ���� ��º�
		System.out.print("3�� �����: ");
		for(int j=0; j<array.length;j++) { //�迭�� ũ�⸸ŭ �ݺ�
			if(array[j]%3==0) { //�迭 �� 3�� ����� ���
				System.out.print(array[j] + " ");
			}
		}
		

	}

}
