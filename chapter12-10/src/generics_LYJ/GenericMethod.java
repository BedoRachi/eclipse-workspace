package generics_LYJ;

public class GenericMethod {//�Ϲ� Ŭ���������� Generic �޼ҵ带 ������ ����, �� Generic �޼ҵ忡�� Generic ������ �����������<T,V>

	public static <T, V> double makeRectangle(Point<T,V>p1, Point<T,V>p2) {
		//Generic �Ű����� T,V ���� -> Generic �޼ҵ�(makeRectangle) ���� -> Generic �޼ҵ��� �Ű������� Point<T,V) ��� 
		double left = ((Number)p1.getX()).doubleValue(); //��ȯ��(Generic)�� NumberŬ������ doubleValue�� ���� double�� ����ȯ
		double right = ((Number)p2.getX()).doubleValue(); //��ȯ��(Generic)�� NumberŬ������ doubleValue�� ���� double�� ����ȯ
		double top = ((Number)p1.getY()).doubleValue(); //��ȯ��(Generic)�� NumberŬ������ doubleValue�� ���� double�� ����ȯ
		double bottom = ((Number)p2.getY()).doubleValue(); //��ȯ��(Generic)�� NumberŬ������ doubleValue�� ���� double�� ����ȯ
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
		
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0,0.0);//Point p1�� �����ϸ� Generic �Ű������� ���� Integer, Double Ÿ������ ���� �� ����(new)
		Point<Integer, Double> p2 = new Point<>(10,10.0); //Point p2 ����� �Ű������� �����ؿ��� ������ ����(new)�ÿ��� Ÿ�� ���� ����
	
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1,p2);//p1,p2�� Generic��ü �̱� ������ <Integer, Double> ���� ����
		//rect�� GenericMethod�� ȣ�� ->  Integer,Double �ڷ����� ����ϴ� makeRectangle(p1,p2) �� ���� -> ��ȯ�� ������� double�� ����ȯ -> rect�� ��ȯ
		System.out.println(rect);
	}
}
