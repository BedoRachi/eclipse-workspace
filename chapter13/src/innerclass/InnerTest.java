package innerclass;

class OutClass{ //�ܺ� Ŭ����
	private int num = 10; //�ܺ� Ŭ���� ����
	private static int sNum = 20; // �ܺ� ���� ����
	public InClass inClass; //���� Ŭ���� ����(�ܺ� Ŭ������ ���� ���� Ŭ���� ������ ���� �ʿ���)
	
	public OutClass() { //������ 
		inClass = new InClass(); //�ܺ� Ŭ���� ���� �� ���� Ŭ������ ���� ������
	}
	
	static class InStaticClass{//���� ���� Ŭ����
		private int inNum = 100;
		private static int sInNum = 200;
		
		void inTest() {
			//System.out.println("OutClass num: " + num); //Error �߻�, ���� ���� Ŭ�������� �ܺ� Ŭ���� ���� ��� �Ұ�
			System.out.println("OutClass sNum: " + sNum); // ���� Ŭ�������� �ܺ� ���� ���� ȣ��
			System.out.println("StaticInClass inNum: " + inNum); // ���� Ŭ�������� ���� Ŭ���� ���� ȣ��
			System.out.println("StaticInClass sInNum: " + sInNum); // ���� Ŭ�������� ���� ���� ���� ȣ��
			//InClass ic = new InClass(); //Error �߻�, ���� ���� Ŭ�������� �Ϲ� ���� Ŭ���� ȣ�� �Ұ�
	
		}
	}
	
	class InClass{//���� Ŭ����
		private int inNum = 100; //���� Ŭ���� ����
		//static int sInNum = 200; //Error �߻�, �Ϲ� ���� Ŭ�������� ���� ���� ���Ұ�
		
		void inTest() { //���� �޼ҵ�
			System.out.println("OutClass num: " + num); //���� Ŭ�������� �ܺ� Ŭ���� ���� ȣ��(���� Ŭ���� ���� �̱� ������ Private�� ����)
			System.out.println("OutClass sNum: " + sNum); // ���� Ŭ�������� �ܺ� ���� ���� ȣ��
			System.out.println("InClass inNum: " + inNum); // ���� Ŭ�������� ���� Ŭ���� ���� ȣ��
			
			InStaticClass isc = new InStaticClass();
			System.out.println("StaticInClass inNum: " + isc.inNum); // ���� Ŭ�������� ���� ���� Ŭ������ Ŭ���� ���� ȣ��
			System.out.println("StaticInClass sInNum: " + isc.sInNum); // ���� Ŭ�������� ���� ���� Ŭ������ ���� ���� ȣ��
			

		}
		
		public void usingClass() {
			inClass.inTest(); //���� Ŭ������ �޼ҵ� ȣ��
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("����Ŭ���� ȣ��");
		outClass.inClass.usingClass(); //�ܺ�Ŭ����.����Ŭ����.���θ޼ҵ� ȣ��(�� �ܺ� Ŭ�������� ���� Ŭ������ private�� ���� �� ���Ұ�)
		System.out.println("���� ����Ŭ���� ȣ��");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static Class�̱� ������ �ܺ�Ŭ�������� �ٷ� ȣ�� ����
		sInClass.inTest();
		
	}
}
