package chapter03;

public class OperatorEx03 {

	public static void main(String[] args) {
		// �߰� ������ �׽�Ʈ
		int gameScore = 150;
		
		//int lastScore1 = ++gameScore; // ���� ��  ������ �Է�
		//System.out.println(lastScore1);
		
		int lastScore1 = gameScore++; // ���� �Է� �� ����
		System.out.println(lastScore1);
		System.out.println(gameScore);
		
		int lastScore2 = gameScore--; // ���� �Է� �� ����
		System.out.println(lastScore2);
		System.out.println(gameScore);
	}
}
