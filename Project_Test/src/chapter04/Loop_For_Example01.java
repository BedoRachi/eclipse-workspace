package chapter04;

public class Loop_For_Example01 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i=1, sum=0; sum <10000; i++ ) { //���� ����, �����ʱ�ȭ, ���� ����
			sum+=i;
			System.out.println("�ȳ��ϼ���. "+ i + "��° �����Դϴ�.");
			System.out.println("0 ����"+i+"������ ���� "+sum+" �Դϴ�.");
		}
		
	}
}

