package scheduler_LYJ;

public class RoundRobin implements Scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("������� ��⿭���� ������");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����");
	}

}
