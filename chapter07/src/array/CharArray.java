package array;

import java.util.ArrayList;
//arrayList를 이용한 char 출력
public class CharArray {

	public static void main(String[] args) {
		
		ArrayList alpha = new ArrayList(); // ArrayList 생성
		char ch = 'A'; // 입력 초기값 생성
		
		for(int i=0; i <26;i++, ch++) {
			alpha.add(ch); // ArrayList에 값 입력(char가 순차적으로 증가하여 입력)
		}
		
		for(int j=0;j<alpha.size();j++) { //j와 ArrayList의 크기를 비교하여 반복
			System.out.print(alpha.get(j)); // ArrayList에서 j번째 값을 출력
		}
		System.out.println();
		System.out.println("################################");
		for(Object c : alpha) {
			System.out.print(c);
		}
		

	}

}

/*
결과값
ABCDEFGHIJKLMNOPQRSTUVWXYZ
################################
ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */