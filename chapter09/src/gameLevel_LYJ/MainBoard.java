package gameLevel_LYJ;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player(); //�÷��̾� ����
		player.play(1); // 1ȸ ���� ����(go)
		
		AdvancedLevel aLevel = new AdvancedLevel(); //���׷��̵�� ��ü ����
		player.upgradeLevel(aLevel); //��ü upcasting & ����
		player.play(2); // 2ȸ ���� ����(AdvancedLevel)
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
