package lambda;

public class TestStringConcat2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		StringConCat concat2 = (s, v) -> System.out.println("LAMBDA "+s1 + "," + s2);
		concat2.makeString(s1, s2);
	}

}
