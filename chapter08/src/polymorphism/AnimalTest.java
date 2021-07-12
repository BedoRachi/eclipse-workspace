package polymorphism;

import java.util.ArrayList;

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

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("호랑이");
		System.out.println(move); // 부모 클래스의 변수 사용
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal { // 상속
	@Override
	public void move() { // move 메소드 재정의
		System.out.print("독수리");
		System.out.println(move); // 부모 클래스의 변수 사용
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public void addAnimal() {
		aniList.add(new Human()); // 업캐스팅
		aniList.add(new Tiger()); // 업캐스팅
		aniList.add(new Eagle()); // 업캐스팅

		System.out.println("############################");
		System.out.println("상위 클래스로로 업 캐스팅");
		for (Animal ani : aniList) { // 모든 배열의 객체들을 Animal형으로 실행하며 move를 호출한다.
			ani.move();
			/*
			 * Error발생, Parent(Animal)에는 정의되어 있지 않음(Child Class에 정의되어 있음) 
			 * ani.readBool();
			 * ani.hunting(); 
			 * ani.flying();
			 */ }
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { //모든 배열을 호출
			Animal ani = aniList.get(i); // 모든 배열의 객체들을 Animal형으로 실행
			if (ani instanceof Human) { // 업캐스팅전 원본 클래스가 Human 인지 검사
				Human h = (Human) ani; //다운 캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) {  // 업캐스팅전 원본 클래스가 Tiger 인지 검사
				Tiger t = (Tiger) ani; // 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) {  // 업캐스팅전 원본 클래스가 Eagle 인지 검사
				Eagle e = (Eagle) ani; //다은 캐스팅
				e.flying();
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();

		System.out.println("############################");
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();

	}

}
