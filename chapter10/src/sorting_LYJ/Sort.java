package sorting_LYJ;

public interface Sort {
	public void ascedning(int[] arr);
	public void desending(int[] arr);
	default void description() {
		System.out.println("정수형 배열을 입력받아 출력하는 알고리즘 입니다.");
	}
	
}
