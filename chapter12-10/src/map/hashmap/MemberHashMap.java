package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; //key Integer / value Member인 hashMap 선언
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); //key Integer / value Member인 hashMap 생성
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);// key+value 형태로 Add
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)){//key를 확인하여 memberId가 있다면
			hashMap.remove(memberId); //해당 key,value 삭제
			return true;
		}
		System.out.println("존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //key(keySet)를 읽어온다(Iterator)
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
