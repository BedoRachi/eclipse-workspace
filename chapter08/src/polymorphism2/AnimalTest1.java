package polymorphism2;

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
		System.out.println(move); // 자식 클래스(Human)의 변수 사용
	}
}

class Tiger extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("호랑이");
		System.out.println(move); // 부모 클래스(Animal)의 변수 사용
	}
}

class Eagle extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("독수리");
		System.out.println(move); // 부모 클래스(Animal)의 변수 사용
	}
}

public class AnimalTest1 {

/* Upcasting Before(업캐스팅 전)
	public void moveAnimal(Animal animal) { // Animal animal = new Animal();
		animal.move();
	}

	public void moveAnimal1(Human h) { // Human h = new Human();
		h.move();
	}

	public void moveAnimal2(Tiger t) { // Tiger t = new Tiger();
		t.move();
	}

	public void moveAnimal3(Eagle e) { // Eagle e = new Eagle();
		e.move();
	}
*/
	
// Upcasting After(업캐스팅 후)	
	public void moveAnimal(Animal animal) {
		animal.move(); //동적 바인딩에 의해 각 Child Class의 Override된 Method가 실행됨
	}
	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		
/* Upcasting Before(업캐스팅 전)
		aTest.moveAnimal(new Animal());
		aTest.moveAnimal1(new Human());
		aTest.moveAnimal2(new Tiger());
		aTest.moveAnimal3(new Eagle());
*/
		
// Upcasting After(업캐스팅 후)	
		aTest.moveAnimal(new Animal());
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		
	}

}
