package collection.arrayList;

import java.util.ArrayList; //ArrayList Import
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() { //MemberArrayList ȣ�� �� �� ���� Member �迭�� ������
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMamber(int memberId) {//memberId�� Member ���� �� �������� ��ȯ
		System.out.println("@@ "+memberId + " ����� ����");
		for(int i=0; i<arrayList.size();i++) {//Member �迭 ��ü �˻�
			Member member = arrayList.get(i); // �迭�� ����� Member�� �ҷ���
			int tempId = member.getMemberId(); //Member���� Id�� �ҷ���
			if(tempId == memberId) { //�˻��� ID == ��� ID �� ���
				arrayList.remove(i); //�ش� �迭 ����
				return true; //�������� ��ȯ
			}
		}
		System.out.println(memberId + "�� ���� ���� �ʴ� ����� ID �Դϴ�.");
		return false;
	}
	
	public boolean insertMember(int index, Member targetMember) {//memberID �˻� �� �ߺ��� ���� ��� �߰�
		System.out.println("@@ " + index + " ������ ����� �߰�");
		int targetId = targetMember.getMemberId();//�Է� ���� Member���� memberID ����
		for(int i=0; i<arrayList.size();i++) {//Member �迭 ��ü �˻�
			Member member = arrayList.get(i); // �迭�� ����� Member�� �ҷ���
			int tempId = member.getMemberId(); //Member���� Id�� �ҷ���
			if(tempId == targetId) { //�˻��� ID == ��� ID �� ���
				System.out.println("�ߺ��� MemberID�Դϴ�.");
				return false; //���� ��ȯ
			}
		}
		System.out.println("���������� �ԷµǾ����ϴ�.");
		arrayList.add(index, targetMember); //Ư�� ������ Member �߰�
		return true;
	}
	
	public void showAllMember() {//Member �迭�� ��ü�� ���
		System.out.println("@@ ��ü Member ���");
		for(Member member : arrayList) {
			System.out.println(member); //Member�� toString�� ������ �Ǿ� �ִ�
		}
		System.out.println();
	}
	
}
