package chapter02;

public class CharacterEx02 {
	public static void main(String[] args) {
		char ch1='��'; //�ѱ۰� �Է�
		char ch2='\uD55C'; //�����ڵ�(CSS�ڵ�)
		char ch3='\uD56B';
		char ch4='\uAC38';
		//�����ڵ� : URL: https://unicode-table.com/kr/blocks/hangul-syllables/
		
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1);
		System.out.println(ch3);
		System.out.println(ch4);
		
	}
}
