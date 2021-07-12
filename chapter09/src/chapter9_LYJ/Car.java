package chapter9_LYJ;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	public void washCar() {
		System.out.println("세차합니다.");
	}
	
	final public void run() { //Tamplete 메소드
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}

}

