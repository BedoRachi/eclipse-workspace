package array;

public class ObjectCopy1 {
//배열 System.arraycopy 테스트(얕은 복사)
	
	public static void main(String[] args) {
		Book[] lib = new Book[5]; // 원본 배열
		Book[] lib2 = new Book[5]; //복사 배열
		
		lib[0] = new Book("태백", "산맥");
		lib[1] = new Book("데미", "안");
		lib[2] = new Book("어떻", "게");
		lib[3] = new Book("토", "지");
		lib[4] = new Book("어린", "왕자");
		System.arraycopy(lib, 0, lib2, 0, 5);//lib의 0부터 5개를 복사하여 lib2 0부터 붙여넣는다.(단 값의 좌표값이 복사된다.)
		
		
		for(int i=0; i<4; i++) {//lib와 lib1이 같은 값이 출력됨을 확인
			lib[i].showBookInfo();
			System.out.println(lib[i]);
			lib2[i].showBookInfo();
			System.out.println(lib2[i]);
		}
		
		System.out.println("##########################");
		lib[0].setBookName("강원"); //lib 0번의 값이 변경됨
		lib[0].showBookInfo(); // lib 0번의 값 변경 확인
		lib2[0].showBookInfo(); //lib2 0번의 값이 같이 변경됨을 확인
		//얕은 복사의 경우 값의 좌표를 복사하기 때문에 값이 변경되면 복사한 배열에도 적용됨
		
	}
}

/*
 * 결과값 
 * 책이름: 태백 저자: 산맥 
 * array.Book@7de26db8 
 * 책이름: 태백 저자: 산맥 
 * array.Book@7de26db8
 * 책이름: 데미 저자: 안 
 * array.Book@1175e2db 
 * 책이름: 데미 저자: 안 
 * array.Book@1175e2db 
 * 책이름: 어떻 저자: 게 
 * array.Book@36aa7bc2 
 * 책이름: 어떻 저자: 게 
 * array.Book@36aa7bc2 
 * 책이름: 토 저자: 지
 * array.Book@76ccd017 
 * 책이름: 토 저자: 지 
 * array.Book@76ccd017
 * ##########################
 * 책이름: 강원 저자: 산맥
 * 책이름: 강원 저자: 산맥
 */