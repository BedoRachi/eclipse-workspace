package scheduler_LYJ;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args)  throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ��� ����");
		System.out.println("R: RoundRobin ���");
		System.out.println("L: LeastJob ���");
		System.out.println("P: PriorityAllocation ���");
		System.out.println("A: AgentGetCall ���");
		
		int ch = System.in.read(); 
		Scheduler scheduler = null; //Interface�� new�� �ȵ� �� null�� ���� ��ü�� �����ϴ�.(=��ĳ���ÿ�)
		
		if(ch == 'R' || ch== 'r') {
			scheduler = new RoundRobin(); //��ĳ����
		} else if(ch == 'L' || ch== 'l') {
			scheduler = new LeastJob(); //��ĳ����
		} else if(ch == 'P' || ch== 'p') {
			scheduler = new PriorityAllocation(); //��ĳ����
		} else if(ch == 'A' || ch =='a'){
			scheduler = new AgentGetCall(); //��ĳ����
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			return;
		}
		
		scheduler.getNextCall(); // ������ ��ü���� �޼ҵ� ȣ��
		scheduler.sendCallToAgent(); // ������ ��ü���� �޼ҵ� ȣ��
	}
}