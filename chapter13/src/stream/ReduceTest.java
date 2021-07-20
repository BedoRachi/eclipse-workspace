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
		String[] greetings = {"안녕하세요~~~", "hello", "Good moring", "반갑습니다.~~~"};
		System.out.println(Arrays.stream(greetings).reduce(" ", (s1, s2) -> { // greetings 배열을 reduce하는데 초기값 X / s1, s2 변수를 사용한다.
			if(s1.getBytes().length >= s2.getBytes().length) //s1의 byte 크기가 s2보다 크거나 같을 경우 s1 반환 / 아닐경우 s2반환
				return s1;
			else return s2;}));
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		}
	}

