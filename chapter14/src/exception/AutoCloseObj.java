package exception;
//try-with-resources�� ������ ���� AutoCloseable
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception{ //����ó�� �߻��� �ڵ����� close()�� ȣ��Ǹ� ����ó���� ȣ���� Class���� ������
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}
}
