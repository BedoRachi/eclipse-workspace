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

class Circle implements Cloneable{ //보안상 clone을 사용하기 위해서는 Cloneable이 필요함
	Point point;
	int radius;
	int []arr = {10,20,30};//얕은 복사 테스트용
	
	Circle(int x, int y, int radius){
		System.out.println("Constructor 실행");
		this.radius = radius;
		point = new Point(x,y);
	}
	
	@Override
	public String toString() { //toString Override
		return "원점 = " +  point + " , 반지름 = " + radius;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{ //Object.clone은 별도의 구현부가 없기 때문에 Override를 해줘야함
		//CloneNotSupportedException= Cloneable이 상속 및 구현되었는지를 검사함
		return super.clone(); //Object의 clone이 Protected로 되어 있어 상속 후 super로만 접근이 가능하다.
	}
}


public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10,20,30); //원본 객체 생성
		Circle copyCircle = (Circle)circle.clone(); //circle.clone()을 할 경우 Circle -> Object로 업캐스팅 됨과 동시에 circle 객체가 생성됨 
		                                            //(Circle)로 명시하여 형변환(다운캐스팅)하여 coptCircle에 circle 객체를 저장
		System.out.println("clone 테스트");
		System.out.println("circle: " + circle); //객체 복사이기 때문에 같은 값을 가짐
		System.out.println("copyCircle: " + copyCircle); //객체 복사이기 때문에 같은 값을 가짐
		System.out.println("System.identityHashCode(circle): "+ System.identityHashCode(circle)); //객체 복사이기 때문에 다른 주소값을 가짐(서로 다른 메모리 할당)
		System.out.println("System.identityHashCode(copyCircle): "+ System.identityHashCode(copyCircle)); //객체 복사이기 때문에 다른 주소값을 가짐(서로 다른 메모리 할당)
		
		System.out.println("얕은 복사 테스트");
		System.out.println("circle.arr[0]: " + circle.arr[0]);
		System.out.println("copyCircle.arr[0]: " + copyCircle.arr[0]);
		circle.arr[0] = 20;
		copyCircle.arr[0] =200;
		System.out.println("circle.arr[0]: " + circle.arr[0]);
		System.out.println("copyCircle.arr[0]: " + copyCircle.arr[0]);
		

	
	}

}



