package chapter04;

public class Loop_For_Break_Ex01 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i=1, sum=0; sum <100; i++ ) { //�ݺ��� ���� 0~100����
			sum+=i;
			System.out.println("�ȳ��ϼ���. "+ i + "��° �����Դϴ�.");
			System.out.println("0 ����"+i+"������ ���� "+sum+" �Դϴ�.");
			if(sum>50) { //���� sum�� 50���� Ŭ ���
				break; //�ݺ��� ����
			}
		}

	}
}
