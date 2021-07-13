package classex_LYJ;
//java.lang.reflect은 객체를 통해 클래스정보를 분석 및 동적로딩 할 때 사용한다.(단. public 정보만 불러올 수 있다)
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("java.lang.String");//java.lang.String의 클래스 정보를 strClass에 저장

		System.out.println("######################################");
		System.out.println("String클래스의 Constructors(생성자) 리스트 출력");
		Constructor[] cons = strClass.getConstructors();//객체의 클래스정보중 생성자를 추출하여 배열에 저장
		for(Constructor c : cons) { //객체의 클래스정보중 생성자정보를 출력(단 Public만 보임)
			System.out.println(c); 
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("String클래스의 Fields(변수) 리스트 출력");
		Field[] field = strClass.getFields();//객체의 클래스정보중 변수를 추출하여 배열에 저장
		for(Field f : field) { //객체의 클래스정보중 변수정보를 출력(단 Public만 보임)
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("String클래스의 Methods(메소드) 리스트 출력");
		Method[] method = strClass.getMethods();//객체의 클래스정보중 메소드를 추출하여 배열에 저장
		for(Method m : method) { //객체의 클래스정보중 메소드정보를 출력(단 Public만 보임)
			System.out.println(m);
		}
		System.out.println("######################################");
		
	}
}
