package chapter06_Q5;

public class Cafe {

	int customerCount = 0;
	int money;
	String name;

	public Cafe(String name) {
		this.name = name;
	}

	public void amricano(int money) {
		this.money += money;
		this.customerCount++;
	}

	public void ratte(int money) {
		this.money += money;
		this.customerCount++;
	}

	public void showCafeInfo() {
		System.out.println("ī���: " + name + " ����: " + money + " �մ� �� : " + customerCount);
	}

}
