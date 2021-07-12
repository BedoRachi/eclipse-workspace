package array;

import java.util.ArrayList;

public class BookArrayListTest {

	public static void main(String[] args) {
		Book[] lib = new Book[5];

		lib[0] = new Book("�¹�", "���");
		lib[1] = new Book("����", "��");
		lib[2] = new Book("�", "��");
		lib[3] = new Book("��", "��");
		lib[4] = new Book("�", "����");

		for (int i = 0; i < lib.length; i++) {
			lib[i].showBookInfo();
			System.out.println(lib[i]);
		}

		/*
		 * ArrayList�� ���� ����
		 * ArrayList<Book> lib1 = new ArrayList<Book>(); //��ü Ÿ���� �迭�� ����(Stack ����)+�޸�
		 * ���� Ȯ��(Heap ����) 
		 * lib1.add(new Book("�¹�", "���")); 
		 * lib1.add(new Book("����","��"));
		 * lib1.add(new Book("�", "��")); 
		 * lib1.add(new Book("��", "��")); 
		 * lib1.add(new Book("�", "����"));
		 * 
		 * 
		 * 
		 * #############################################################################
		 * For��
		 * for(int i=0; i<lib1.size(); i++) { 
		 * Book book = lib1.get(i); 
		 * book.showBookInfo(); 
		 * }
		 * //lib1���� i��° ���� ������ book�� ���� �� book�� ���� ����Ѵ�. 
		 * #############################################################################
		 * 
		 * #############################################################################
		 * Enhanced For��
		 * for(Book book : lib1) {
		 * book.showBookInfo(); 
		 * } 
		 * //lib1���� 0������ ���������� book�� �ҷ��� showBookInfo() ���
		 * #############################################################################
		 */		
		/*
		 * ����� 
		 * å�̸�: �¹� ����: ��� 
		 * å�̸�: ���� ����: �� 
		 * å�̸�: � ����: �� 
		 * å�̸�: �� ����: �� 
		 * å�̸�: � ����: ����
		 */
		
		
		

	}

}
