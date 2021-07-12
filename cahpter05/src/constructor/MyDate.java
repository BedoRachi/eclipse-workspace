package constructor;

public class MyDate {

	private int day, month, year;
	private boolean valid;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDay(int d) {
		day = d;
	}

	public void setMonth(int m) {
		month = m;
	}

	public void setYear(int y) {
		year = y;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public boolean isValid() {

		if (year > 1800) {
			if (month > 0 && month < 13) {
				if (month == 2 && day < 29 && day > 0) {
					System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
					return true;
				} else if (month != 2 && day > 0 && day < 32) {
					System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
					return true;
				} else if (month == 2 && day > 28) {
					System.out.println("잘못된 일자를 입력하셨습니다. 2월은 29보다 작은 값을 넣으세요 입니다.");
					return false;
				} else {
					System.out.println("잘못된 일자를 입력하셨습니다. 0보다 크고 32보다 작은 값을 넣으세요 입니다.");
					return false;
				}

			} else {
				System.out.println("잘못된 연도를 입력하셨습니다. 0보다 크고 13보다 작은 값을 넣으세요");
				return false;
			}

		} else {
			System.out.println("잘못된 연도를 입력하셨습니다. 1800보다 큰 값을 넣으세요");
			return false;
		}

	}

}
