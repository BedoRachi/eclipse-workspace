package map.hashmap;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수: " + javaScore.size());
		System.out.println(javaScore.toString());
		Set<String> keys = javaScore.keySet(); //javaScore의 Key List를 저장
		Iterator<String> it = keys.iterator(); //Key List를 불러옴
		
		while(it.hasNext()) {//key를 기준으로 순차 실행
			String name = it.next(); //특정 시점의 key값을 추출
			int score = javaScore.get(name); //key값의 value를 저장
			System.out.println(name + " : " + score);
		}
	}

}
