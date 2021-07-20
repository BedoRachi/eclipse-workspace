package innerclass;

import java.lang.Runnable;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRuuable(int i) {
		int num =100;
		
		return new Runnable() { //Anonymouse Class 선언(class가 생략됨)
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // ERROR 발생, ??
				//i =100;// ERROR 발생, ??
				int r = 300;
				System.out.println("i: " + i);
				System.out.println("num: " + num);
				System.out.println("r: " + r);
				System.out.println("outNum: " + outNum);
				System.out.println("sNum: " + sNum);
				System.out.println("localNum: " + localNum);
			}
		}; //AnonymouseClass는 Class 마지막에 ; 를 해야함
	}
	
	Runnable runner = new Runnable() { //Anonymouse Class 생성(new)
		@Override
		public void run() {
			System.out.println("Runnable 구현");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2(); //외부 클래스 호출
		Runnable runnable = out.getRuuable(100); //내부 클래스의 메소드 호출
		runnable.run(); //지역 클래스 생성
		out.runner.run(); //지역 클래스 호출
	}

}
