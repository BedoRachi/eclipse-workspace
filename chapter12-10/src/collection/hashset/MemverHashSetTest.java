package collection.hashset;

import collection.Member;

public class MemverHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "홍길동");//중복데이터
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
		//중복데이터가 처리가 되지 않은 이유는 Member Class에 hashCode 처리 구현이 없기 때문이다.
				
	}

	
}
