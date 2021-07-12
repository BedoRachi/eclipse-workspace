package Weakly_Test1;

public class Q13_1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		double total=0;
		
		System.out.print("랜덤한 정수들: ");
		for(int i=0;i<array.length;i++) {//배열의 크기만큼 반복
			array[i] = (int)(Math.random()*10+1);//랜덤한 정수를 배열에 입력
			total+=array[i]; //랜덤한 정수를 합산
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("평균은: " + (total/array.length)); //정수 합산을 배열의 크기로 나눔(평균)
	}
}

