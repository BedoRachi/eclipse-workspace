package interfaceex;

//public class myInterfaceTest implements X,Y,myInterface{
	//interface ���� ��ӹ���(interface -> Class ��ӽÿ� implements ���)
public class myInterfaceTest implements myInterface{	
	//interface ���� ��ӹ���(X,Y -> (extends) -> myInterface -> (Implements) -> myInterfaceTest
	@Override
	public void MyMethod() {
		System.out.println("mymethod");
		
	}

	@Override
	public void y() {
		System.out.println("y");
		
	}

	@Override
	public void x() {
		System.out.println("x");
		
	}

}
