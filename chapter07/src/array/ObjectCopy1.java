package array;

public class ObjectCopy1 {
//�迭 System.arraycopy �׽�Ʈ(���� ����)
	
	public static void main(String[] args) {
		Book[] lib = new Book[5]; // ���� �迭
		Book[] lib2 = new Book[5]; //���� �迭
		
		lib[0] = new Book("�¹�", "���");
		lib[1] = new Book("����", "��");
		lib[2] = new Book("�", "��");
		lib[3] = new Book("��", "��");
		lib[4] = new Book("�", "����");
		System.arraycopy(lib, 0, lib2, 0, 5);//lib�� 0���� 5���� �����Ͽ� lib2 0���� �ٿ��ִ´�.(�� ���� ��ǥ���� ����ȴ�.)
		
		
		for(int i=0; i<4; i++) {//lib�� lib1�� ���� ���� ��µ��� Ȯ��
			lib[i].showBookInfo();
			System.out.println(lib[i]);
			lib2[i].showBookInfo();
			System.out.println(lib2[i]);
		}
		
		System.out.println("##########################");
		lib[0].setBookName("����"); //lib 0���� ���� �����
		lib[0].showBookInfo(); // lib 0���� �� ���� Ȯ��
		lib2[0].showBookInfo(); //lib2 0���� ���� ���� ������� Ȯ��
		//���� ������ ��� ���� ��ǥ�� �����ϱ� ������ ���� ����Ǹ� ������ �迭���� �����
		
	}
}

/*
 * ����� 
 * å�̸�: �¹� ����: ��� 
 * array.Book@7de26db8 
 * å�̸�: �¹� ����: ��� 
 * array.Book@7de26db8
 * å�̸�: ���� ����: �� 
 * array.Book@1175e2db 
 * å�̸�: ���� ����: �� 
 * array.Book@1175e2db 
 * å�̸�: � ����: �� 
 * array.Book@36aa7bc2 
 * å�̸�: � ����: �� 
 * array.Book@36aa7bc2 
 * å�̸�: �� ����: ��
 * array.Book@76ccd017 
 * å�̸�: �� ����: �� 
 * array.Book@76ccd017
 * ##########################
 * å�̸�: ���� ����: ���
 * å�̸�: ���� ����: ���
 */