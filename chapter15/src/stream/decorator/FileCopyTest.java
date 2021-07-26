package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) {
			//try-with-resource�� ���� AutoCloseable interface�� ��ӹ��� Ŭ������ �ڵ����� �����ϰ� �Ѵ�.
			//2���̻��� stream�� ����(�����)
			millisecond = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ҿ�ð�: " + millisecond);
	}
}
