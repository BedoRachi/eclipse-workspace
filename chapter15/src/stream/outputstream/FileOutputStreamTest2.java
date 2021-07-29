package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class FileOutputStreamTest2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fos = new FileOutputStream("output.txt"); //Output.txt 파일에
			fos.write(65); //1byte write(버퍼 메모리에 적재)
			fos.write(66); //1byte write(버퍼 메모리에 적재)
			fos.write(67); //1byte write(버퍼 메모리에 적재)
			fos.flush(); // 버퍼의 모든 내용을 출력=실제 적용
			//(즉 FileOutputStream, BufferedWriter처럼 버퍼를 사용할 경우 write -> flush를 해야 출력이 된다.
			fos.close(); // 버퍼 종료
			
			fis = new FileInputStream("output.txt"); //input.txt파일을 읽어옴
			System.out.print(fis.read()); //1byte read & sysout
			System.out.print(fis.read()); //1byte read & sysout
			System.out.print(fis.read()); //1byte read & sysout	
			System.out.println();
			
			fis = new FileInputStream("output.txt"); //input.txt파일을 읽어옴
			System.out.print((char)fis.read()); //1byte read & sysout(char)			
			System.out.print((char)fis.read()); //1byte read & sysout(char)			
			System.out.print((char)fis.read()); //1byte read & sysout(char)
		} catch(IOException e) { //IO Error 발생시
			System.out.println("1: "+ e);
		} finally {//무조건 실행
			try {
				fis.close(); //자원 종료
				fos.close(); //자원 종료
			}catch (IOException e) { //IO Error 발생시
				System.out.println("2: "+ e);
			} catch (NullPointerException e) { //NULL Error 발생시
				System.out.println("3: "+ e);
			}
		}
	}
}
