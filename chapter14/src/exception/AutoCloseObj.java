package exception;
//try-with-resources문 구성을 위한 AutoCloseable
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception{ //예외처리 발생시 자동으로 Close() 후 예외처리함
		System.out.println("리소스가 close() 되었습니다.");
	}
}
