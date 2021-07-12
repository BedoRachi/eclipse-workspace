package array;

public class ArrayTest02 {
	//배열 테스트
	public static void main(String[] args) {
		double[] data = new double[5]; //5개의 방을 만듬
		
		data[0] = 10.0; //사전에 만든 방에 값을 입력
		data[1] = 20.0;
		data[2] = 30.0;
		
		for(int i =0; i< data.length ; i++) {
			System.out.println(data[i]);
		}
		
		int[] data2 = {1,2,3,4,5,}; //배열 선언과 동시에 값 할당
		
		for(int i : data2) { // data2의 배열일 처음부터 끝까지 int i에 입력
			System.out.println(i);
		}
	}

}


/* 결과값
 * 10.0 
 * 20.0 
 * 30.0 
 * 0.0 
 * 0.0
 * 1
 * 2
 * 3
 * 4
 * 5
 */