package Weakly_Test1;

import java.util.ArrayList;
import java.util.Scanner;
public class Q14_LYJ_EXE {
	
	public static void main(String[] args) {
		ArrayList<Q14_LYJ> strArray = new ArrayList<Q14_LYJ>();
		Scanner scan = new Scanner(System.in);
		Q14_Test_LYJ sub = new Q14_Test_LYJ();
		String YN;
		
		do {
		strArray = sub.Input();
		sub.Output(strArray);
		System.out.println("프로그램 종료하시겠습니까? Y/N.");
		YN=scan.next();
		}while(YN.equals("N") || YN.equals("n"));
		
		
	}

}
