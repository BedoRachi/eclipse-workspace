package interfaceex_LYJ;

public interface Calc {
	// 변수->상수로 자동 변환
	double PI = 3.14;
	int ERROR = 999999999;

	// 일반 메소드 -> 추상 메소드로 자동 변환
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);

	// 디폴트 메소드(default method) :interface구현 하여 추가적인 재정의 없이 사용가능하게 함
	default void description() {
		System.out.println("정수 계산기 입니다.");
		myMethod(); //private 메소드
	}

	// 정적 메소드(Static Method) :Class 호출이 없더라도 사용 가능함
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		myStaticMethod(); //private static 메소드
		return total;

	}
	//private 메소드 : 재정의 불가하게 함
	private void myMethod() {
		System.out.println("private 메소드");
	}

	//static 메소드에서 private 메소드를 호출하기 위해선 static이 필요
	private static void myStaticMethod() {
		System.out.println("private Static 메소드");
	}

}
