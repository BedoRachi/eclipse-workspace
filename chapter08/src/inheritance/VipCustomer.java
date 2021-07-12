package inheritance;

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
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agent;
		System.out.println("VIPCustomer(int,String,int) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
