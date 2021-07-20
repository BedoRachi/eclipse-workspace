package collection;

public class Member implements Comparable<Member>{ //treeSet 객체 및 중복, 예외 처리를 위한 상속

	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	
	@Override //Object class의 toString
	public String toString() { //member를 호출하였을 때 변수의 정보를 반환 하도록 Override
		return memberName +  " 회원님의 아이디는 " + memberId + " 입니다.";
	}
	
	@Override //Object class의 hashcode
	public int hashCode() { //hashset 사용간 중복객체 검사를 위한 Override
		return memberId;
	}
	
	@Override //Object class의 equals
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//hash 비교 대신 memberId로 비교를 위한 Override
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
	@Override //Comparable Class compareTo
	public int compareTo(Member member) {
		//return (this.memberId - member.memberId); //이진트리라 반환값이 +가 되면서 정순정렬(오름차순) 됨
		//기존 id와 신규 id를 비교 + 오름차순 정렬(treeSet은 이진트리 기반이라 부모 트리->자식 트리로 이동할 수 있게 값을 정해줘야함)
		return (this.memberId - member.memberId)*(-1);//이진트리라 반환값이 -가 되면서 역순정렬(내림차순) 됨
		//기존 id와 신규 id를 비교 + 내림차순 정렬(treeSet은 이진트리 기반이라 부모 트리->자식 트리로 이동할 수 있게 값을 정해줘야함)
	}
	
}
