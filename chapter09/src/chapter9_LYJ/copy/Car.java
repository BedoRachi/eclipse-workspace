package chapter9_LYJ.copy;

public abstract class Car {
	public abstract void start(String name);
	public abstract void drive(String name);
	public abstract void stop(String name);
	public abstract void turnoff(String name);
	public abstract void washCar();
	
	final public void run(String carname) { //Tamplete ?޼ҵ?
		start(carname);
		drive(carname);
		stop(carname);
		turnoff(carname);
		washCar();
	}

}

