package chapter04;

public class Switch_example03 {
	
	public static void main(String[] args) {
		int month = 1;
		int day=0;
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			day=31;
			break;
		case 4 : case 6 : case 9 : case 11 :
			day=30;
			break;
		case 2 : 
			day=28;
			break;
		default :
			System.out.println("잘못된 월 입니다.");
		}
		
		System.out.println(month + "월의 일수는 " + day + "일 입니다.");
	}

}
