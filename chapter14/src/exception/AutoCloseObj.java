package exception;
//try-with-resources�� ������ ���� AutoCloseable
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception{ //����ó�� �߻��� �ڵ����� Close() �� ����ó����
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}
}
