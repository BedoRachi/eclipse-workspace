package collection.arrayList;

import java.util.ArrayList;

class MyStack{//stack => Last In First Out
	private ArrayList<String> arrayStack = new ArrayList<String>();
	//Arralist ���� �� ����
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size(); // �迭�� ���� Ȯ��
		if(len==0) { //�迭 ���� = 0 �� ���
			System.out.println("������ ��� �ֽ��ϴ�.");
			return null;
		}
		return(arrayStack.remove(len-1)); //ũ��-1 = ������ Index�� ���� �� ��ȯ
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
