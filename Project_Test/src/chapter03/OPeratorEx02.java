package chapter03;

public class OPeratorEx02 {

	public static void main(String[] args) {
		// 산술 연산자 테스트
		int mathScore = 90;
		int engScore = 70;
		int totalScore = mathScore + engScore;
		
		System.out.println("Total Score = " + totalScore);
		
		int avgScore = (mathScore+engScore)/3;
		
		System.out.println("Average Score = " + avgScore);
		
		float modScore = (float)mathScore / (float)engScore;
		String ch3 = "Remainder Score = ";
		System.out.println(ch3 + modScore);
		
		
	}
}

