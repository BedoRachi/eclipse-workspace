package exception;
//try-with-resources문에서 AutoCloseable 예외발생 시 close() 확인
public class AutoCloseTest2 {
	public static void main(String[] args) {
		try (AutoCloseObj obj = new AutoCloseObj()) { //AutoCloseObj obj라는 리소스를 선언, obj는 AutoCloseable interface를 상속 받았기 떄문에 자동으로 Close됨
			System.out.println("강제 예외처리 발생");
			throw new Exception(); //강제 예외발생
		} catch (Exception e) {//Close() 발생후 실행됨
			System.out.println("예외 처리");
		}
	}
}
