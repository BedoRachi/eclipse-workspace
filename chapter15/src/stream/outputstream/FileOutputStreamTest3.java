package stream.outputstream;


import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamTest3 {
	public static void main(String[] args) throws IOException {//java 9버전 부터 제공하는 tre-with-resources
		FileOutputStream fos = new FileOutputStream("output.txt", true); //java 9버전 부터 제공하는 tre-with-resources
		//FileOutStream 생성 및 선언 / output file에 작성하며 덮어쓰기(false)
		try(fos) { //java 9버전 부터 제공하는 tre-with-resources
			byte[] bs = new byte[26]; //26칸의 Byte배열 생성
			byte data = 65; //65('A')
			for(int i = 0; i< bs.length; i++) {//A~Z까지 순차 입력
				bs[i]=data;
				data++;
			}
			fos.write(bs,2,10); //배열을 fos를 통해 출력 배열의 3번째 위치 부터 10(byte)개만 출력

		}  catch (IOException e) {
			System.out.println("1: " + e);
		}
		System.out.println("end");
	}
}
