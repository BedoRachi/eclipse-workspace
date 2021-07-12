package array;

import java.util.ArrayList;

public class BookArrayListTest {

	public static void main(String[] args) {
		Book[] lib = new Book[5];

		lib[0] = new Book("태백", "산맥");
		lib[1] = new Book("데미", "안");
		lib[2] = new Book("어떻", "게");
		lib[3] = new Book("토", "지");
		lib[4] = new Book("어린", "왕자");

		for (int i = 0; i < lib.length; i++) {
			lib[i].showBookInfo();
			System.out.println(lib[i]);
		}

		/*
		 * ArrayList를 통한 재현
		 * ArrayList<Book> lib1 = new ArrayList<Book>(); //객체 타입의 배열을 선언(Stack 영역)+메모리
		 * 공간 확보(Heap 영역) 
		 * lib1.add(new Book("태백", "산맥")); 
		 * lib1.add(new Book("데미","안"));
		 * lib1.add(new Book("어떻", "게")); 
		 * lib1.add(new Book("토", "지")); 
		 * lib1.add(new Book("어린", "왕자"));
		 * 
		 * 
		 * 
		 * #############################################################################
		 * For문
		 * for(int i=0; i<lib1.size(); i++) { 
		 * Book book = lib1.get(i); 
		 * book.showBookInfo(); 
		 * }
		 * //lib1에서 i번째 값을 가져와 book에 넣은 후 book을 통해 출력한다. 
		 * #############################################################################
		 * 
		 * #############################################################################
		 * Enhanced For문
		 * for(Book book : lib1) {
		 * book.showBookInfo(); 
		 * } 
		 * //lib1에서 0번부터 순차적으로 book을 불러와 showBookInfo() 출력
		 * #############################################################################
		 */		
		/*
		 * 결과물 
		 * 책이름: 태백 저자: 산맥 
		 * 책이름: 데미 저자: 안 
		 * 책이름: 어떻 저자: 게 
		 * 책이름: 토 저자: 지 
		 * 책이름: 어린 저자: 왕자
		 */
		
		
		

	}

}
