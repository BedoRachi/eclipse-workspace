package stream.outputstream;


import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamTest3 {
	public static void main(String[] args) throws IOException {//java 9���� ���� �����ϴ� tre-with-resources
		FileOutputStream fos = new FileOutputStream("output.txt", true); //java 9���� ���� �����ϴ� tre-with-resources
		//FileOutStream ���� �� ���� / output file�� �ۼ��ϸ� �����(false)
		try(fos) { //java 9���� ���� �����ϴ� tre-with-resources
			byte[] bs = new byte[26]; //26ĭ�� Byte�迭 ����
			byte data = 65; //65('A')
			for(int i = 0; i< bs.length; i++) {//A~Z���� ���� �Է�
				bs[i]=data;
				data++;
			}
			fos.write(bs,2,10); //�迭�� fos�� ���� ��� �迭�� 3��° ��ġ ���� 10(byte)���� ���

		}  catch (IOException e) {
			System.out.println("1: " + e);
		}
		System.out.println("end");
	}
}
