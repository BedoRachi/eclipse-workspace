package object_LYJ;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println("str1.hashCode(): " + str1.hashCode());
		System.out.println("str2.hashCode(): " + str2.hashCode());
		System.out.println("System.identityHashCode(str1): " + System.identityHashCode(str1));
		System.out.println("System.identityHashCode(str2): " + System.identityHashCode(str2));
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i1.hashCode(): " + i1.hashCode());
		System.out.println("i2.hashCode(): " + i2.hashCode());
		System.out.println("System.identityHashCode(i1): " + System.identityHashCode(i1));
		System.out.println("System.identityHashCode(i2): " + System.identityHashCode(i2));
	}
}
