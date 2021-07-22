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
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		System.out.println("## 모든 책의 가격의 합 ##");
		for (int i = 0; i < bookList.size(); i++) {
			sum += bookList.get(i).getPrice();
		}
		System.out.println(sum);
		System.out.println("## 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력 ##");
		for(int i =0; i<bookList.size();i++) {//비교할 String(Source)
			for(int j=0; j<bookList.size(); j++) { //비교대상 String(Target)
				if(bookList.get(i).getName().compareTo(bookList.get(j).getName())<0) {//String 을 compareTo로 비교해서 서로 자리 바꿈(Source가 Target 보다 선순위 일때)
					//S 보다 T가 작으면 -가 나옴(오름차순)
					//S 보다 T가 같으면 0이 나옴
					//S 보다 T가 크면 +가 나옴(내림차순)
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