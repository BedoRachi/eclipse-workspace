package collection.arrayList;
//ArrayList를 통한 Stack 구현(Last In First Out)
import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	private int len;
	public void push(String data) { //Stack에 String data입력(뒤에서 부터 저장됨)
		arrayStack.add(data);
	}
	
	public String pop() {
		len  = arrayStack.size(); //Stack 전체 크기 확인
		if(len == 0) { // Stack에 data 없을 때
			return "Data가 없습니다.";
		} else {
			return arrayStack.remove(len-1); //뒤에서부터 remove 후 data반환
		}
	}
	
	public void showAllStack() {
		len = arrayStack.size(); //Stack 전체 크기 확인
		if(len != 0 ) {
			for(String str : arrayStack) {
				System.out.println(str);
			}
		}
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.showAllStack();
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
	}
	
}
