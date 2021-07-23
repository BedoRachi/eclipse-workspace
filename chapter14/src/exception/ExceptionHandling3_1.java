package exception;

import java.io.FileInputStream; //���� Read Stream �ҷ��� + AutoCloseable�� ��� ����
import java.io.IOException; //IO�� ���� ��� ����ó�� �ҷ���

public class ExceptionHandling3_1 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("a.txt")) { //fis��� �ڿ��� ���� �� �Ҵ�

		} catch (IOException e) { // file not found Error�� ���� ����ó��
			System.out.println(e); 
			return;
		}
		System.out.println("���⵵ ����");
	 }//finally�� ������ �ڵ����� close()�� �����

}
