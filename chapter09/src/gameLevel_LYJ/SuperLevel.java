package gameLevel_LYJ;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("매우 높이 점프 합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("한 바퀴 굴렀습니다.");
	}
	
	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨 입니다. ******");
	}
}
