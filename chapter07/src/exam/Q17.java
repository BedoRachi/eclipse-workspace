package exam;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" }; //컴퓨터가 낼 수 있는 경우
		Scanner scan = new Scanner(System.in); // 입력값 받는용 
		String user;
		int i;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		do { //1차 반복문(true)
			System.out.println("가위 바위 보! >> ");
			user = scan.next();//사용자의 입력값을 받아서 저장
			if(user.equals("그만")) { //그만이 입력될 경우
				break; //1차 반복문 종료
			}
			i = (int)(Math.random()*3); //컴퓨터의 값을 랜덤으로 산출(0 = 가위, 1 = 바위, 2 = 보)
			if(user.equals("가위")) {
				if(str[i].equals("가위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 비겼습니다.");
					continue;
				} else if(str[i].equals("바위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 컴퓨터가 이겼습니다.");
					continue;
				}else if(str[i].equals("보")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
					continue;
				}
			}
			if(user.equals("바위")) {
				if(str[i].equals("가위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
					continue;
				} else if(str[i].equals("바위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 비겼습니다.");
					continue;
				}else if(str[i].equals("보")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 컴퓨터가 이겼습니다.");
					continue;
				}
			}
			if(user.equals("보")) {
				if(str[i].equals("가위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 컴퓨터가 이겼습니다.");
					continue;
				} else if(str[i].equals("바위")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 사용자가 이겼습니다.");
					continue;
				}else if(str[i].equals("보")){
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[i] + " 비겼습니다.");
					continue;
				}
			}
		}while(true);
		System.out.println("게임을 종료합니다.");

	}

}
