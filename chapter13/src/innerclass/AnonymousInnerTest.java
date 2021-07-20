package innerclass;

import java.lang.Runnable;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRuuable(int i) {
		int num =100;
		
		return new Runnable() { //Anonymouse Class ����(class�� ������)
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // ERROR �߻�, ??
				//i =100;// ERROR �߻�, ??
				int r = 300;
				System.out.println("i: " + i);
				System.out.println("num: " + num);
				System.out.println("r: " + r);
				System.out.println("outNum: " + outNum);
				System.out.println("sNum: " + sNum);
				System.out.println("localNum: " + localNum);
			}
		}; //AnonymouseClass�� Class �������� ; �� �ؾ���
	}
	
	Runnable runner = new Runnable() { //Anonymouse Class ����(new)
		@Override
		public void run() {
			System.out.println("Runnable ����");
		}
	};
}

public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2(); //�ܺ� Ŭ���� ȣ��
		Runnable runnable = out.getRuuable(100); //���� Ŭ������ �޼ҵ� ȣ��
		runnable.run(); //���� Ŭ���� ����
		out.runner.run(); //���� Ŭ���� ȣ��
	}

}
