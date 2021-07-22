package chapter13.test;

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

public class LibraryTest2 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		Book tmp = null;
		int sum = 0;
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		System.out.println("## ��� å�� ������ �� ##");
		for (int i = 0; i < bookList.size(); i++) {
			sum += bookList.get(i).getPrice();
		}
		System.out.println(sum);
		System.out.println("## å�� ������ 20000�� �̻��� å�� �̸��� �����Ͽ� ��� ##");
		for(int i =0; i<bookList.size();i++) {//���� String(Source)
			for(int j=0; j<bookList.size(); j++) { //�񱳴�� String(Target)
				if(bookList.get(i).getName().compareTo(bookList.get(j).getName())<0) {//String �� compareTo�� ���ؼ� ���� �ڸ� �ٲ�(Source�� Target ���� ������ �϶�)
					//S ���� T�� ������ -�� ����(��������)
					//S ���� T�� ������ 0�� ����
					//S ���� T�� ũ�� +�� ����(��������)
					tmp = bookList.get(i);
					bookList.set(i, bookList.get(j));
					bookList.set(j, tmp);
				}
				sum += bookList.get(i).getPrice();
			}
		}
		for(int i=0; i<bookList.size();i++) {
			if(bookList.get(i).getPrice()>=20000) {
				System.out.println(bookList.get(i).getName());
			}
		}
	}
}