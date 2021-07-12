package array;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> lib = new ArrayList<Book>();

		lib.add(new Book("�¹�", "���"));
		lib.add(new Book("����", "��"));
		lib.add(new Book("�","��"));
		lib.add(new Book("����", "��"));
		lib.add(new Book("�", "����"));
		
		for(int i=0;i<lib.size();i++) {
			Book book = lib.get(i);
			book.showBookInfo();
		}
		
		System.out.println("#### ���� For�� ####");
		for(Book book : lib) {
			book.showBookInfo();
		}
		
	}
}
