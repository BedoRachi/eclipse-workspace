package instanceofex;

class Person{}
class Student extends Person{}
class Resercher extends Person{}
class Professor extends Resercher{}

public class InstanceOfEx {

	static void print(Person p) { // �Է� ���� ��ü�� ��ĳ����
		if (p instanceof Person) { // ��ü�� ���� Ŭ������ �˻�(Person)
			System.out.print("Person ");
		}
		if (p instanceof Student) { // ��ü�� ���� Ŭ������ �˻�(Student)
			System.out.print("Student ");
		}
		if (p instanceof Resercher) { // ��ü�� ���� Ŭ������ �˻�(Resercher)
			System.out.print("Resercher ");
		}
		if (p instanceof Professor) { // ��ü�� ���� Ŭ������ �˻�(Professor)
			System.out.print("Professor ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); print(new Student());
		System.out.print("new Resercher() -> \t"); print(new Resercher());
		System.out.print("new Professor() -> \t"); print(new Professor());
	}

}
