package classex_LYJ;
//java.lang.reflect은 객체를 통해 클래스정보를 분석 및 동적로딩 할 때 사용한다.
//동적로딩이란 프로그램 구성시 호환성을 위해 모든 라이브러리 또는 드라이버를 호출하는 대신 reflect를 통해 로딩에 필요한 라이브러리 또는 드라이버 정보를 수집하여
//필요한 라이브러리, 드라이버만 호출하는 기능이다.(효율적인 자원 활용 및 최적화)
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest extends Person{
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class strClass = Class.forName("classex_LYJ.Person");//java.lang.String의 정보를 strClass에 저장

		System.out.println("######################################");
		System.out.println("Person클래스의 Constructors(생성자) 리스트 출력");
		Constructor[] cons = strClass.getConstructors();//객체의 클래스정보중 생성자를 추출하여 배열에 저장
		for(Constructor c : cons) {
			System.out.println(c);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("Person클래스의 Fields(변수) 리스트 출력");
		Field[] field = strClass.getFields();//객체의 클래스정보중 변수를 추출하여 배열에 저장
		for(Field f : field) {
			System.out.println(f);
		}
		System.out.println();
		
		System.out.println("######################################");
		System.out.println("Person클래스의 Methods(메소드) 리스트 출력");
		Method[] method = strClass.getMethods();//객체의 클래스정보중 메소드를 추출하여 배열에 저장
		for(Method m : method) {
			System.out.println(m);
		}
		System.out.println("######################################");
		
	}
}
