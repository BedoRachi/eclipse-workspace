package chapter02;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10; // 10���� 
		int bNum1 = 0B0000; // 0B: 2����
		int bNum2 = 0B1010; // 0B: 2����
		int bNum3 = 0B1111; // 0B: 2����
		int oNum1 = 001; //0: 8����
		int oNum2 = 010; //0: 8����
		int oNum3 = 011; //0: 8����
		int hNum1 = 0X8; //0X: 16����
		int hNum2 = 0XA; //0X: 16����
		int hNum3 = 0XD; //0X: 16����
		
		System.out.println(num);
		System.out.println("2����");
		System.out.println(bNum1);
		System.out.println(bNum2);
		System.out.println(bNum3);
		System.out.println("8����");
		System.out.println(oNum1);
		System.out.println(oNum2);
		System.out.println(oNum3);
		System.out.println("16����");
		System.out.println(hNum1);
		System.out.println(hNum2);
		System.out.println(hNum3);
	}

}
