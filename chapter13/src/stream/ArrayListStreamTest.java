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
		
		Stream<String> stream = sList.stream(); //��Ʈ�� ��ü ����(new�� ����)
		//String�� ������ �� �ִ� stream�� ���� �� ArrayList sList�� stream�� ����(�Ҵ�)��
		stream.forEach(s->System.out.println(s + " ")); //��Ʈ�� 
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.println(s));
	}
}
