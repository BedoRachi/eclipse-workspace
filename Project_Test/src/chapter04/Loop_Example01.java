package chapter04;

public class Loop_Example01 {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		
		while(num < 11){
			sum += num;
			num++;
		System.out.println("sum: " + sum + " / num: " + num);
		}
		
		System.out.println("0~50�� ����" + sum + "�Դϴ�.");
		
		
	}

}
