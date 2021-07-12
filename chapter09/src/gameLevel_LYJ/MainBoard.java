package gameLevel_LYJ;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); //플레이어 생성
		player.play(1); // 1회 게임 실행(go)
		
		AdvancedLevel aLevel = new AdvancedLevel(); //업그레이드용 객체 생성
		player.upgradeLevel(aLevel); //객체 upcasting & 변경
		player.play(2); // 2회 게임 실행(AdvancedLevel)
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
