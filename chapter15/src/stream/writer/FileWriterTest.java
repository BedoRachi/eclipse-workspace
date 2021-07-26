package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt"))
		//try-with-resource�� ���� AutoCloseable interface�� ��ӹ��� Ŭ������ �ڵ����� �����ϰ� �Ѵ�.
		{
			fw.write('A'); //A �Է�
			char buf[]= {'B', 'C', 'D', 'E', 'F', 'G'}; //Byte �迭 ����
			fw.write(buf); //�迭 �Է�
			fw.write("�ȳ��ϼ���, �� �����׿�"); //String(����) �Է�
			fw.write(buf, 1,2);//�迭�� 1�� �ں��� 2��
			fw.write("65");//String(����) �Է�
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}
}
