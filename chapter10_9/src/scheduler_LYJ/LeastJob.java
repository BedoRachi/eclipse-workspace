package scheduler_LYJ;

public class LeastJob implements Scheduler{
	
	@Override
	public void getNextCall() {
		System.out.println("순서대로 대기열에서 가져옴");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("업무가 없거나 적은 상담원에게 전달");
	}

}
