package chapter11_LYJ;

class MyDog{
	String name, type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + " " + name; 
	}
}

public class Q4_LYJ {
	
	public static void main(String[] args) {
		MyDog dog = new MyDog("∏€∏€¿Ã", "¡¯µæ∞≥");
		System.out.println(dog);
	}
	
}
