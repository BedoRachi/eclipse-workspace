package chapter9_LYJ.copy;

public class Avante extends Car {

	@Override
	public void start(String name) {
		System.out.println(name + " 시동을 켭니다.");
		
	}

	@Override
	public void drive(String name) {
		System.out.println(name + " 달립니다.");
		
	}

	@Override
	public void stop(String name) {
		System.out.println(name + " 멈춥니다.");
		
	}

	@Override
	public void turnoff(String name) {
		System.out.println(name + " 시동을 끕니다.");
		
	}
	@Override
	public void washCar() {
		System.out.println("세차를 합니다.");
		
	}

}
