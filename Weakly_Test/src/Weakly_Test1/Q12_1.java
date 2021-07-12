package Weakly_Test1;

import java.util.Scanner;

public class Q12_1 {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner scan = new Scanner(System.in);
		
		//양의 정수 입력부
		System.out.print("양의정수 "+ array.length+" 개를 입력하시오 >> ");
		for(int i=0; i<array.length;i++) { //배열의 크기만큼 반복
			array[i] = scan.nextInt(); // 입력값을 배열에 넣음
		}
		
		//양의 정수 출력부
		System.out.print("3의 배수는: ");
		for(int j=0; j<array.length;j++) { //배열의 크기만큼 반복
			if(array[j]%3==0) { //배열 중 3의 배수만 출력
				System.out.print(array[j] + " ");
			}
		}
		

	}

}
