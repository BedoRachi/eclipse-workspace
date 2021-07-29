package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileOutputStreamTest2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fos = new FileOutputStream("output.txt"); //Output.txt ���Ͽ�
			fos.write(65); //1byte write(���� �޸𸮿� ����)
			fos.write(66); //1byte write(���� �޸𸮿� ����)
			fos.write(67); //1byte write(���� �޸𸮿� ����)
			fos.flush(); // ������ ��� ������ ���=���� ����
			//(�� FileOutputStream, BufferedWriteró�� ���۸� ����� ��� write -> flush�� �ؾ� ����� �ȴ�.
			fos.close(); // ���� ����
			
			fis = new FileInputStream("output.txt"); //input.txt������ �о��
			System.out.print(fis.read()); //1byte read & sysout
			System.out.print(fis.read()); //1byte read & sysout
			System.out.print(fis.read()); //1byte read & sysout	
			System.out.println();
			
			fis = new FileInputStream("output.txt"); //input.txt������ �о��
			System.out.print((char)fis.read()); //1byte read & sysout(char)			
			System.out.print((char)fis.read()); //1byte read & sysout(char)			
			System.out.print((char)fis.read()); //1byte read & sysout(char)
		} catch(IOException e) { //IO Error �߻���
			System.out.println("1: "+ e);
		} finally {//������ ����
			try {
				fis.close(); //�ڿ� ����
				fos.close(); //�ڿ� ����
			}catch (IOException e) { //IO Error �߻���
				System.out.println("2: "+ e);
			} catch (NullPointerException e) { //NULL Error �߻���
				System.out.println("3: "+ e);
			}
		}
	}
}
