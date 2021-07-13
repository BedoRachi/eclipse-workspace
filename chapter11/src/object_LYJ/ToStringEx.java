package object_LYJ;

class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	@Override
	public String toString() { //Object Class의 toString을 재정의
		return bookTitle + " ; " + bookNumber;
	}
	
}
public class ToStringEx{
	public static void main(String[] args) {
		Book book = new Book(200, "개미");
		
		System.out.println(book);
		System.out.println(book.toString());
	}
}