package stream;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{
	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] greetings = {"�ȳ��ϼ���~~~", "hello", "Good moring", "�ݰ����ϴ�.~~~"};
		System.out.println(Arrays.stream(greetings).reduce(" ", (s1, s2) -> { // greetings �迭�� reduce�ϴµ� �ʱⰪ X / s1, s2 ������ ����Ѵ�.
			if(s1.getBytes().length >= s2.getBytes().length) //s1�� byte ũ�Ⱑ s2���� ũ�ų� ���� ��� s1 ��ȯ / �ƴҰ�� s2��ȯ
				return s1;
			else return s2;}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		}
	}

