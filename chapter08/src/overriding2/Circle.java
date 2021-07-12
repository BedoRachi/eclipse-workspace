package overriding2;

class Shape1 {
	protected String name;

	public void paint() {
		draw();
	}

	public void draw() {
		System.out.println("Shape");
	}
}

public class Circle extends Shape1 {
	
	@Override //Anotation�� ������ �ּ��� ���ҵ� ������ Method Override�� ���� �˻�(�Ǽ�����)�� �Ѵ�.
	public void draw() {
		System.out.println("Circle");
	}
	
	public static void main(String[] args) {

		Shape1 a = new Circle(); // Upcasting
		Shape1 b = new Shape1(); 
		a.paint(); //overriding�� draw�� ���
		b.paint(); // ���� draw�� ���
		
	}

}