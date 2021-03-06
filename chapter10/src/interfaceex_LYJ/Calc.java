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

	// 디폴트 메소드(default method)
	default void description() {
		System.out.println("정수 계산기 입니다.");
		//myMethod(); Error 발생, Java 8버전 이하에선 private 메소드 사용불가
	}

	// 정적 메소드(Static Method)
	static int total(int[] arr) {
		int total = 0;
		for (int i : arr) {
			total += i;
		}
		//myStaticMethod(); Error 발생, Java 8버전 이하에선 private 메소드 사용불가
		return total;

	}
	
	/* Error 발생, Java 8버전 이하에선 private 메소드 사용불가
	 * private void myMethod() { 
	 * System.out.println("private 메소드"); 
	 * } 
	 * private static void myStaticMethod() { 
	 * System.out.println("private Static 메소드"); 
	 * }
	 */
	}
