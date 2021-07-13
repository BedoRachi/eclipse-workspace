package stringex_LYJ;

public class StringTest2 {
	//concat을 통한 문자열 연결
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("첫 문자열의 주소값 "+System.identityHashCode(javaStr)); //문자열의 주소값이 출력된다.
		
		javaStr = javaStr.concat(androidStr);//java + android 문자열을 합친다=새로운 메모리 할당 후 합쳐진 문자열을 저장한다.
		//String의 불변성 때문에 기존의 javaStr의 값 변경이 불가능함
		//새로운 javaStr 주소값 할당 완료 후 기존의 주소값은 GC됨
		// https://ifuwanna.tistory.com/221
		
		System.out.println(javaStr);
		System.out.println("합친 문자열의 주소값 "+System.identityHashCode(javaStr)); // 문자열이 합쳐지는 과정에 새로운 메모리에 할당되었기 때문에 주소값이 변경된다.
	}

}
