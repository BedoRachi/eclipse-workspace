package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt"); // input.txt파일을 읽어옴
			int i;
			while ((i = fis.read()) != -1) {//fis를 1개씩 read 하여 -1(or \n)이 나올때 까지 반복함
				System.out.print(i); // i에 저장된 byte값을 출력함
			}
			System.out.println();
			fis = new FileInputStream("input2.txt"); // input.txt파일을 읽어옴
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) { // IO Error 발생시
			System.out.println("1: " + e);
		} catch (IOException e) {
			System.out.println("2: " + e);
		}finally {// 무조건 실행
			try {
				fis.close();
			} catch (IOException e) { // IO Error 발생시
				System.out.println("3: " + e);
			} catch (NullPointerException e) { // NULL Error 발생시
				System.out.println("4: " + e);
			}
		}
		System.out.println("end");
	}
}
