package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt"); // input.txt������ �о��
			int i;
			while ((i = fis.read()) != -1) {//fis�� 1���� read �Ͽ� -1(or \n)�� ���ö� ���� �ݺ���
				System.out.print(i); // i�� ����� byte���� �����
			}
			System.out.println();
			fis = new FileInputStream("input2.txt"); // input.txt������ �о��
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) { // IO Error �߻���
			System.out.println("1: " + e);
		} catch (IOException e) {
			System.out.println("2: " + e);
		}finally {// ������ ����
			try {
				fis.close();
			} catch (IOException e) { // IO Error �߻���
				System.out.println("3: " + e);
			} catch (NullPointerException e) { // NULL Error �߻���
				System.out.println("4: " + e);
			}
		}
		System.out.println("end");
	}
}
