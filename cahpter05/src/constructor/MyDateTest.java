package constructor;

import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {
		int day;
		int month;
		int year;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘 날짜 입력기");
		System.out.print("오늘 년도를 입력하세요: ");
		year = scan.nextInt();
		System.out.print("오늘 월을 입력하세요: ");
		month = scan.nextInt();
		System.out.print("오늘 일을 입력하세요: ");
		day = scan.nextInt();
		System.out.println();
		
		MyDate nowDate = new MyDate(day, month, year);
		if(nowDate.isValid()) {
			System.out.println();
			System.out.println("정상적인 입력 확인 후 종료");
		}
		else {
			System.out.println();
			System.out.print("오늘 년도를 입력하세요: ");
			nowDate.setYear(scan.nextInt());
			System.out.print("오늘 월을 입력하세요: ");
			nowDate.setMonth(scan.nextInt());
			System.out.print("오늘 일을 입력하세요: ");
			nowDate.setDay(scan.nextInt());
			if(nowDate.isValid()) {
				System.out.println("정상적인 입력 확인 후 종료");
			}
			else {
				System.out.println("비정상적인 입력 확인 후 종료");
			}
		}
		
		
		//MyDate nowDate1 = new MyDate(30,2,2000);
		//System.out.println(nowDate1.isValid());
		//MyDate nowDate2 =new MyDate(2,10,2006);
		//System.out.println(nowDate2.isValid());

	}

}
