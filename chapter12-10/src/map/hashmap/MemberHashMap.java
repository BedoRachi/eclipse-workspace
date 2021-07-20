package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap; //key Integer / value Member�� hashMap ����
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); //key Integer / value Member�� hashMap ����
	}
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);// key+value ���·� Add
	}
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)){//key�� Ȯ���Ͽ� memberId�� �ִٸ�
			hashMap.remove(memberId); //�ش� key,value ����
			return true;
		}
		System.out.println("�������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //key(keySet)�� �о�´�(Iterator)
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
}
