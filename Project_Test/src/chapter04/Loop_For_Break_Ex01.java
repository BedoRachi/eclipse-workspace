package chapter04;

public class Loop_For_Break_Ex01 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i=1, sum=0; sum <100; i++ ) { //반복문 시작 0~100까지
			sum+=i;
			System.out.println("안녕하세요. "+ i + "번째 실행입니다.");
			System.out.println("0 부터"+i+"까지의 합은 "+sum+" 입니다.");
			if(sum>50) { //만약 sum이 50보다 클 경우
				break; //반복문 종료
			}
		}

	}
}
