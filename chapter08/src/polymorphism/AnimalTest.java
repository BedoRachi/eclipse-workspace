package polymorphism;

import java.util.ArrayList;

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

	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal { // ���
	@Override
	public void move() { // move �޼ҵ� ������
		System.out.print("ȣ����");
		System.out.println(move); // �θ� Ŭ������ ���� ���
	}

	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal { // ���
	@Override
	public void move() { // move �޼ҵ� ������
		System.out.print("������");
		System.out.println(move); // �θ� Ŭ������ ���� ���
	}

	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public void addAnimal() {
		aniList.add(new Human()); // ��ĳ����
		aniList.add(new Tiger()); // ��ĳ����
		aniList.add(new Eagle()); // ��ĳ����

		System.out.println("############################");
		System.out.println("���� Ŭ�����η� �� ĳ����");
		for (Animal ani : aniList) { // ��� �迭�� ��ü���� Animal������ �����ϸ� move�� ȣ���Ѵ�.
			ani.move();
			/*
			 * Error�߻�, Parent(Animal)���� ���ǵǾ� ���� ����(Child Class�� ���ǵǾ� ����) 
			 * ani.readBool();
			 * ani.hunting(); 
			 * ani.flying();
			 */ }
	}

	public void testCasting() {
		for (int i = 0; i < aniList.size(); i++) { //��� �迭�� ȣ��
			Animal ani = aniList.get(i); // ��� �迭�� ��ü���� Animal������ ����
			if (ani instanceof Human) { // ��ĳ������ ���� Ŭ������ Human ���� �˻�
				Human h = (Human) ani; //�ٿ� ĳ����
				h.readBook();
			} else if (ani instanceof Tiger) {  // ��ĳ������ ���� Ŭ������ Tiger ���� �˻�
				Tiger t = (Tiger) ani; // �ٿ�ĳ����
				t.hunting();
			} else if (ani instanceof Eagle) {  // ��ĳ������ ���� Ŭ������ Eagle ���� �˻�
				Eagle e = (Eagle) ani; //���� ĳ����
				e.flying();
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();

		System.out.println("############################");
		System.out.println("���� ������ �ٿ� ĳ����");
		aTest.testCasting();

	}

}
