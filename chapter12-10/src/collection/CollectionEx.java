package collection;

import java.util.*;

public class CollectionEx {

	static void printList(LinkedList<String> PL) { //LinkedList�� �Ű������� �޴� Class method
		Iterator<String> iterator = PL.iterator();
		while(iterator.hasNext()) {//��ü ���� ����
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->"; //����ĭ�� ���� ���
			} else {
				separator = "\n"; //������ĭ�� ���
			}
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ");
		
		Collections.sort(myList);//Static Method(Collections)���� Sort�� ȣ���Ͽ� ��� ������
		printList(myList);
		
		Collections.reverse(myList); //���� ����
		printList(myList);
		
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ") +1; //����Ž��Ʈ���� ���� myList���� "�ƹ�Ÿ" �˻� �� ������(+1)
		System.out.println("������: " + index);
	}

}
