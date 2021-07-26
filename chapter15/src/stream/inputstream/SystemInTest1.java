package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("알파벳 하나 쓰고 Enter를 입력하시오");
		
		int i;
		try {
			i=System.in.read(); //system.in은 byte단위로 입력을 받는 Input Stream이며 int로 반환한다.
			System.out.println(i); // 입력값을 int로 출력
			System.out.println((char)i); //입력값을 char로 출력
			
		}catch(IOException e) {
			e.printStackTrace(); //error를 세부적으로 표시한다.
		}
	}

}
