package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("A");
		sList.add("B");
		sList.add("C");
		
		Stream<String> stream = sList.stream(); //스트림 객체 생성(new와 동일)
		//String을 연산할 수 있는 stream을 선언 후 ArrayList sList을 stream에 저장(할당)함
		stream.forEach(s->System.out.println(s + " ")); //스트림 
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.println(s));
	}
}
