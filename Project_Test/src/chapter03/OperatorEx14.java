package chapter03;

public class OperatorEx14 {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;

		int result = num1 & num2;
		System.out.println("result = num1 & num2");
		System.out.println(String.format("%4s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(num2)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(result)).replace(" ", "0"));
		
		result = num1 | num2;
		System.out.println("result = num1 | num2");
		System.out.println(String.format("%4s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(num2)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(result)).replace(" ", "0"));

		result = num1 ^ num2;
		System.out.println("result = num1 ^ num2");
		System.out.println(String.format("%4s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(num2)).replace(" ", "0"));
		System.out.println(String.format("%4s", Integer.toBinaryString(result)).replace(" ", "0"));

		result = ~num1;
		System.out.println("result = ~num1 ");
		System.out.println(String.format("%4s", Integer.toBinaryString(num1)).replace(" ", "0"));
		System.out.println(String.format("%32s", Integer.toBinaryString(result)).replace(" ", "0"));

		
	}

}
