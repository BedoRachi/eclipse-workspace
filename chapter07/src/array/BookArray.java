package array;

public class BookArray {
//Object�� �迭�� ���
	public static void main(String[] args) {
		
		Book[] lib = new Book[5]; //�迭�� ����
		
		lib[0] = new Book("�¹�", "���"); // �迭�� �����͸� ����
		lib[1] = new Book("����", "��");
		lib[2] = new Book("�", "��");
		lib[3] = new Book("��", "��");
		lib[4] = new Book("�", "����");
		
		for(int i=0; i<lib.length; i++) {
			lib[i].showBookInfo(); //Ư�� Array�� Object���� Method�� ���� -> ���
			System.out.println(lib[i]); //Array�� ����� ��� �ش� Array�� ����� "��ǥ��"�� ���
		}
	}
}
/*
 * ����� 
 * å�̸�: �¹� ����: ��� 
 * array.Book@7de26db8 
 * å�̸�: ���� ����: �� 
 * array.Book@1175e2db 
 * å�̸�: � ����: �� 
 * array.Book@36aa7bc2 
 * å�̸�: ��  ����: �� 
 * array.Book@76ccd017 
 * å�̸�: � ����: ����
 * array.Book@182decdb
 */