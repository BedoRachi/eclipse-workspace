package classex_LYJ;
//java.lang.reflect�� ��ü�� ���� Ŭ���������� �м� �� �����ε� �� �� ����Ѵ�.(��. public ������ �ҷ��� �� �ִ�)
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");//java.lang.String�� Ŭ���� ������ strClass�� ����

		System.out.println("######################################");
		System.out.println("StringŬ������ Constructors(������) ����Ʈ ���");
		Constructor[] cons = strClass.getConstructors();//��ü�� Ŭ���������� �����ڸ� �����Ͽ� �迭�� ����
		for(Constructor c : cons) { //��ü�� Ŭ���������� ������������ ���(�� Public�� ����)
			System.out.println(c); 
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("StringŬ������ Fields(����) ����Ʈ ���");
		Field[] field = strClass.getFields();//��ü�� Ŭ���������� ������ �����Ͽ� �迭�� ����
		for(Field f : field) { //��ü�� Ŭ���������� ���������� ���(�� Public�� ����)
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("StringŬ������ Methods(�޼ҵ�) ����Ʈ ���");
		Method[] method = strClass.getMethods();//��ü�� Ŭ���������� �޼ҵ带 �����Ͽ� �迭�� ����
		for(Method m : method) { //��ü�� Ŭ���������� �޼ҵ������� ���(�� Public�� ����)
			System.out.println(m);
		}
		System.out.println("######################################");
		
	}
}
