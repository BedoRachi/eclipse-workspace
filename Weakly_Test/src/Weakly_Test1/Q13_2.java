package Weakly_Test1;

public class Q13_2 {
	public static void main(String[] args) {
		int[] array = new int[100];
		int one = 0, ten = 0, count = 1;// 1의 자리 one / 10의 자리 ten
		
		// 1~99까지 반복
		for (int i = 0; i < array.length; i++, count++) { 
			array[i] = count; // 배열에 1~99값 입력
			one = array[i] % 10; // 배열의 값을 10으로 나눠 1의 자리를 구함
			ten = array[i] / 10; // 배열의 값을 10으로 나눠 10의 자리를 구함
			
			// 일,십의 자리가 369일 때(0은 제외함)
			if ((ten % 3 == 0) && (one % 3 == 0) && (one != 0) && (ten != 0)) { 
				System.out.println(array[i] + " 박수 짝짝");
				
			//십의 자리만 369일 때(0은 제외함) or 일의 자리만 369 때(0은 제외함)
			} else if (((ten % 3 == 0) && (ten != 0)) || ((one % 3 == 0) && (one != 0))) { 
				System.out.println(array[i] + " 박수 짝");
			}
		}
	}
}
