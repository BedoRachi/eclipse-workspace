package stream.others;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console(); //명령프롬프트에서 실행
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		char[] pass = console.readPassword();//배열로 값을 저장
		String strPass = new String(pass);
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(strPass);
	}

}
