package exception;
//try-catch문 사용(finally와 비교용)
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHanding {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) { //file not found Error에 대한 예외처리
			System.out.println(e);
		}
		System.out.println("여기도 수행");
	}
}
