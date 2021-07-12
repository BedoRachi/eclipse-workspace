package abstractEx;

public abstract class Computer { //추상 클래스

	abstract public void display(); // 추상메소드 (선언O/구현X)
	public abstract void typing(); // 추상메소드 (선언O/구현X)
	public void turnOn() {// 일반메소드(선언O/구현O)
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {// 일반메소드(선언O/구현O)
		System.out.println("전원을 끕니다.");
	}
}
