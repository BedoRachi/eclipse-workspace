package polymorphism3;

class Animal {

	public String move = " �����Դϴ�.";

	public void move() {
		System.out.print("������");
		System.out.println(move);
	}
}

class Human extends Animal { // ���
	public String move = " �ɾ�ϴ�."; // ���� ������

	@Override
	public void move() { // move �޼ҵ� ������
		System.out.print("�����");
		System.out.println(move); // �ڽ� Ŭ������ ���� ���
	}
}

class Tiger extends Animal { // ���
	@Override
	public void move() { // move �޼ҵ� ������
		System.out.print("ȣ����");
		System.out.println(move); // �θ� Ŭ������ ���� ���
	}
}

class Eagle extends Animal { // ���
	@Override
	public void move() { // move �޼ҵ� ������
		System.out.print("������");
		System.out.println(move); // �θ� Ŭ������ ���� ���
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
