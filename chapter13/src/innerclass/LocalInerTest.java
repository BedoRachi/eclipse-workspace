package innerclass;

import java.lang.Runnable;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable{
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
