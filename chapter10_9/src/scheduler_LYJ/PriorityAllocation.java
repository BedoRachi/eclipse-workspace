package scheduler_LYJ;

public class PriorityAllocation implements Scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("������� ��⿭���� ������");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("�켱������ ���� �������� ����");
	}
}
