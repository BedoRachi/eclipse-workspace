package chapter07_Q;

public class Q4_Array_Dog {
	private String name;
	private String type;
	
	public Q4_Array_Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String showDogInfo() {
		return name + ", " + type;
	}
}
