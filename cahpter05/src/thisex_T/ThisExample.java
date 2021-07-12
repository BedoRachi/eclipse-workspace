package thisex_T;

class BirthDay{//한개 파일에 여러개의 Class가 생성하기 위해서는 주 Class 제외하고는 public를 사용할 수 없다.
	
	int day;
	int month;
	int year;
	
	public void setBirthday(int year) {
		this.year = year;
	}
	
	public void getBirthday() {
		System.out.println(this); // this를 통해 객체 그 자체를 출력함
	}
}


public class ThisExample { // 주 Class이기 때문에 파일명과 동일한 Class 명 + Public 사용한다.

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setBirthday(2000);
		System.out.println(bDay); //bDay 객체의 값을 출력함
		bDay.getBirthday();//bDay 객체의 값을 출력함
		
		
	}

}
