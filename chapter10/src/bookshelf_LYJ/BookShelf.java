package bookshelf_LYJ;

public class BookShelf extends Shelf implements Queue {
	
	//shelf가 상속되어 있기 때문에 BookSehl 생성(new)시 Shelf ArrayList또한 생성된다.
	@Override
	public void enQueue(String title) {
		shelf.add(title); //shlef Class의 shelf ArrayList를 사용
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0); //Index Array객체를 반환 후 삭제한다. 즉 012 -> 01 -> 0 -> 객체 소멸 순으로 진행된다.
	}
	
	@Override
	public int getSize() {
		return getCount();
	}

}
