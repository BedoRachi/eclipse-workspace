package lambda;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
}

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		System.out.println("��� å�� ������ ��");
		bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("å�� ������ 20000�� �̻��� å�� �̸��� �����Ͽ� ���");
		bookList.stream().filter(s->s.getPrice()>= 20000).map(c->c.getName()).sorted().forEach(c -> System.out.println(c));
	}

}
