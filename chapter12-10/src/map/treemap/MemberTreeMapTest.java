package map.treemap;

import collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberLee = new Member(1001, "ÀÌÁö¿ø");
		Member memberSon = new Member(1002, "¼Õ¹Î±¸");
		Member memberPark = new Member(1003, "¹Ú¼­ÈÍ");
		Member memberHong = new Member(1004, "È«±æµ¿");

		memberTreeMap.addMember(memberLee);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberHong);
		memberTreeMap.showAllMember();

		memberTreeMap.removeMember(1003);
		memberTreeMap.showAllMember();

	}
}
