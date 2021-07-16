package interfaceex;

public class CalcuratorTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		int num1 = 20;
		int num2 = 10;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		CompleteCalc calc2 = (CompleteCalc)calc;
		calc2.showInfo();

	}
}
