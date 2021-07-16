package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>(); //LinkedList�� String �ڷ������� ����
		
		myList.add("A"); //���߰�
		myList.add("B");
		myList.add("C");
		System.out.println(myList);
		
		myList.add(1, "D"); //1�� �ڸ��� D�� ����(B->D)
		System.out.println(myList);
		
		myList.addFirst("0"); // �� �� �ڸ��� 0 �߰�
		System.out.println(myList);
		
		System.out.println(myList.removeLast()); //�� ������ �ڸ��� ���� �� ��ȯ
		System.out.println(myList);
	}

}
