package stream.outputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		FileInputStream fis = null; //input stream ����(new)

		try {
			fis = new FileInputStream("output.txt"); // input.txt������ �о��
			int i;
			int c=0;
			byte[] bs = new byte[31];//10ĭ �迭 ���� 
			while ((i = fis.read(bs)) != -1) {//read�Ͽ� bs Array�� ����(10����) -> Array ����� �Ϸ�(10��) �Ǹ� ������ 10���� ������
				System.out.print("Count " + c + " ");
				for(byte b : bs) { //Array�� �ҷ��� ���
					System.out.print(b);
					} 
				c++;
				System.out.println(": " + i + " ����Ʈ ����");
			}
			fis = new FileInputStream("output.txt"); // input.txt������ �о��
			while ((i = fis.read(bs)) != -1) {
				System.out.print("Count " + c + " ");
				for(byte b : bs) {
					System.out.print((char)b);
				}
				c++;
				System.out.println(": " + i + " ����Ʈ ����");
			}
		} catch (IOException e) {
			System.out.println("1: " + e);
		}finally {// ������ ����
			try {
				fis.close();
			} catch (IOException e) { // IO Error �߻���
				System.out.println("2: " + e);
			} catch (NullPointerException e) { // NULL Error �߻���
				System.out.println("3: " + e);
			}
		}
		System.out.println("end");
	}
}
