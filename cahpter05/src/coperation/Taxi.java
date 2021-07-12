package coperation;

public class Taxi {

	int taxiNum;
	int taxiPassCount;
	int taxiMoney;

	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public void takeTaxi(int money) {
		this.taxiMoney += money;
		this.taxiPassCount++;
	}

	public void showTaxiInfo() {
		System.out.println("택시번호: " + taxiNum + ", 택시 수입: " + taxiMoney + ", 택시 승객 수: " + taxiPassCount);

	}

}
