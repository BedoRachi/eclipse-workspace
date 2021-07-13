package bookshelf_LYJ;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf(); //shelf가 BookShelf에 상속되어 있기 때문에 생성(new)시 ArrayList또한 생성된다.
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		Queue shelfQueue1 = new BookShelf(); //shelf가 BookShelf에 상속되어 있기 때문에 생성(new)시 ArrayList또한 생성된다.
		shelfQueue1.enQueue("태백산맥A");
		shelfQueue1.enQueue("태백산맥B");
		shelfQueue1.enQueue("태백산맥C");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue1.deQueue());
		System.out.println(shelfQueue1.deQueue());
		System.out.println(shelfQueue1.deQueue());
	}
	

}
