package array;

public class ObjectCopy3 {
	//�迭 array ���� �׽�Ʈ(���� ����)
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3]; //�����迭
		Book[] bookArray2 = new Book[3]; //���迭
		
		bookArray1[0] = new Book("�¹���", "������"); //�����迭 �� �Է�
		bookArray1[1] = new Book("�����", "�����㺣��");
		bookArray1[2] = new Book("�����ϱ�", "�̼���");
		
		bookArray2[0] = new Book(null, null); //���迭 �ʱ�ȭ
		bookArray2[1] = new Book(null, null);
		bookArray2[2] = new Book(null, null);
		
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookAutor(bookArray1[i].getBookAutor()); //i�� �����迭�� ���� i�� ���迭�� ����
			bookArray2[i].setBookName(bookArray1[i].getBookName()); //i�� �����迭�� ���� i�� ���迭�� ����
		}
		
		bookArray1[0].setBookName("NAME"); // �����迭�� 0��° ��ü�� ���� ����
		bookArray1[0].setBookAutor("AUTOR"); // �����迭�� 0���� ��ü�� ���� ����
		bookArray1[0].showBookInfo();
		
		for(int i=0; i<bookArray2.length;i++){
			bookArray2[i].showBookInfo(); //i�� ���� ���迭�� ���� ���
			System.out.println(bookArray1[i]); // ���� �迭 �ּҰ� Ȯ��
			System.out.println(bookArray2[i]); // ���� �迭 �ּҰ� Ȯ��
		}
		
	}
}

/*
 * �����
 * å�̸�: NAME ����: AUTOR
 * å�̸�: �¹��� ����: ������
 * array.Book@7de26db8
 * array.Book@1175e2db
 * å�̸�: ����� ����: �����㺣��
 * array.Book@36aa7bc2
 * array.Book@76ccd017
 * å�̸�: �����ϱ� ����: �̼���
 * array.Book@182decdb
 * array.Book@26f0a63f

 */
