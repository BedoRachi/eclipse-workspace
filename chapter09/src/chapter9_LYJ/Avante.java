package chapter9_LYJ;

public class Avante extends Car {

	private String name = "Avante";
	
	@Override
	public void start() {
		System.out.println(name + " �õ��� �մϴ�.");
		
	}

	@Override
	public void drive() {
		System.out.println(name + " �޸��ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println(name + " ����ϴ�.");
		
	}

	@Override
	public void turnoff() {
		System.out.println(name + " �õ��� ���ϴ�.");
		
	}
}
