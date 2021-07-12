package q;

import p.A;

public class B extends A {
	
	void set() {
		pub =1; // Public은 내부, 외부 Package 상관없이 사용가능
		pro =2; // protected는 내부 Package는 상속 없이 사용 가능, 외부 Package는 상속시에만 사용가능
		//def =3; Error 발생, Default는 내부 Package에서만 사용 가능(외부 Package 불가)
		//pri =4; Error 발생, Private은 외부 클래스에서 사용 불가 
	}

}
