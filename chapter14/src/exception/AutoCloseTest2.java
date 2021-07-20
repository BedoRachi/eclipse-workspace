package exception;
//try-with-resources������ AutoCloseable ���ܹ߻� �� close() Ȯ��
public class AutoCloseTest2 {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) { //AutoCloseObj obj��� ���ҽ��� ����, obj�� AutoCloseable interface�� ��� �޾ұ� ������ �ڵ����� Close��
			System.out.println("���� ����ó�� �߻�");
			throw new Exception(); //���� ���ܹ߻�
		} catch (Exception e) {//Close() �߻��� �����
			System.out.println("���� ó��");
		}
	}
}
