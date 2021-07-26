package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt"))
		//try-with-resource을 통해 AutoCloseable interface를 상속받은 클래스를 자동으로 종료하게 한다.
		{
			fw.write('A'); //A 입력
			char buf[]= {'B', 'C', 'D', 'E', 'F', 'G'}; //Byte 배열 생성
			fw.write(buf); //배열 입력
			fw.write("안녕하세요, 잘 써지네요"); //String(문자) 입력
			fw.write(buf, 1,2);//배열의 1번 뒤부터 2개
			fw.write("65");//String(숫자) 입력
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
