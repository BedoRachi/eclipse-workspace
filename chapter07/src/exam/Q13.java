package exam;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10};
		int money;
		
		System.out.println("�ݾ��� �Է��ϼ���");
		money = scan.nextInt();
		
		for(int i=0; i<unit.length;i++) {
			System.out.printf("%d ��¥��: %d \n", unit[i],money/unit[i]);
			money = money - (money/unit[i]) * unit[i];
		}
		scan.close();
	}
}
