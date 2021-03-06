package interfaceex_LYJ;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스 구현합니다.");
	}

	@Override
	public int square(int num) {
		return num * num;
	}

	@Override
	public void description() { //디폴트 메소드 재정의
		// TODO Auto-generated method stub
		super.description();
	}
	

}
