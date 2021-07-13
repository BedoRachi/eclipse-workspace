package stringex_LYJ;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("연산전 javaStr 주소: " + System.identityHashCode(javaStr)); //String의 주소값
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산전 StringBuilder의 주소값: "+ System.identityHashCode(buffer)); //StringBuilder의 주소값
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" is fun");
		javaStr = buffer.toString(); //StringBuilder(buffer) -> String(javaStr)로 형변환(toString)
		System.out.println(javaStr);
		System.out.println("연산후 javaStr 주소: " + System.identityHashCode(javaStr)); //String의 주소값
		//String은 객체내에서 값변경이 불가능(불변성O) 이기 때문에 좌표값이 변함
		System.out.println("연산후 StringBuilder의 주소값: "+ System.identityHashCode(buffer)); //StringBuilder의 주소값
		//StringBuilder는 객체내에서 값변경이 가능(불변성X) 이기 때문에 좌표값이 변하지 않음
	}
}
