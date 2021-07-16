package collection.arrayList;

import java.util.ArrayList;

class MyStack{//stack => Last In First Out
	private ArrayList<String> arrayStack = new ArrayList<String>();
	//Arralist 선언 및 생성
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // 배열의 갯수 확인
		if(len==0) { //배열 갯수 = 0 일 경우
			System.out.println("베열이 비어 있습니다.");
			return null;
		}
		return(arrayStack.remove(len-1)); //크기-1 = 마지막 Index를 삭제 후 반환
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop()); // 3
		System.out.println(stack.pop()); // 2
		System.out.println(stack.pop()); // 1
		System.out.println(stack.pop()); // 0
	}
}
