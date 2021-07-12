package chapter03;

public class OperatorEx15 {
	
	public static void main(String[] args) {
		
		int num1 = -10;
		int result1 = num1>>2;
		int result2 = num1<<2;
		int result3 = num1>>>2;
		
		System.out.println("result1 = num1>>2;");
		System.out.println(String.format("%32s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%32s", Integer.toBinaryString(result1)).replace(" ", "0"));
		System.out.println(result1);
		
		System.out.println("result2 = num1<<2;");
		System.out.println(String.format("%32s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%32s", Integer.toBinaryString(result2)).replace(" ", "0"));
		System.out.println(result2);
		
		System.out.println("result3 = num1>>>2");
		System.out.println(String.format("%32s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%32s", Integer.toBinaryString(result3)).replace(" ", "0"));
		System.out.println(result3);
	}

}
