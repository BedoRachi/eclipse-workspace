package inheritance5;

class A {

	public A() {
		super(); // 상위 클래스 or Parent Class or Super Class를 호출시 사용(기본적으로 생략된다.)
		System.out.println("생성자 A");
	}

	public A(int x) { // 매개변수가 있는 생성자
		System.out.println("매개변수 생성자 A");
	}
	
	public A(int x, int y){
		System.out.println("매개변수 생성자 A-2");
	}
}

class B extends A {

	public B() {
		super();
		System.out.println("생성자 B");
	}

	public B(int x) {
		super(10, 20);// Super Class에서 매개변수가 있는 Contructor를 Load한다.
		System.out.println("매개변수 생성자 B");
	}
}

class C extends B {

	public C() {

		System.out.println("생성자 C");
	}

	public C(int x) {
		super(x);
		System.out.println("매개변수 생성자 C");
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c = new C(5);

	}

}
