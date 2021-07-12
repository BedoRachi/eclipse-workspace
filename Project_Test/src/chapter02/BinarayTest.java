package chapter02;

public class BinarayTest {
	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000001000110; // 원본 숫자 70
		int num2 = ~num1; // 보수 생성
		//int num2 = 0B11111111111111111111111110111001; 70의 보수
		int num3 = num2+1; // 보수+1하여 음수 생성
		
		System.out.println(num1); // 70
		System.out.println(num2); // 70의 보수
		System.out.println(num3); // -70
		System.out.println(num1-num3); //70-(-70)
		System.out.println(num3-num1); //-70-(+70)
		System.out.println(num1+num3); //70+(-70)
		
	}
}
