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
			//try-with-resource�� ���� AutoCloseable interface�� ��ӹ��� Ŭ������ �ڵ����� �����ϰ� �Ѵ�.
			//fis, fos�� �����ϴ� ���� ��Ʈ�� ���� �� ����
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ�ð�: " + millisecond);
	}
}
