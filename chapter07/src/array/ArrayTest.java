package array;

public class ArrayTest {
	//Array 테스트, Array.length, for응용
	public static void main(String[] args) {
		int[] num = new int[10];
		int total=0;
		int temp = 1;
		
		for(int i=0; i < num.length; i++ ) {
			num[i] = temp;
			total += num[i];
			temp++;

		}
		for(int j=0; j < 10; j++ ) {
			System.out.println(num[j] + " " + total);
		}
		
		System.out.println(num.length);
	}

}

/*
 * 결과값 
 * 1 55
 * 2 55
 * 3 55
 * 4 55
 * 5 55
 * 6 55
 * 7 55
 * 8 55
 * 9 55
 * 10 55
 * 10
 */