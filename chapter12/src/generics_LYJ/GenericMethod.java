package generics_LYJ;

public class GenericMethod {//일반 클래스에서도 Generic 메소드를 가질수 있음, 단 Generic 메소드에서 Generic 변수를 선언해줘야함<T,V>

	public static <T, V> double makeRectangle(Point<T,V>p1, Point<T,V>p2) {
		//Generic 매개변수 T,V 생성 -> Generic 메소드(makeRectangle) 생성 -> Generic 메소드의 매개변수로 Point<T,V) 사용 
		double left = ((Number)p1.getX()).doubleValue(); //반환값(Generic)을 Number클래스의 doubleValue를 통해 double로 형변환
		double right = ((Number)p2.getX()).doubleValue(); //반환값(Generic)을 Number클래스의 doubleValue를 통해 double로 형변환
		double top = ((Number)p1.getY()).doubleValue(); //반환값(Generic)을 Number클래스의 doubleValue를 통해 double로 형변환
		double bottom = ((Number)p2.getY()).doubleValue(); //반환값(Generic)을 Number클래스의 doubleValue를 통해 double로 형변환
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);//Point p1을 생성하며 Generic 매개변수를 각각 Integer, Double 타입으로 선언 및 생성(new)
		Point<Integer, Double> p2 = new Point<>(10,10.0); //Point p2 선언시 매개변수를 지정해였기 때문에 생성(new)시에는 타입 생략 가능
	
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1,p2);//p1,p2가 Generic객체 이기 때문에 <Integer, Double> 생략 가능
		//rect는 GenericMethod를 호출 ->  Integer,Double 자료형을 사용하는 makeRectangle(p1,p2) 이 실행 -> 반환된 결과값을 double로 형변환 -> rect에 반환
		System.out.println(rect);
	}
}
