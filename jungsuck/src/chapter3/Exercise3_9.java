package chapter3;

public class Exercise3_9 {

	public static void main(String[] args) {
		char ch = 'a';
		char lowerCase = (char) (ch<97 ? ch+32 : ch);
		System.out.println(lowerCase);
	}

}
