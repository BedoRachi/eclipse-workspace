package array;

public class Book {

	private String bookName, bookAutor;
	
	public Book(String name, String autor) {
		bookName = name;
		bookAutor = autor;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAutor() {
		return bookAutor;
	}

	public void setBookAutor(String bookAutor) {
		this.bookAutor = bookAutor;
	}
	
	public void showBookInfo() {
		System.out.println("책이름: " + bookName + " 저자: " + bookAutor);
	}
}
