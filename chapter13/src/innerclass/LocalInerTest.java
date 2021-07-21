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
				// num = 200; // ERROR �߻�, Inner Class �ܺο��� ����� ������ �����Ұ���(=final ��� ���)
				// i =100;// ERROR �߻�, Inner Class �ܺο��� ����� ������ ���Ұ�(=final ��� ���)
				// localNum = 10; // ERROR �߻�, Inner Class �ܺο��� ����� ������ ���Ұ�(=final ��� ���)
				int r = 300; // Inner Class���ο��� ����� ������ ��밡��
				int num2 = num; // �ܺο��� ����� ������ ����� ������(Read Only)
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
