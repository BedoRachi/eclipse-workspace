package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); //hashset 선언 및 생성
		hashSet.add(new String("임정순"));//HashSet Class의 add Method 호출
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬")); //중복데이터
		//중복데이터 처리가 가능한 이유는 String Class에 hashCode 처리가 이미 구현되어 있기 때문이다.
		
		System.out.println(hashSet);
		
	}
	
}

