package array;

public class ObjectCopy3 {
	//배열 array 복사 테스트(깊은 복사)
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3]; //원본배열
		Book[] bookArray2 = new Book[3]; //대상배열
		
		bookArray1[0] = new Book("태백산맥", "조정래"); //원본배열 값 입력
		bookArray1[1] = new Book("어린왕자", "생텍쥐베리");
		bookArray1[2] = new Book("난중일기", "이순신");
		
		bookArray2[0] = new Book(null, null); //대상배열 초기화
		bookArray2[1] = new Book(null, null);
		bookArray2[2] = new Book(null, null);
		
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookAutor(bookArray1[i].getBookAutor()); //i번 원본배열의 값을 i번 대상배열로 복사
			bookArray2[i].setBookName(bookArray1[i].getBookName()); //i번 원본배열의 값을 i번 대상배열로 복사
		}
		
		bookArray1[0].setBookName("NAME"); // 원본배열의 0번째 객체의 값을 변경
		bookArray1[0].setBookAutor("AUTOR"); // 원본배열의 0번쨰 객체의 값을 변경
		bookArray1[0].showBookInfo();
		
		for(int i=0; i<bookArray2.length;i++){
			bookArray2[i].showBookInfo(); //i번 부터 대상배열을 순차 출력
			System.out.println(bookArray1[i]); // 원본 배열 주소값 확인
			System.out.println(bookArray2[i]); // 복사 배열 주소관 확인
		}
		
	}
}

/*
 * 결과값
 * 책이름: NAME 저자: AUTOR
 * 책이름: 태백산맥 저자: 조정래
 * array.Book@7de26db8
 * array.Book@1175e2db
 * 책이름: 어린왕자 저자: 생텍쥐베리
 * array.Book@36aa7bc2
 * array.Book@76ccd017
 * 책이름: 난중일기 저자: 이순신
 * array.Book@182decdb
 * array.Book@26f0a63f

 */
