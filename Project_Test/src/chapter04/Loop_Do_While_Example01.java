package chapter04;

public class Loop_Do_While_Example01 {

	public static void main(String[] args) {
		
		int num=20;
		int sum=0;
		
		do {
			sum+=num;
			num++;
			System.out.println("sum: " + sum + " / num: " + num);
		} while(num <11);
		
		System.out.println("0~50의 합은" + sum + "입니다.");
	}
}
