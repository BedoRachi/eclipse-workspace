package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> lib = new ArrayList<Book>();

		lib.add(new Book("태백", "산맥"));
		lib.add(new Book("데미", "안"));
		lib.add(new Book("어떻","게"));
		lib.add(new Book("데미", "안"));
		lib.add(new Book("어린", "왕자"));
		
		for(int i=0;i<lib.size();i++) {
			Book book = lib.get(i);
			book.showBookInfo();
		}
		
		System.out.println("#### 향상된 For문 ####");
		for(Book book : lib) {
			book.showBookInfo();
		}
		
	}
}
