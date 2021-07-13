package interfaceex;

//public class myInterfaceTest implements X,Y,myInterface{
	//interface 다중 상속받음(interface -> Class 상속시엔 implements 사용)
public class myInterfaceTest implements myInterface{	
	//interface 단일 상속받음(X,Y -> (extends) -> myInterface -> (Implements) -> myInterfaceTest
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
