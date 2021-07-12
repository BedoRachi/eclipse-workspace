package polymorphism3;

class Animal {

	public String move = " 움직입니다.";

	public void move() {
		System.out.print("동물이");
		System.out.println(move);
	}
}

class Human extends Animal { // 상속
	public String move = " 걸어갑니다."; // 변수 재정의

	@Override
	public void move() { // move 메소드 재정의
		System.out.print("사람이");
		System.out.println(move); // 자식 클래스의 변수 사용
	}
}

class Tiger extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("호랑이");
		System.out.println(move); // 부모 클래스의 변수 사용
	}
}

class Eagle extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("독수리");
		System.out.println(move); // 부모 클래스의 변수 사용
	}
}

public class AnimalTest1 {

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();

		aTest.moveAnimal(new Animal());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

}
