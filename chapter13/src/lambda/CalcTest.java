package lambda;

public class CalcTest {
	public static void main(String[] args) {
		Calc calc = (x,y) -> x+y;
		System.out.println(calc.add(10, 20));
	}
	
}
