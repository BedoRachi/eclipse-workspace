package stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum(); //arr에 저장된 모든 값을 합산함
		int count = (int)Arrays.stream(arr).count();//arr의 배열의 갯수를 Int(원래는 Long)으로 반환
		
		System.out.println(sumVal);
		System.out.println(count);
		
	}

}
