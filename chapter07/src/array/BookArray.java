package array;

public class BookArray {
//Object형 배열의 사용
	public static void main(String[] args) {
		
		Book[] lib = new Book[5]; //배열을 생성
		
		lib[0] = new Book("태백", "산맥"); // 배열에 데이터를 저장
		lib[1] = new Book("데미", "안");
		lib[2] = new Book("어떻", "게");
		lib[3] = new Book("토", "지");
		lib[4] = new Book("어린", "왕자");
		
		for(int i=0; i<lib.length; i++) {
			lib[i].showBookInfo(); //특정 Array의 Object에서 Method를 실행 -> 출력
			System.out.println(lib[i]); //Array를 출력할 경우 해당 Array에 저장된 "좌표값"이 출력
		}
	}
}
/*
 * 결과값 
 * 책이름: 태백 저자: 산맥 
 * array.Book@7de26db8 
 * 책이름: 데미 저자: 안 
 * array.Book@1175e2db 
 * 책이름: 어떻 저자: 게 
 * array.Book@36aa7bc2 
 * 책이름: 토  저자: 지 
 * array.Book@76ccd017 
 * 책이름: 어린 저자: 왕자
 * array.Book@182decdb
 */