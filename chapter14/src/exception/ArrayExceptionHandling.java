package exception;
//try-catch�� ���
public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int [5];
		
		try { //������ �����̸� ������ �߻��� ���ɼ��� �ִ� �κ�
			for(int i =0;i<=5;i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) { //Error�� �߻��� ��� ArrayIndexOutOfBoundsException�� ��ȯ��
			System.out.println(e); //��ȯ���� e�� �����
			System.out.println("���� ó���κ�"); //������ ���� ���
		}
		System.out.println("���α׷� ����");
	}

}
