package chapter4;

public class Exercise4_13 {
	public static void main(String[] args) {
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i =0; i<value.length(); i++) {
			ch =value.charAt(i);
			if(ch>=65)
				isNumber = false;
		}
		if(isNumber) {
			System.out.println("���� �Դϴ�.");
		}else {
			System.out.println("���ڿ� �Դϴ�.");
		}
	}
}
