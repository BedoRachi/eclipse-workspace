package chapter04;

public class Switch_Example01 {

	public static void main(String[] args) {
		
		String medal = "Gold";
		
		switch(medal) {
		case "Gold" :
			System.out.println("금메달");
			break;
		case "Silver" :
			System.out.println("은메달");
			break;
			
		case "Coper" : 
			System.out.println("동메달");
			break;
		default :
			System.out.println("노메달");
		}
		System.out.println(medal + " 메달을 받으셨습니다");
	}
}
