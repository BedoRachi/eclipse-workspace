package chapter04;

public class Switch_Example02 {

	public static void main(String[] args) {
		
		String medal = "Silver";
		/*
		 * switch(medal) { case "Gold" : case "G" : case "g" :
		 * System.out.println("금메달"); break; case "Silver" : case "S" : case "s" :
		 * System.out.println("은메달"); break;
		 * 
		 * case "Coper" : case "C" : case "c" : System.out.println("동메달"); break;
		 * default : System.out.println("노메달"); } System.out.println(medal +
		 * " 메달을 받으셨습니다");
		 */
		if(medal=="Gold" || medal=="G" || medal=="g") {
			System.out.println("금메달 입니다.");
		}
		else if(medal=="Silver" || medal=="S" || medal=="s") {
			System.out.println("은메달 입니다.");
		}
		else if(medal=="Bronze" || medal=="B" || medal=="b") {
			System.out.println("동메달 입니다.");
		}
		else {
			System.out.println("메달이 없습니다.");
		}
	}

}
