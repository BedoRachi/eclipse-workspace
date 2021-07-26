package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args) {
		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("copy.zip");
			 FileOutputStream fos = new FileOutputStream("copyB.zip");
		     BufferedInputStream bis = new BufferedInputStream(fis);
			 BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			//try-with-resource을 통해 AutoCloseable interface를 상속받은 클래스를 자동으로 종료하게 한다.
			//fis, fos를 보조하는 보조 스트림 선언 및 생성
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요시간: " + millisecond);
	}
}
