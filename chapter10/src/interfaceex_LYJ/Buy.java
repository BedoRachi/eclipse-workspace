package interfaceex_LYJ;

public interface Buy {
	
	public void buy();

	default void order() {
		System.out.println("�����ֹ�");
	}
}
