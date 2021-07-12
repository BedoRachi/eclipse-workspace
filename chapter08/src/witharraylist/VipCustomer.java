package witharraylist;

public class VipCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	
	public VipCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer 생성자 호출");
	}
	
	public VipCustomer(int id, String name, int agent) {
		super(id, name); //Customer Class에서 고객 생성부를 가져옴
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agent;
		System.out.println("VIPCustomer(int,String,int) 생성자 호출");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * saleRatio);
	}
	@Override
	public void showCustomerInfo() {
		System.out.println("이름: " + this.customerName);
		System.out.println("번호: " + this.customerID);
		System.out.println("등급: " + this.customerGrade);
		System.out.println("포인트: " + this.bonusPoint);
		System.out.println("담당자: " + this.getAgentID());
	}
	
	public int getAgentID() {
		return agentID;
	}

	/**
	 * @param agentID the agentID to set
	 */
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
}
