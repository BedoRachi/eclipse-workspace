package bookshelf_LYJ;

public class BookShelf extends Shelf implements Queue {
	
	//shelf�� ��ӵǾ� �ֱ� ������ BookSehl ����(new)�� Shelf ArrayList���� �����ȴ�.
	@Override
	public void enQueue(String title) {
		shelf.add(title); //shlef Class�� shelf ArrayList�� ���
	}
	
	@Override
	public String deQueue() {
		return shelf.remove(0); //Index Array��ü�� ��ȯ �� �����Ѵ�. �� 012 -> 01 -> 0 -> ��ü �Ҹ� ������ ����ȴ�.
	}
	
	@Override
	public int getSize() {
		return getCount();
	}

}
