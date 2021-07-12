package exam;

public class Q5 {

	public static void main(String[] args) {
		
		int[] score = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for(int i=0; i<score.length;i++) {
			sum +=score[i];
		}
		System.out.println("1~10까지의 총합: "+sum);
	}
}

/*
 * 결과값 
 * 1~10까지의 총합: 55
 */