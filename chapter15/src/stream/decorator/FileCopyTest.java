package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) {
			//try-with-resource을 통해 AutoCloseable interface를 상속받은 클래스를 자동으로 종료하게 한다.
			//2개이상의 stream을 정의(입출력)
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사 소요시간: " + millisecond);
	}
}
