package chapter04;

public class For_Q4_Example01 {
//7일차 PDF Q4 반복문 테스트
	public static void main(String[] args) {
		int count;
		int blink;
		int star;
		int starCount;
		

		for (count = 0, star = 1; count < 4; count++) { // 1차 반복문
			for (blink = 3; count < blink; blink--) {//1-1 반복문
				System.out.print(" "); //빈칸 만들기
			}
			for (starCount = 0; starCount < star; starCount++) { // 1-2 반복문
				System.out.print("*"); //별 만들기
			}
			star += 2; // 홀수씩 증가
			System.out.println(""); //다음줄로 변경
		}
	}

}
/*
 * "빈칸을 생성 -> 별을 생성 -> 다음줄로 변경" -> "빈칸을 생성 -> 별을 생성 -> 다음줄로 변경" -> ....을 4번 반복하는
 * 반복문 1개 줄에서 진행되는 작업은 빈칸생성 / 별 생성으로 나눠져 있기 때문에 2개의 for문을 사용함
 * 별의 갯수가 홀수 이기 때문에 1-2 반복문은 항상 홀수번 반복해야함
 * 빈칸은 최대 3칸에서 1칸씩 감소하기 때문에 반복할 때 마다 -1씩 함 
 */


