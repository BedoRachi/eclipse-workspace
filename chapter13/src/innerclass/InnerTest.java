package innerclass;

class OutClass{ //외부 클래스
	private int num = 10; //외부 클래스 변수
	private static int sNum = 20; // 외부 정적 변수
	public InClass inClass; //내부 클래스 선언(외부 클래스를 통해 내부 클래스 접근을 위해 필요함)
	
	public OutClass() { //생성자 
		inClass = new InClass(); //외부 클래스 생성 시 내부 클래스도 같이 생성됨
	}
	
	static class InStaticClass{//정적 내부 클래스
		private int inNum = 100;
		private static int sInNum = 200;
		
		void inTest() {
			//System.out.println("OutClass num: " + num); //Error 발생, 정적 내부 클래스에서 외부 클래스 변수 사용 불가
			System.out.println("OutClass sNum: " + sNum); // 내부 클래스에서 외부 정적 변수 호출
			System.out.println("StaticInClass inNum: " + inNum); // 내부 클래스에서 내부 클래스 변수 호출
			System.out.println("StaticInClass sInNum: " + sInNum); // 내부 클래스에서 내부 정적 변수 호출
			//InClass ic = new InClass(); //Error 발생, 정적 내부 클래스에서 일반 내부 클래스 호출 불가
	
		}
	}
	
	class InClass{//내부 클래스
		private int inNum = 100; //내부 클래스 변수
		//static int sInNum = 200; //Error 발생, 일반 내부 클래스에서 정적 변수 사용불가
		
		void inTest() { //내부 메소드
			System.out.println("OutClass num: " + num); //내부 클래스에서 외부 클래스 변수 호출(같은 클래스 내부 이기 때문에 Private라도 가능)
			System.out.println("OutClass sNum: " + sNum); // 내부 클래스에서 외부 정적 변수 호출
			System.out.println("InClass inNum: " + inNum); // 내부 클래스에서 내부 클래스 변수 호출
			
			InStaticClass isc = new InStaticClass();
			System.out.println("StaticInClass inNum: " + isc.inNum); // 내부 클래스에서 정적 내부 클래스의 클래스 변수 호출
			System.out.println("StaticInClass sInNum: " + isc.sInNum); // 내부 클래스에서 정적 내부 클래스의 정적 변수 호출
			

		}
		
		public void usingClass() {
			inClass.inTest(); //내부 클래스의 메소드 호출
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("내부클래스 호출");
		outClass.inClass.usingClass(); //외부클래스.내부클래스.내부메소드 호출(단 외부 클래스에서 내부 클래스를 private로 선언 시 사용불가)
		System.out.println("정적 내부클래스 호출");
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass(); //static Class이기 때문에 외부클래스에서 바로 호출 가능
		sInClass.inTest();
		
	}
}
