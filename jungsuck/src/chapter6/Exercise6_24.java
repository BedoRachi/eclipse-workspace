package chapter6;

class Exercise6_24 {
	public static int abs (int value) {
		if(value<0)
			return value*-1;
		
		
		return value;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(abs(value));
		value = -10;
		System.out.println(abs(value));

	}
}