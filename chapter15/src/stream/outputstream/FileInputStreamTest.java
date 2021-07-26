package stream.outputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); //input.txt������ �о��
			System.out.println(fis.read()); //1byte read & sysout
			System.out.println(fis.read()); //1byte read & sysout
			System.out.println(fis.read()); //1byte read & sysout			
			fis = new FileInputStream("input2.txt"); //input.txt������ �о��
			System.out.println((char)fis.read()); //1byte read & sysout(char)			
			System.out.println((char)fis.read()); //1byte read & sysout(char)			
			System.out.println((char)fis.read()); //1byte read & sysout(char)
		} catch(IOException e) { //IO Error �߻���
			System.out.println("1: "+ e);
		} finally {//������ ����
			try {
				fis.close(); //�ڿ� ����
			}catch (IOException e) { //IO Error �߻���
				System.out.println("2: "+ e);
			} catch (NullPointerException e) { //NULL Error �߻���
				System.out.println("3: "+ e);
			}
		}
		System.out.println("end");
	}
}
