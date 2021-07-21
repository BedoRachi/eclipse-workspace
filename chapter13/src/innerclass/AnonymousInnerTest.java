package innerclass;

import java.lang.Runnable;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRuuable(int i) { //getRuuable이 호출 될 경우 Runnable을 return 받는다.
		int num =100;
		
		return new Runnable() { //Anonymouse Class 생성됨(Runnable 객체가 생성되어 Return 됨)
			int localNum = 10;  //객체 생성 시작
			@Override
			public void run() {
				// num = 200; // ERROR 발생, Inner Class 외부에서 선언된 변수는 수정불가함(=final 상수 취급)
				// i =100;// ERROR 발생, Inner Class 외부에서 선언된 변수는 사용불가(=final 상수 취급)
				// localNum = 10; // ERROR 발생, Inner Class 외부에서 선언된 변수는 사용불가(=final 상수 취급)
				int r = 300; // Inner Class내부에서 선언된 변수는 사용가능
				int num2 = num; // 외부에서 선언된 변수를 사용은 가능함(Read Only)
				System.out.println("i: " + i);
				System.out.println("num: " + num);
				System.out.println("r: " + r);
				System.out.println("outNum: " + outNum);
				System.out.println("sNum: " + sNum);
				System.out.println("localNum: " + localNum);
			}
		}; //AnonymouseClass는 Class 마지막에 ; 를 해야함(여기까지가 객체 생성완료)
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
