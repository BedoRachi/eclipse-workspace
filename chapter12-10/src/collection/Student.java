package collection;

public class Student {
	private String memberId;
	private String memberName;
	
	public Student(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	@Override //Object class�� toString
	public String toString() { //member�� ȣ���Ͽ��� �� ������ ������ ��ȯ �ϵ��� Override
		return memberId +  " : " + memberName;
	}
	
	
	@Override //Object class�� equals
	public boolean equals(Object obj) {
		if(obj instanceof Student) {//hash �� ��� memberId�� �񱳸� ���� Override
			Student member = (Student)obj;
			if(this.memberId == member.memberId) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
