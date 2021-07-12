package Weakly_Test1;

public class Q6 {

	public static void main(String[] args) {
		int max=0;
		
		int[] array = {4,5,1,2,3}; //랜덤한 배열 입력
		for(int i=0; i<array.length;i++) { //배열의 크기만큼 반복
			if(array[i] > max) { //배열을 기존의 MAX와 비교하여 클 경우 MAX 갱신
				max=array[i];
			}
		}
		System.out.println("MAX: " + max);

	}
}
