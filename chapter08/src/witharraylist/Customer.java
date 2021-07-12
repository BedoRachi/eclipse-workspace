package witharraylist;

public class Customer {

	protected int customerID; //��ID
	protected String customerName; //�� �̸�
	protected String customerGrade; // �� ���
	protected double bonusPoint; //�� ����Ʈ
	protected double bonusRatio; // �� ������

	public Customer() { 

		this.customerGrade = "SILVER";
		this.bonusPoint = 0.01;
		System.out.println("Customer ������ ȣ��");
	}
	
	public Customer(int id, String name) { //�� ������

		this.customerID = id;
		this.customerName = name;
		this.customerGrade = "SILVER";
		this.bonusPoint = 0.01;
		System.out.println("Customer(int,String) ������ ȣ��");
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
		System.out.println("�̸�: " + this.customerName);
		System.out.println("��ȣ: " + this.customerID);
		System.out.println("���: " + this.customerGrade);
		System.out.println("����Ʈ: " + this.bonusPoint);
	}

}
