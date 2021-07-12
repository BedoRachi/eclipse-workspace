package finalex;

public class Constant {
	
	int num=10;
	int nUM=20;
	int nUm=30;
	final int NUM = 40;
	
	public static void main(String[] args) {
		
		Constant cons = new Constant();
		cons.num=50;
		//cons.NUM=200; Error 발생, 상수에는 값 할당 불가
		
		System.out.println(cons.num);
		System.out.println(cons.nUm);
		System.out.println(cons.nUM);
		System.out.println(cons.NUM);
		

	}

}
