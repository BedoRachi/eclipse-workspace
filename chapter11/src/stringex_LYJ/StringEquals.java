package stringex_LYJ;

public class StringEquals {
	//String, Integer�� equals��
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println("STRING");
		System.out.println("str1==str2: " + (str1==str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println();
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("INTEGER");
		System.out.println("i1==i2: "+ (i1==i2));
		System.out.println("i1.equals(i2): "+i1.equals(i2));
	}
}
