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
	
	public void upgradeLevel(PlayerLevel level) {//���� ������ ���� �� �ֵ��� Parent�� �Ű����� ����)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}
}
