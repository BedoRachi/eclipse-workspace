package scheduler_LYJ;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args)  throws IOException {
		System.out.println("전화 상담 할당 방식 선택");
		System.out.println("R: RoundRobin 방식");
		System.out.println("L: LeastJob 방식");
		System.out.println("P: PriorityAllocation 방식");
		System.out.println("A: AgentGetCall 방식");
		
		int ch = System.in.read(); 
		Scheduler scheduler = null; //Interface라도 new가 안될 뿐 null로 생성 자체는 가능하다.(=업캐스팅용)
		
		if(ch == 'R' || ch== 'r') {
			scheduler = new RoundRobin(); //업캐스팅
		} else if(ch == 'L' || ch== 'l') {
			scheduler = new LeastJob(); //업캐스팅
		} else if(ch == 'P' || ch== 'p') {
			scheduler = new PriorityAllocation(); //업캐스팅
		} else if(ch == 'A' || ch =='a'){
			scheduler = new AgentGetCall(); //업캐스팅
		} else {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		
		scheduler.getNextCall(); // 생성된 객체에서 메소드 호출
		scheduler.sendCallToAgent(); // 생성된 객체에서 메소드 호출
	}
}
