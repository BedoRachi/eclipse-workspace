package gameLevel_LYJ;

public abstract class PlayerLevel {
	//각 Level별 기능을 재구현 하기위해 추상 메소드로 정의
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();

	//go가 실행될 경우 run 1회 -> Count 만큼 점프 -> turn 1회를 실행(시나리오)하며 이는 각 Level별로 재구현
	final public void go(int count) { // final을 줌으로써 재정의 불가(go의 시나리오는 모든 Level 공용)
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
