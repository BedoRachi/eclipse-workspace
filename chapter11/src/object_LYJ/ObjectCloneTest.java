package object_LYJ;

class Point {
	int x,y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() { //toString Override
		// getClass().getName() + '@' + Integer.toHexString(hashCode()) -> "x = " + x + " , "+"y = " + y;
		return "x = " + x + " , "+"y = " + y;
	}
}

class Circle implements Cloneable{ //���Ȼ� clone�� ����ϱ� ���ؼ��� Cloneable�� �ʿ���
	Point point;
	int radius;
	int []arr = {10,20,30};//���� ���� �׽�Ʈ��
	
	Circle(int x, int y, int radius){
		System.out.println("Constructor ����");
		this.radius = radius;
		point = new Point(x,y);
	}
	
	@Override
	public String toString() { //toString Override
		return "���� = " +  point + " , ������ = " + radius;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{ //Object.clone�� ������ �����ΰ� ���� ������ Override�� �������
		//CloneNotSupportedException= Cloneable�� ��� �� �����Ǿ������� �˻���
		return super.clone(); //Object�� clone�� Protected�� �Ǿ� �־� ��� �� super�θ� ������ �����ϴ�.
	}
}


public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10,20,30); //���� ��ü ����
		Circle copyCircle = (Circle)circle.clone(); //circle.clone()�� �� ��� Circle -> Object�� ��ĳ���� �ʰ� ���ÿ� circle ��ü�� ������ 
		                                            //(Circle)�� ����Ͽ� ����ȯ(�ٿ�ĳ����)�Ͽ� coptCircle�� circle ��ü�� ����
		System.out.println("clone �׽�Ʈ");
		System.out.println("circle: " + circle); //��ü �����̱� ������ ���� ���� ����
		System.out.println("copyCircle: " + copyCircle); //��ü �����̱� ������ ���� ���� ����
		System.out.println("System.identityHashCode(circle): "+ System.identityHashCode(circle)); //��ü �����̱� ������ �ٸ� �ּҰ��� ����(���� �ٸ� �޸� �Ҵ�)
		System.out.println("System.identityHashCode(copyCircle): "+ System.identityHashCode(copyCircle)); //��ü �����̱� ������ �ٸ� �ּҰ��� ����(���� �ٸ� �޸� �Ҵ�)
		
		System.out.println("���� ���� �׽�Ʈ");
		System.out.println("circle.arr[0]: " + circle.arr[0]);
		System.out.println("copyCircle.arr[0]: " + copyCircle.arr[0]);
		circle.arr[0] = 20;
		copyCircle.arr[0] =200;
		System.out.println("circle.arr[0]: " + circle.arr[0]);
		System.out.println("copyCircle.arr[0]: " + copyCircle.arr[0]);
		

	
	}

}



