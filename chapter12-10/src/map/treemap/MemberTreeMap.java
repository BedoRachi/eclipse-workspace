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
			System.out.println("������ memberId�� �����ϴ�.");
			return false;
		}
	}
	public void showAllMember() {
		Iterator ir = treeMap.keySet().iterator();//key���� �о�´�.
		while(ir.hasNext()) {//������ ������ ���� �ݺ�
			int key = (int) ir.next();//�о�� Key���� ����
			Member member = treeMap.get(key); //Ư�� key�� ���� Value(member) ������
			System.out.println(member);
		}
		System.out.println();
	}
}
