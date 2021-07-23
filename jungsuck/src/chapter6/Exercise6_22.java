package chapter6;

class Exercise6_22 {
	public static boolean isNumber(String str) {
		boolean b = false;
		if(str != null || str !="") {
			for(int i=0; i<str.length();i++) {
				if('0'<=str.charAt(i) && '9'>=str.charAt(i)) {
					b = true;
				}else {
					return false;
				}
			}
			
		} else {
			return false;
		}
		return b;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+" 는 숫자입니까? "+isNumber(str));
		
	}
}