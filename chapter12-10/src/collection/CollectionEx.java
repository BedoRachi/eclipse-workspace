package collection;

import java.util.*;

public class CollectionEx {

	static void printList(LinkedList<String> PL) { //LinkedList를 매개변수로 받는 Class method
		Iterator<String> iterator = PL.iterator();
		while(iterator.hasNext()) {//전체 순차 진행
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->"; //다음칸이 있을 경우
			} else {
				separator = "\n"; //마지막칸일 경우
			}
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		Collections.sort(myList);//Static Method(Collections)에서 Sort를 호출하여 요소 순정렬
		printList(myList);
		
		Collections.reverse(myList); //역순 정렬
		printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타") +1; //이진탐색트리를 통해 myList에서 "아바타" 검색 후 순정렬(+1)
		System.out.println("순서는: " + index);
	}

}
