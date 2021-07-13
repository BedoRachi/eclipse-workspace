package stringex_LYJ;

public class StringTest1 {
	//String을 통한 new, 변수의 메모리 사용 확인
	
	public static void main(String[] args) {
		String str1 = new String("abc"); //메모리 공간 할당(new) 후 해당 메모리의 주소값을 str1에 저장
		String str2 = new String("abc"); //메모리 공간 할당(new) 후 해당 메모리의 주소값을 str1에 저장
		
		System.out.println(str1==str2); //메모리 위치가 다름으로 false 출력
		System.out.println(str1.equals(str2)); //값은 같으므로 true 출력
		
		String i1 = "abc"; // abc가 상수풀에 저장되고 해당 주소값이 i1에 저장
		String i2 = "abc"; // abc가 상수풀에 저장되고 해당 주소값이 i2에 저장
		
		System.out.println(i1==i2); //상수풀에서 abc를 통일하게 바라보기 때문에 true
		System.out.println(i1.equals(i2)); // 값이 같으므로 true
	}

}
