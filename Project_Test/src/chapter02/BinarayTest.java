package chapter02;

public class BinarayTest {
	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000001000110; // ���� ���� 70
		int num2 = ~num1; // ���� ����
		//int num2 = 0B11111111111111111111111110111001; 70�� ����
		int num3 = num2+1; // ����+1�Ͽ� ���� ����
		
		System.out.println(num1); // 70
		System.out.println(num2); // 70�� ����
		System.out.println(num3); // -70
		System.out.println(num1-num3); //70-(-70)
		System.out.println(num3-num1); //-70-(+70)
		System.out.println(num1+num3); //70+(-70)
		
	}
}
