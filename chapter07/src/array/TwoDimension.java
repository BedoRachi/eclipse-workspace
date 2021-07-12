package array;

public class TwoDimension {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		
		for (int i = 0; i < arr.length; i++) {//행 출력
			for (int j = 0; j < arr[i].length; j++) { //열 출력
				System.out.println(arr[i][j]);
			}
			
			System.out.println("#######################");
			System.out.println(arr.length);//행의 크기
			System.out.println(arr[0].length);//열의 크기
			System.out.println(arr[0][0]); //1
			System.out.println(arr[0][1]); //2
			System.out.println(arr[0][2]); //3
			System.out.println(arr[1][0]); //4
			System.out.println(arr[1][1]); //5
			System.out.println(arr[1][2]); //6
		}
	}
}

