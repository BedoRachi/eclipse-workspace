package instanceofex;

class Person{}
class Student extends Person{}
class Resercher extends Person{}
class Professor extends Resercher{}

public class InstanceOfEx {

	static void print(Person p) { // 입력 받은 객체를 업캐스팅
		if (p instanceof Person) { // 객체의 원래 클래스를 검사(Person)
			System.out.print("Person ");
		}
		if (p instanceof Student) { // 객체의 원래 클래스를 검사(Student)
			System.out.print("Student ");
		}
		if (p instanceof Resercher) { // 객체의 원래 클래스를 검사(Resercher)
			System.out.print("Resercher ");
		}
		if (p instanceof Professor) { // 객체의 원래 클래스를 검사(Professor)
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
