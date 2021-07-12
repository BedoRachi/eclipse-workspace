package thisex;

public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setBirthday(int year) {
		this.year = year;
	}
	
	public void getBirthday() {
		System.out.println(this); // this를 통해 객체 그 자체를 출력함
	}
	
	
	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setBirthday(2000);
		System.out.println(bDay); //bDay 객체의 값을 출력함
		bDay.getBirthday();//bDay 객체의 값을 출력함
		
	}
	
}
