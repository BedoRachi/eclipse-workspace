package generics_LYJ;

public class GenericPrintTest {
	public static void main(String[] args) {
		//Generic Class Test
		System.out.println("Generic Class Test");
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Generic자료형에 Powder로 선언(업캐스팅)
		powderPrinter.setMaterial(new Powder());// Powder Class 생성
		Powder powder =  powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		
		//Generic Class Test
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic =  plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println();
		
		
		//Generic Class Extends Test
		System.out.println("Generic Class Extends Test");
		GenericPrinter<Powder> powderPrinterMeterial = new GenericPrinter<Powder>();
		powderPrinterMeterial.setMaterial(new Powder());
		powderPrinterMeterial.printing();
		System.out.println();
		
		//Error 발생, Water는 Meterial을 상속 받지 않았기 때문에 GenericPrinter에 접근할 수 없다.
		//GenericPrinter<Water> waterPrinterMeterial = new GenericPrinter<Water>(); 
		//waterPrinterMeterial.setMaterial(new Water());
		//waterPrinterMeterial.printing();
		
		//Generic 자료형 생략 테스트
		System.out.println("Generic 자료형 생략 테스트");
		GenericPrinter plasticPrinterTest = new GenericPrinter(); //자료형 생략
		plasticPrinterTest.setMaterial(new Plastic());
		Plastic plasticTest =  (Plastic)plasticPrinterTest.getMaterial();//형변환을 통해 해결
		System.out.println(plasticPrinterTest);
	}

}
