package exception;

import java.io.FileInputStream; //파일 Read Stream 불러옴 + AutoCloseable을 상속 받음
import java.io.IOException; //IO가 없을 경우 예외처리 불러옴

public class ExceptionHandling3_1 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("a.txt")) { //fis라는 자원을 생성 및 할당

		} catch (IOException e) { // file not found Error에 대한 예외처리
			System.out.println(e); 
			return;
		}
		System.out.println("여기도 수행");
	 }//finally가 없더라도 자동으로 close()가 실행됨

}
