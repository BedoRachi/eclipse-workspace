package chapter04;

public class For_Q4_Example01 {
//7���� PDF Q4 �ݺ��� �׽�Ʈ
	public static void main(String[] args) {
		int count;
		int blink;
		int star;
		int starCount;
		

		for (count = 0, star = 1; count < 4; count++) { // 1�� �ݺ���
			for (blink = 3; count < blink; blink--) {//1-1 �ݺ���
				System.out.print(" "); //��ĭ �����
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 �ݺ���
				System.out.print("*"); //�� �����
			}
			star += 2; // Ȧ���� ����
			System.out.println(""); //�����ٷ� ����
		}
	}

}
/*
 * "��ĭ�� ���� -> ���� ���� -> �����ٷ� ����" -> "��ĭ�� ���� -> ���� ���� -> �����ٷ� ����" -> ....�� 4�� �ݺ��ϴ�
 * �ݺ��� 1�� �ٿ��� ����Ǵ� �۾��� ��ĭ���� / �� �������� ������ �ֱ� ������ 2���� for���� �����
 * ���� ������ Ȧ�� �̱� ������ 1-2 �ݺ����� �׻� Ȧ���� �ݺ��ؾ���
 * ��ĭ�� �ִ� 3ĭ���� 1ĭ�� �����ϱ� ������ �ݺ��� �� ���� -1�� �� 
 */


