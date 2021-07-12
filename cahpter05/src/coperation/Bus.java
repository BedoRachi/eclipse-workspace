package coperation;

public class Bus {

	int busNum;
	int passengerCount;
	int money;

	public Bus(int busNum) {
		this.busNum = busNum;
		passengerCount=0;
	}

	public void takeBus(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println("버스번호: " + busNum + ", 버스 수입: " + money + ", 버스 승객 수: " + passengerCount);
	}

}
