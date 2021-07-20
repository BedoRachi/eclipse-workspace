package collection;
//Stack�� First In Last Out�̴�.
//Stack�� �Ű������� Generic�̱� ������ �ϳ��� ���� �޼ҵ�(GStack)���� String ~ Integer ����� �����ϴ�.
class GStack<T> { //Generic ���� T ����
	int tos;
	Object[] stck; //Object �迭 ����

	public GStack() {
		tos = 0; //���� ���� Ȯ�ο�
		stck = new Object[10]; //�迭 10�� ����
	}

	public void push(T item) { //�Ű������� Generic���� item�� ����
		if (tos == 10) { //������ Full�̸�
			return; // ���� X
		} else { //������ Full�� �ƴϸ�
		stck[tos] = item; // item�� tos��° ���ÿ� ����
		tos++; //���� ĭ 1 ����
		}
	}

	public T pop() {
		if (tos == 0) { //������ Null ���¶��
			return null; //��ȯ X
		} else {
		tos--; //���� ĭ 1 ����
		return (T) stck[tos]; //Generic���� ������ value�� ��ȯ
		}
	}
}

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); //���� ����(Generic -> String)
		stringStack.push("seoul"); //���� ����
		stringStack.push("busan");
		stringStack.push("LA");
		for (int n = 0; n < 3; n++) { //3�� �ݺ��Ͽ�
			System.out.println(stringStack.pop()); //���� �ҷ�����
		}
		GStack<Integer> intStack = new GStack<Integer>();  //���� ����(Generic -> Integer)
		intStack.push(1);  //���� ����
		intStack.push(3);
		intStack.push(5);
		for (int n = 0; n < 3; n++) { //3�� �ݺ��Ͽ�
			System.out.println(intStack.pop());  //���� �ҷ�����
		}
	}
}