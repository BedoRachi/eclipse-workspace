package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();//MemberArrayList�� Constructor�� ���� ArrayList�� ����(new)�Ѵ�.
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(1, memberPark);
		memberArrayList.showAllMember();

		
	}
	
}
