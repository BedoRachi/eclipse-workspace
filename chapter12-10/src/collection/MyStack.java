package collection;
//Stack은 First In Last Out이다.
//Stack의 매개변수가 Generic이기 때문에 하나의 스택 메소드(GStack)으로 String ~ Integer 사용이 가능하다.
class GStack<T> { //Generic 변수 T 선언
	int tos;
	Object[] stck; //Object 배열 선언

	public GStack() {
		tos = 0; //스택 갯수 확인용
		stck = new Object[10]; //배열 10개 생성
	}

	public void push(T item) { //매개변수를 Generic으로 item에 저장
		if (tos == 10) { //스택이 Full이면
			return; // 저장 X
		} else { //스택이 Full이 아니면
		stck[tos] = item; // item을 tos번째 스택에 저장
		tos++; //스택 칸 1 증가
		}
	}

	public T pop() {
		if (tos == 0) { //스택이 Null 상태라면
			return null; //반환 X
		} else {
		tos--; //스택 칸 1 감소
		return (T) stck[tos]; //Generic으로 스택의 value를 반환
		}
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); //스택 생성(Generic -> String)
		stringStack.push("seoul"); //스택 저장
		stringStack.push("busan");
		stringStack.push("LA");
		for (int n = 0; n < 3; n++) { //3번 반복하여
			System.out.println(stringStack.pop()); //스택 불러오기
		}
		GStack<Integer> intStack = new GStack<Integer>();  //스택 생성(Generic -> Integer)
		intStack.push(1);  //스택 저장
		intStack.push(3);
		intStack.push(5);
		for (int n = 0; n < 3; n++) { //3번 반복하여
			System.out.println(intStack.pop());  //스택 불러오기
		}
	}
}