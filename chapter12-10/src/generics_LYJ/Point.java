package generics_LYJ;

public class Point<T, V> {//Generic �Ű����� T,V ������ Generic Ŭ����(�Ű������� � ��(int, float, double)������ �˼� ���� ����)
	T x; //T=x ����
	V y; //V=y ����
	
	Point(T x, V y){ //Pointer Class ����� �Է°� 2���� Generic���� ����
		this.x = x;
		this.y = y;
	}
	
	public T getX() { //Generic ���� ��ȯ
		return x;
	}
	
	public V getY() {
		return y;
	}
	
	
}
