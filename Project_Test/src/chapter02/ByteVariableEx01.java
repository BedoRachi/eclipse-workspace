package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		//Byte : 1byte (-2^7~2^7-1)
		byte num1=127;
		byte num2=-128;
		System.out.println(num1);
		System.out.println(num2);
		
		//Short = 2byte(-2^15 ~ 2^15-1)
		short num3=-32768;
		short num4=32767;
		System.out.println(num3);
		System.out.println(num4);
		
		//Int = 4Byte(-2^31 ~ 2^31-1)
		int num5=2147483647;
		int num6=-2147483648;
		System.out.println(num5);
		System.out.println(num6);
		
		//Long = 8Byte(-2^63 ~ 2^63-1)
		//Long형은 선언시 변수값 맨 뒤에 대문자L을 추가해야함 아니면 Int형으로 선언됨
		long num7=-9223372036854775808L;
		long num8=9223372036854775807L;
		System.out.println(num7);
		System.out.println(num8);
		
	}
}
