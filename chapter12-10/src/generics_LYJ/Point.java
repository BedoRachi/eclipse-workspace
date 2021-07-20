package generics_LYJ;

public class Point<T, V> {//Generic 매개변수 T,V 가지는 Generic 클래스(매개변수가 어떤 값(int, float, double)인지를 알수 없기 때문)
	T x; //T=x 선언
	V y; //V=y 선언
	
	Point(T x, V y){ //Pointer Class 선언시 입력값 2개를 Generic으로 받음
		this.x = x;
		this.y = y;
	}
	
	public T getX() { //Generic 으로 반환
		return x;
	}
	
	public V getY() {
		return y;
	}
	
	
}
