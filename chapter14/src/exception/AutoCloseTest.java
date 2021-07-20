package exception;
//try-with-resources������  AutoCloseable ���� ���� �� close() Ȯ��
public class AutoCloseTest {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) { //AutoCloseObj obj�� ����, obj�� AutoCloseable interface�� ��� �޾ұ� ������ �ڵ����� Close��
			System.out.println("�������");
		} catch (Exception e) {//�������Ǳ� ������ Close() �߻��� ������
			System.out.println("���� ó��");
		}
	}
}
