package inheritance;

public class ColorPointEx {
//상속관계 테스트
	public static void main(String[] args) {
		
		Point p = new Point (); //Point Class 호출
		p.set(1, 2);
		p.x1=10; //public 접근제어자는 호출 가능
		p.y1=20; //default 접근제어자는 호출 가능
		p.x1=30; //proteced 접근제어자는 호출 가능
		p.showPoint();
		
		ColerPoint cp = new ColerPoint(); // ColerPoint Class 호출 
		cp.set(30, 30); // Point -> ColerPoint로 상속하였기 때문에 호출 가능
		cp.setColor("red");
		cp.showColorPoint();
		cp.x1=20; //public 접근제어자는 호출 가능
		cp.y1=30; //default 접근제어자는 호출 가능
		cp.z1=40; //proteced 접근제어자는 호출 가능
	}
}
