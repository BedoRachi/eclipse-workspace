package chapter04;

public class Loop_For_Example01 {

	public static void main(String[] args) {
		int i;
		int sum;
		
		for(i=1, sum=0; sum <10000; i++ ) { //조건 선언, 변수초기화, 증감 선택
			sum+=i;
			System.out.println("안녕하세요. "+ i + "번째 실행입니다.");
			System.out.println("0 부터"+i+"까지의 합은 "+sum+" 입니다.");
		}
		
	}
}

