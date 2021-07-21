package innerclass;

import java.lang.Runnable;

class Outer {
	int outNum = 100;
	static int sNum = 200;

	Runnable getRunnable(int i) { // java.lang.Runnable
		int num = 100;

		class MyRunnable implements Runnable {
			int localNum = 10;

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
		}
		return new MyRunnable();
	}

}

public class LocalInerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
