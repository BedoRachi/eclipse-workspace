package bookshelf_LYJ;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�¹���1");
		shelfQueue.enQueue("�¹���2");
		shelfQueue.enQueue("�¹���3");
		
		Queue shelfQueue1 = new BookShelf();
		shelfQueue1.enQueue("�¹���A");
		shelfQueue1.enQueue("�¹���B");
		shelfQueue1.enQueue("�¹���C");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println(shelfQueue1.deQueue());
		System.out.println(shelfQueue1.deQueue());
		System.out.println(shelfQueue1.deQueue());
	}
	

}
