package generics_LYJ;

public class Powder extends Meterial{
	public void doPrinting() {
		System.out.println("Powder");
	}

	@Override
	public String toString() {
		return "재료는 Powder입니다";

	}

}
