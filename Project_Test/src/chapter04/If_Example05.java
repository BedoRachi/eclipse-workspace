package chapter04;

public class If_Example05 {

	public static void main(String[] args) {
		int age = 2;
		int charge;
		if(age <8) {
			charge = 1000;
		}
		if(age <14){
			charge = 2000;
		}
		if(age <20){
			charge = 4000;
		}
		else {
			charge = 8000;
		}
		System.out.println("입장료는 " + charge + "원 입니다.");
	}

}

