package stream.outputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt"); //input.txt파일을 읽어옴
			System.out.println(fis.read()); //1byte read & sysout
			System.out.println(fis.read()); //1byte read & sysout
			System.out.println(fis.read()); //1byte read & sysout			
			fis = new FileInputStream("input2.txt"); //input.txt파일을 읽어옴
			System.out.println((char)fis.read()); //1byte read & sysout(char)			
			System.out.println((char)fis.read()); //1byte read & sysout(char)			
			System.out.println((char)fis.read()); //1byte read & sysout(char)
		} catch(IOException e) { //IO Error 발생시
			System.out.println("1: "+ e);
		} finally {//무조건 실행
			try {
				fis.close(); //자원 종료
			}catch (IOException e) { //IO Error 발생시
				System.out.println("2: "+ e);
			} catch (NullPointerException e) { //NULL Error 발생시
				System.out.println("3: "+ e);
			}
		}
		System.out.println("end");
	}
}
