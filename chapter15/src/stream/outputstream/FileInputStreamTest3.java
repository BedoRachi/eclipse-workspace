package stream.outputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		FileInputStream fis = null; //input stream 생성(new)

		try {
			fis = new FileInputStream("output.txt"); // input.txt파일을 읽어옴
			int i;
			int c=0;
			byte[] bs = new byte[31];//10칸 배열 생성 
			while ((i = fis.read(bs)) != -1) {//read하여 bs Array에 저장(10개씩) -> Array 출력이 완료(10개) 되면 다음번 10개를 저장함
				System.out.print("Count " + c + " ");
				for(byte b : bs) { //Array를 불러와 출력
					System.out.print(b);
					} 
				c++;
				System.out.println(": " + i + " 바이트 읽음");
			}
			fis = new FileInputStream("output.txt"); // input.txt파일을 읽어옴
			while ((i = fis.read(bs)) != -1) {
				System.out.print("Count " + c + " ");
				for(byte b : bs) {
					System.out.print((char)b);
				}
				c++;
				System.out.println(": " + i + " 바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println("1: " + e);
		}finally {// 무조건 실행
			try {
				fis.close();
			} catch (IOException e) { // IO Error 발생시
				System.out.println("2: " + e);
			} catch (NullPointerException e) { // NULL Error 발생시
				System.out.println("3: " + e);
			}
		}
		System.out.println("end");
	}
}
