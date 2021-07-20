package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	public InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutClass num: " + num);
			System.out.println("OutClass sNum: " + sNum);
		}
		
		public void usingClass() {
			inClass.inTest();
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("내부클래스 호출");
		outClass.inClass.
	}
}
