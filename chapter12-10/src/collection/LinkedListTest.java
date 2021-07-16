package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>(); //LinkedList를 String 자료형으로 생성
		
		myList.add("A"); //값추가
		myList.add("B");
		myList.add("C");
		System.out.println(myList);
		
		myList.add(1, "D"); //1번 자리를 D로 변경(B->D)
		System.out.println(myList);
		
		myList.addFirst("0"); // 맨 앞 자리에 0 추가
		System.out.println(myList);
		
		System.out.println(myList.removeLast()); //맨 마지막 자리를 삭제 후 반환
		System.out.println(myList);
	}

}
