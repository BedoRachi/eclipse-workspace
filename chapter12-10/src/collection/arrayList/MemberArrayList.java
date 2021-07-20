package collection.arrayList;

import java.util.ArrayList; //ArrayList Import
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() { //MemberArrayList 호출 할 때 마다 Member 배열이 생성됨
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMamber(int memberId) {//memberId로 Member 제거 후 성공여부 반환
		System.out.println("@@ "+memberId + " 사용자 삭제");
		for(int i=0; i<arrayList.size();i++) {//Member 배열 전체 검사
			Member member = arrayList.get(i); // 배열에 저장된 Member를 불러옴
			int tempId = member.getMemberId(); //Member에서 Id를 불러옴
			if(tempId == memberId) { //검사할 ID == 대상 ID 일 경우
				arrayList.remove(i); //해당 배열 제거
				return true; //성공여부 반환
			}
		}
		System.out.println(memberId + "는 존재 하지 않는 사용자 ID 입니다.");
		return false;
	}
	
	public boolean insertMember(int index, Member targetMember) {//memberID 검사 후 중복이 없을 경우 추가
		System.out.println("@@ " + index + " 순서에 사용자 추가");
		int targetId = targetMember.getMemberId();//입력 받은 Member에서 memberID 추출
		for(int i=0; i<arrayList.size();i++) {//Member 배열 전체 검사
			Member member = arrayList.get(i); // 배열에 저장된 Member를 불러옴
			int tempId = member.getMemberId(); //Member에서 Id를 불러옴
			if(tempId == targetId) { //검사할 ID == 대상 ID 일 경우
				System.out.println("중복된 MemberID입니다.");
				return false; //실패 반환
			}
		}
		System.out.println("성공적으로 입력되었습니다.");
		arrayList.add(index, targetMember); //특정 순서에 Member 추가
		return true;
	}
	
	public void showAllMember() {//Member 배열을 전체를 출력
		System.out.println("@@ 전체 Member 출력");
		for(Member member : arrayList) {
			System.out.println(member); //Member에 toString이 재정의 되어 있다
		}
		System.out.println();
	}
	
}
