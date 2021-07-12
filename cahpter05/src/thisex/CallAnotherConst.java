package thisex;
// this를 통한 생성자 or 메소드 호출
class Person {
	String name;
	int age;

	Person() { // 기본 생성자
		this("이름없음", 1); // 기본생성자를 실행하면 this를 통해 2번 생성자가 호출됨
	}

	Person(String name, int age) { //2번 생성자
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() { // Person 클래스형으로 반환
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName = new Person(); //기본 생성자 호출

		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName); //noName의 주소값 출력
		
		Person p = noName.returnItSelf();
		System.out.println(p); // p의 주소값 출력

	}

}
