package chapter04;
import java.util.Scanner;

public class For_Q4_Example02 {
//7���� PDF Q4 �ݺ��� �׽�Ʈ02
	public static void main(String[] args) {
		int count;
		int blink;
		int star;
		int starCount;
		int maxCount;
		
		System.out.println("�ݺ�Ƚ���� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		maxCount = scanner.nextInt();//�ִ� �ݺ�Ƚ�� �Է�

		for (count = 0, star = 1; count < maxCount; count++) { // 1�� �ݺ���(�ִ� �ݺ� Ƚ��)
			for (blink = maxCount-1; count < blink; blink--) {//1-1 �ݺ���(�ִ� �ݺ� Ƚ��-1 �� �ݺ��Ͽ� ��ĭ�� ����� �� �ݺ��� ���� -1ĭ�� ��)
				System.out.print(" "); //��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 �ݺ���(���� ������ Ȧ���� �ⷰ)
				System.out.print("*"); //�� �����
			}
			star += 2; // (���� ������ Ȧ�� ���� ������Ŵ
			System.out.println(""); //�����ٷ� ����
		}
	}

}
