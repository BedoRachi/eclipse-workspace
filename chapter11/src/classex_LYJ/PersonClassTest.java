package classex_LYJ;
//java.lang.reflect�� ��ü�� ���� Ŭ���������� �м� �� �����ε� �� �� ����Ѵ�.
//�����ε��̶� ���α׷� ������ ȣȯ���� ���� ��� ���̺귯�� �Ǵ� ����̹��� ȣ���ϴ� ��� reflect�� ���� �ε��� �ʿ��� ���̺귯�� �Ǵ� ����̹� ������ �����Ͽ�
//�ʿ��� ���̺귯��, ����̹��� ȣ���ϴ� ����̴�.(ȿ������ �ڿ� Ȱ�� �� ����ȭ)
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest extends Person{
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("classex_LYJ.Person");//java.lang.String�� ������ strClass�� ����

		System.out.println("######################################");
		System.out.println("PersonŬ������ Constructors(������) ����Ʈ ���");
		Constructor[] cons = strClass.getConstructors();//��ü�� Ŭ���������� �����ڸ� �����Ͽ� �迭�� ����
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("PersonŬ������ Fields(����) ����Ʈ ���");
		Field[] field = strClass.getFields();//��ü�� Ŭ���������� ������ �����Ͽ� �迭�� ����
		for(Field f : field) {
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("PersonŬ������ Methods(�޼ҵ�) ����Ʈ ���");
		Method[] method = strClass.getMethods();//��ü�� Ŭ���������� �޼ҵ带 �����Ͽ� �迭�� ����
		for(Method m : method) {
			System.out.println(m);
		}
		System.out.println("######################################");
		
	}
}
