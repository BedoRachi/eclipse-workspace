package inheritance4;

class A {

	public A() {
		super(); //상위 클래스 or Parent Class or Super Class를 호출시 사용(기본적으로 생략된다.)
		System.out.println("생성자 A");
	}
}

class B extends A {

	public B() {
		super(); 
		System.out.println("생성자 B");
	}
}

class C extends B {

	public C() {
		super(); 
		System.out.println("생성자 C");
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c = new C();

	}

}
