package map.treemap;

import java.util.Iterator;
import java.util.TreeMap;
import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		} else {
			System.out.println("동일한 memberId가 없습니다.");
			return false;
		}
	}
	public void showAllMember() {
		Iterator ir = treeMap.keySet().iterator();//key값을 읽어온다.
		while(ir.hasNext()) {//다음이 없을때 까지 반복
			int key = (int) ir.next();//읽어온 Key값을 저장
			Member member = treeMap.get(key); //특정 key를 가진 Value(member) 저장함
			System.out.println(member);
		}
		System.out.println();
	}
}
