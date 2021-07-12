package witharraylist;

public class Customer {

	protected int customerID; //고객ID
	protected String customerName; //고객 이름
	protected String customerGrade; // 고객 등급
	protected double bonusPoint; //고객 포인트
	protected double bonusRatio; // 고객 할인율

	public Customer() { 

		this.customerGrade = "SILVER";
		this.bonusPoint = 0.01;
		System.out.println("Customer 생성자 호출");
	}
	
	public Customer(int id, String name) { //고객 생성부

		this.customerID = id;
		this.customerName = name;
		this.customerGrade = "SILVER";
		this.bonusPoint = 0.01;
		System.out.println("Customer(int,String) 생성자 호출");
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		return price;
	}
	public void showCustomerInfo() {
		System.out.println("이름: " + this.customerName);
		System.out.println("번호: " + this.customerID);
		System.out.println("등급: " + this.customerGrade);
		System.out.println("포인트: " + this.bonusPoint);
	}

}
