package exception;
//try-catch-finally 문 사용(try-catch문 비교용)
import java.io.FileInputStream; //파일 Read Stream 불러옴
import java.io.FileNotFoundException; //File 이 없을 경우 예외처리 불러옴
import java.io.IOException; //IO가 없을 경우 예외처리 불러옴

public class ExceptionHandling3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) { //file not found Error에 대한 예외처리
			System.out.println(e);
			return;
			
		} finally { //Error 발생여부 상관없이 무조건 실행
			if(fis != null) { // File을 Read하였을 떄
				try {
					fis.close(); //file read Stream close
				} catch (IOException e){ //stream close Error 대한 예외처리
					e.printStackTrace(); // Error가 발생한 특정 Stream을 역추척하여 출력한다..
				}
			}
			System.out.println("항상 실행");
		}
		System.out.println("여기도 수행");
	}
}
