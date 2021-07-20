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
	
	@Override //Object class의 toString
	public String toString() { //member를 호출하였을 때 변수의 정보를 반환 하도록 Override
		return memberId +  " : " + memberName;
	}
	
	
	@Override //Object class의 equals
	public boolean equals(Object obj) {
		if(obj instanceof Student) {//hash 비교 대신 memberId로 비교를 위한 Override
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
