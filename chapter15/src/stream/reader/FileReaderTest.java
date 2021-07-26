package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")){
			//try-with-resource을 통해 AutoCloseable interface를 상속받은 클래스를 자동으로 종료하게 한다.
			int i;
			while((i=fr.read()) != -1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
