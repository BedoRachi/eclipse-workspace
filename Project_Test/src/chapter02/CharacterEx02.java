package chapter02;

public class CharacterEx02 {
	public static void main(String[] args) {
		char ch1='한'; //한글값 입력
		char ch2='\uD55C'; //유니코드(CSS코드)
		char ch3='\uD56B';
		char ch4='\uAC38';
		//유니코드 : URL: https://unicode-table.com/kr/blocks/hangul-syllables/
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
		System.out.println(ch3);
		System.out.println(ch4);
		
	}
}
