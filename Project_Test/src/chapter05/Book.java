package chapter05;

public class Book {

	String title;
	String name;

	public Book(String t) {
		if (t == "춘향전") {
			title = t;
			name = "작자미상";
		}

		else if (t.equals("어린왕자")) {
			title = t;
			name = "생텍쥐페리";
		} else if (t.equals("난중일기")) {
			title = t;
			name = "이순신";
		} else if (t.equals("자바프로그래밍 입문")) {
			title = t;
			name = "박은종";
		} else {
			title = "잘못된 입력 입니다.";
			name = "잘못된 입력 입니다";
		}
		
	}

	public Book(String t, String n) {
		title = t;
		name = n;
	}

}
