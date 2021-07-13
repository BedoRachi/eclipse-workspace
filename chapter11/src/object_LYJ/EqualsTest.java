package object_LYJ;

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() { // toString 재정의(hash값 출력 -> id,name 출력)
		return id + ", " + name;
	}

	@Override
	public boolean equals(Object obj) {// equals 재정의(주소값만 검사 -> id 검사)
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.id == std.id) {
				return true;
			} else {
				return false;
			}
		} else
			return false;
	}
	public int hashCode() { //hashCode 재정의(주소값 -> id 출력)
		return id;
	}

}

public class EqualsTest {
	public static void main(String[] args) {
		Student Lee = new Student(100, "이상원"); // 객체 생성
		Student Lee2 = Lee; // 주소값 복사
		Student Sang = new Student(100, "이상원"); // 객체 생성

		if (Lee == Lee2) {// 주소값 비교
			System.out.println(Lee + ", " + Lee2 + " 둘의 주소값은 같다"); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)(hash값
																	// 출력 ->id,name 출력)
		} else {
			System.out.println(Lee + ", " + Lee2 + " 둘의 주소값은 다르다."); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		}
		if (Lee == Sang) {// 주소값 비교
			System.out.println(Lee + ", " + Sang + " 둘의 주소값은 같다"); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		} else {
			System.out.println(Lee + ", " + Sang + " 둘의 주소값은 다르다."); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		}
		if (Lee.equals(Lee2)) { // 재정의된 equals로 비교(true -> true)
			System.out.println(Lee + ", " + Lee2 + " 둘의 값은 같다"); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		} else {
			System.out.println(Lee + ", " + Lee2 + " 둘의 값은 다르다."); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		}
		if (Lee.equals(Sang)) { // 재정의된 equals로 비교(false -> true)
			System.out.println(Lee + ", " + Sang + " 둘의 값은 같다"); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		} else {
			System.out.println(Lee + ", " + Sang + " 둘의 값은 다르다."); // 재정의된 toString으로 출력됨(hash값 출력 ->id,name 출력)
		}
		
		System.out.println("Lee hash Code: "+System.identityHashCode(Lee)+"의 ID는 "+ Lee.hashCode()); //재정의된 hashCode로 출력됨(주소값 -> id 출력)
		System.out.println("Lee2 hash Code: "+System.identityHashCode(Lee2)+"의 ID는 "+ Lee2.hashCode()); //재정의된 hashCode로 출력됨(주소값 -> id 출력)
		System.out.println("Sang hash Code: "+System.identityHashCode(Sang)+"의 ID는 "+ Sang.hashCode()); //재정의된 hashCode로 출력됨(주소값 -> id 출력)

	}

}
