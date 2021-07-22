package exception;
//try-catch문 사용
public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int [5];
		
		try { //실행할 구문이며 에러가 발생할 가능성이 있는 부분
			for(int i =0;i<=5;i++) {
				arr[i] = i;
				System.out.print(arr[i]); //arr[i] 는 0~4이므로 5에서 Error발생
			}
		}catch(ArrayIndexOutOfBoundsException e) { //Error가 발생할 경우 ArrayIndexOutOfBoundsException을 반환함
			System.out.println(e); //반환받은 e를 출력함
			System.out.println("예외 처리부분"); //지정된 문구 출력
		}
		System.out.println("프로그램 종료");
		
	}

}
