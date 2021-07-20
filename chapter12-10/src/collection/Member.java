package collection;

public class Member implements Comparable<Member>{ //treeSet ��ü �� �ߺ�, ���� ó���� ���� ���

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
	
	@Override //Object class�� toString
	public String toString() { //member�� ȣ���Ͽ��� �� ������ ������ ��ȯ �ϵ��� Override
		return memberName +  " ȸ������ ���̵�� " + memberId + " �Դϴ�.";
	}
	
	@Override //Object class�� hashcode
	public int hashCode() { //hashset ��밣 �ߺ���ü �˻縦 ���� Override
		return memberId;
	}
	
	@Override //Object class�� equals
	public boolean equals(Object obj) {
		if(obj instanceof Member) {//hash �� ��� memberId�� �񱳸� ���� Override
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
		//return (this.memberId - member.memberId); //����Ʈ���� ��ȯ���� +�� �Ǹ鼭 ��������(��������) ��
		//���� id�� �ű� id�� �� + �������� ����(treeSet�� ����Ʈ�� ����̶� �θ� Ʈ��->�ڽ� Ʈ���� �̵��� �� �ְ� ���� ���������)
		return (this.memberId - member.memberId)*(-1);//����Ʈ���� ��ȯ���� -�� �Ǹ鼭 ��������(��������) ��
		//���� id�� �ű� id�� �� + �������� ����(treeSet�� ����Ʈ�� ����̶� �θ� Ʈ��->�ڽ� Ʈ���� �̵��� �� �ְ� ���� ���������)
	}
	
}
