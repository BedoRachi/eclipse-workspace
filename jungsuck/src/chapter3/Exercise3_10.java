package chapter3;

public class Exercise3_10 {

	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ch>48 && ch < 58 ? true : ch>64 && ch < 91 ? true : ch>96 && ch < 123 ? true : false; 
		System.out.println(b);
	}

}
