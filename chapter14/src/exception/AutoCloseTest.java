package exception;
//try-with-resources문에서  AutoCloseable 정상 실행 시 close() 확인
public class AutoCloseTest {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) { //AutoCloseObj obj를 선언, obj는 AutoCloseable interface를 상속 받았기 떄문에 자동으로 Close됨
			System.out.println("정상실행");
		} catch (Exception e) {//정상실행되기 때문에 Close() 발생후 생략됨
			System.out.println("예외 처리");
		}
	}
}
