package generics_LYJ;

public class GenericPrintTest {
	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Generic자료형에 Powder로 선언(업캐스팅)
		powderPrinter.setMaterial(new Powder());// Powder Class 생성
		Powder powder =  powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic =  plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
	}

}
