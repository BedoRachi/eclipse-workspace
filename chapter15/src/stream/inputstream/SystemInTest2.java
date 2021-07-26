package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("알파벳을 입력하시오");
		int i;
		try {
			while ((i = System.in.read()) != -1) {//입력받은 문자를 i에 저장후 i가 -1이 아닐경 우
				System.out.print((char) i);//i를 순차 출력한다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
