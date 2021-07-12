package chapter02;

public class ImplicitConversionEx01 {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		double dNum = iNum;
		float fNum = (float) dNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		System.out.println(dNum);
		System.out.println(fNum);
	}
}
