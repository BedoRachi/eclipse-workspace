package hiding;

public class This_Circle {
	int radius;

	public This_Circle(int radius) {
		this.radius = radius; // this가 있기 때문에 같은 이름의 인자(지역변수)와 변수(멤버변수)가 따라 인식 된다.(변수와 인자가 서로 다르게 인식되어 변수에 인자를 넣는다.)
	}

	public void set(int radius) {
		radius = radius; // this가 없기 때문에 같은 이름의 인자와 변수가 따로 인식되지 않는다(=전부 인자로 인식되어 변수에 덮어쓰지 않는다)
	}
	
	public void set2(int r) {
		radius = r;//변수(멤버변수)와 인자(지역변수)의 이름이 다르기 때문에 this없이 인식이 된다.
	}

	public static void main(String[] args) {
		
		This_Circle ob1 = new This_Circle(1);
		This_Circle ob2 = new This_Circle(2);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);
		
		ob1.set(3);
		ob2.set(4);
		
		System.out.println(ob1.radius);
		System.out.println(ob2.radius);

	}

}
