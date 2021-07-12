package Weakly_Test1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" };
		Scanner scan = new Scanner(System.in);
		String user;

		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {//무한 반복
			System.out.print("가위 바위 보! >>  ");
			user = scan.nextLine();
			int i = (int)(Math.random()*3); //랜덤한 선택을 입력(0=가위, 1=바위, 2=보)
			
			//컴퓨터와 사람의 입력값을 비교하여 출력
			if (user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			} else if (str[i].equals(user)) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 비겼습니다.");
			} else if (user.equals("가위") && str[i].equals("바위")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 졌습니다.");
			} else if (user.equals("가위") && str[i].equals("보")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
			} else if (user.equals("바위") && str[i].equals("가위")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
			} else if (user.equals("바위") && str[i].equals("보")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 졌습니다.");
			} else if (user.equals("보") && str[i].equals("가위")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 졌습니다.");
			} else if (user.equals("보") && str[i].equals("바위")) {
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
			} else {
				System.out.println("가위,바위,보 중에서 입력해주세요");
			}
			

		}

	}

}
