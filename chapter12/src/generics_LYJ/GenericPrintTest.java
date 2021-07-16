package generics_LYJ;

public class GenericPrintTest {
	public static void main(String[] args) {
		//Generic Class Test
		System.out.println("Generic Class Test");
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>(); //Generic�ڷ����� Powder�� ����(��ĳ����)
		powderPrinter.setMaterial(new Powder());// Powder Class ����
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
		
		//Error �߻�, Water�� Meterial�� ��� ���� �ʾұ� ������ GenericPrinter�� ������ �� ����.
		//GenericPrinter<Water> waterPrinterMeterial = new GenericPrinter<Water>(); 
		//waterPrinterMeterial.setMaterial(new Water());
		//waterPrinterMeterial.printing();
		
		//Generic �ڷ��� ���� �׽�Ʈ
		System.out.println("Generic �ڷ��� ���� �׽�Ʈ");
		GenericPrinter plasticPrinterTest = new GenericPrinter(); //�ڷ��� ����
		plasticPrinterTest.setMaterial(new Plastic());
		Plastic plasticTest =  (Plastic)plasticPrinterTest.getMaterial();//����ȯ�� ���� �ذ�
		System.out.println(plasticPrinterTest);
	}

}
