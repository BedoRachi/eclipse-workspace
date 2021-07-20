package collection.arrayList;
//ArrayList�� ���� Stack ����(Last In First Out)
import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	private int len;
	public void push(String data) { //Stack�� String data�Է�(�ڿ��� ���� �����)
		arrayStack.add(data);
	}
	
	public String pop() {
		len  = arrayStack.size(); //Stack ��ü ũ�� Ȯ��
		if(len == 0) { // Stack�� data ���� ��
			return "Data�� �����ϴ�.";
		} else {
			return arrayStack.remove(len-1); //�ڿ������� remove �� data��ȯ
		}
	}
	
	public void showAllStack() {
		len = arrayStack.size(); //Stack ��ü ũ�� Ȯ��
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
