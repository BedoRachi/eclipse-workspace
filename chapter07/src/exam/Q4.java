package exam;

public class Q4 {

	public static void main(String[] args){
		int lineCount;
		int starCount;
		
		for(lineCount=0; lineCount<4; lineCount++) { // 총 4개의 라인을 출력하며(0,1,2,3)
			for(starCount=0; starCount<=lineCount;starCount++) { //Line 과 star를 비교하여 별를 출력함(0<=0, 0<=1, 0<=0, 0<=1, 0<=2....3<=3)
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}

/*
 * 결과값
 *
 **
 ***
 ****
 */
