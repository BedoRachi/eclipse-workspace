package inheritance5;

class A {

	public A() {
		super(); // ���� Ŭ���� or Parent Class or Super Class�� ȣ��� ���(�⺻������ �����ȴ�.)
		System.out.println("������ A");
	}

	public A(int x) { // �Ű������� �ִ� ������
		System.out.println("�Ű����� ������ A");
	}
	
	public A(int x, int y){
		System.out.println("�Ű����� ������ A-2");
	}
}

class B extends A {

	public B() {
		super();
		System.out.println("������ B");
	}

	public B(int x) {
		super(10, 20);// Super Class���� �Ű������� �ִ� Contructor�� Load�Ѵ�.
		System.out.println("�Ű����� ������ B");
	}
}

class C extends B {

	public C() {

		System.out.println("������ C");
	}

	public C(int x) {
		super(x);
		System.out.println("�Ű����� ������ C");
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		C c = new C(5);

	}

}
