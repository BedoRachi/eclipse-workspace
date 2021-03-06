package bookshelf_LYJ;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //배열 정의
	
	public Shelf() {//기본생성자에 배열 생성을 만듬으로써 Shelf가 호출(or상속)될 때 자동으로 배열이 생성됨
		shelf = new ArrayList<String>(); //배열 생성
	}
	
	public ArrayList<String> getShelf(){ //배열 반환
		return shelf;
	}
	
	public int getCount() { //배열 크기 반환
		return shelf.size();
	}
}
