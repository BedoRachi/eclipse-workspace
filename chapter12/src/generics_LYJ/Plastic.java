package generics_LYJ;

public class Plastic extends Meterial {
	
	public void doPrinting() {
		System.out.println("Plastic doPrinting");
	}

	@Override
	public String toString() {
		return "재료는 Plastic입니다";

	}

}
