package chapter04;

import java.util.Scanner;

public class For_Q5_Example02 {
	// 7���� PDF Q5 �ݺ��� �׽�Ʈ02(���ǹ�X, ��ĳ��O �����)

	public static void main(String[] args) {
		int count;
		int blink;
		int star;
		int starCount;
		int maxCount;
		
		System.out.println("�ݺ�Ƚ���� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		maxCount = scanner.nextInt();//�ִ� �ݺ�Ƚ�� �Է�
		
		for (count = 1, star = 1; count <= maxCount; count++) { // 1�� �ݺ���(�ִ� �ݺ� Ƚ��)
			for (blink = maxCount; count < blink; blink--) {//1-1 �ݺ���(�ִ� �ݺ� Ƚ��-1 �� �ݺ��Ͽ� ��ĭ�� ����� �� �ݺ��� ���� -1ĭ�� ��)
				System.out.print(" "); //��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 �ݺ���(���� ������ Ȧ���� �ⷰ)
				System.out.print("*"); //�� �����
			}
			star += 2; // (���� ������ Ȧ�� ���� ������Ŵ
			System.out.println(""); //�����ٷ� ����
		}
		for (count = maxCount-1, star-=4; count > 0; count--) { // 2�� �ݺ���
			for (blink = maxCount; count < blink; blink--) {// 2-1 �ݺ���
				System.out.print(" "); // ��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 2-2 �ݺ���
				System.out.print("*"); // �� �����
			}
			star -= 2; // Ȧ���� ����
			System.out.println(""); // �����ٷ� ����
		}
	}
}

