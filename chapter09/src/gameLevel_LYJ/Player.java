package gameLevel_LYJ;

public class Player {
	private PlayerLevel level;
	String str;
	public Player() {
		
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {//여러 변수를 받을 수 있도록 Parent로 매개변수 설정)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
