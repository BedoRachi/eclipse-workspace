package coperation;

public class Student {

	public String studentName;
	public int grade;
	public int money;
	public int busCount;
	public int subCount;
	public int taxiCount;

	public Student(String name, int grade, int money) {

		this.studentName = name;
		this.grade = grade;
		this.money = money;
		this.busCount=0;
		this.subCount=0;

	}

	public void takeBus(Bus bus) {
		if (grade == 1) {
			bus.takeBus(1000);
			this.money -= 1000;
			this.busCount++;
		}
		else if(grade == 2) {
			bus.takeBus(2000);
			this.money -= 2000;
			this.busCount++;
		}
		else if(grade == 3) {
			bus.takeBus(3000);
			this.money -= 3000;
			this.busCount++;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
			
	}

	public void takeSub(Subway sub) {
		if (grade == 1) {
			sub.takeSubway(1500);
			this.money -= 1500;
			this.subCount++;
		}
		else if (grade == 2) {
			sub.takeSubway(2000);
			this.money -= 2000;
			this.subCount++;
		}
		else if (grade == 3) {
			sub.takeSubway(2500);
			this.money -= 2500;
			this.subCount++;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public void takeTaxi(Taxi taxi) {
		if (grade == 1) {
			taxi.takeTaxi(5000);
			this.money -= 5000;
			this.taxiCount++;
		}
		else if (grade == 2) {
			taxi.takeTaxi(6000);
			this.money -= 6000;
			this.taxiCount++;
		}
		else if (grade == 3) {
			taxi.takeTaxi(7000);
			this.money -= 7000;
			this.taxiCount++;
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	public void showStuInfo() {
		System.out.println("학생이름: " + studentName + ", 학생 학년: " + grade + ", 학생 남은 돈: " + money + ", 지하철 탑승 횟수: "+ subCount + ", 버스 탑승 횟수: " + busCount +", 택시 탑승 횟수: " + taxiCount);

	}
}
