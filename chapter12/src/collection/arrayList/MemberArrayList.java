package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() { //MemberArrayList 호출 할 때 마다 Member 배열이 생성됨
		arrayList = new ArrayList<Member>();
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	/*//for 반복문을 사용하여 배열 검사 및 제거 구현
	 * public boolean removeMamber(int memberId) {//memberId로 Member 제거 후 성공여부 반환
	 * System.out.println("@@ "+memberId + " 사용자 삭제"); 
	 * for(int i=0;i<arrayList.size();i++) {//Member 배열 전체 검사 Member member = arrayList.get(i);
	 * // 배열에 저장된 Member를 불러옴 int tempId = member.getMemberId(); //Member에서 Id를 불러옴
	 * if(tempId == memberId) { //검사할 ID == 대상 ID 일 경우 
	 * arrayList.remove(i); //해당 배열제거 
	 * return true; //성공여부 반환 
	 * } 
	 * } System.out.println(memberId +"는 존재 하지 않는 사용자 ID 입니다."); 
	 * return false; 
	 * }
	 */
	
	//Interator(대상의 요소를 순차적으로 불러옴) 를 사용하여 배열 검사 및 제거 구현
	public boolean removeMember(int memberId) {//memberId로 Member 제거 후 성공여부 반환
		Iterator<Member> ir = arrayList.iterator(); //Iterator : Member 자료형을 가진 arrayList 배열을 ir에 저장
		while(ir.hasNext()) { //ir를 하나씩 검사하여 값이 있으면 true / 없으면 false
			Member member = ir.next(); //배열에 객체를 저장
			int  tempId = member.getMemberId(); //객체에서 memberId만 추출
			if(tempId == memberId) { //추출 id와 대상 id를 비교
				arrayList.remove(member); //동일할 경우 삭제
				return true;
			}
		}
		System.out.println(memberId + " 가 존재하지 않습니다.");
		return false;
	}
	
	//for 반복문을 사용하여 중복검사 및 값 추가 구현
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
