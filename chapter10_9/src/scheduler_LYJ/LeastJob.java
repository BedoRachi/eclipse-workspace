package scheduler_LYJ;

public class LeastJob implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("������� ��⿭���� ������");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("������ ���ų� ���� �������� ����");
	}

}
