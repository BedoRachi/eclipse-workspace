package interfaceex_LYJ;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num2));

		calc.showInfo(); //자식 클래스의 메소드를 호출
		calc.description(); //디폴트 메소드 호출 (calc에서 정의->CompleteCalc에서 호출)
		int[] array = {1,2,3,4,5};
		System.out.println(Calc.total(array)); // 정적 메소드 호출(Calc Interface의 정의 없이 Method를 바로 사용 = interface명.static메소드)
	}
}
