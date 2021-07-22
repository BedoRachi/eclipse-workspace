package exception;
//try-catch-finally �� ���(try-catch�� �񱳿�)
import java.io.FileInputStream; //���� Read Stream �ҷ���
import java.io.FileNotFoundException; //File �� ���� ��� ����ó�� �ҷ���
import java.io.IOException; //IO�� ���� ��� ����ó�� �ҷ���

public class ExceptionHandling3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) { //file not found Error�� ���� ����ó��
			System.out.println(e);
			return;
			
		} finally { //Error �߻����� ������� ������ ����
			if(fis != null) { // File�� Read�Ͽ��� ��
				try {
					fis.close(); //file read Stream close
				} catch (IOException e){ //stream close Error ���� ����ó��
					e.printStackTrace(); // Error�� �߻��� Ư�� Stream�� ����ô�Ͽ� ����Ѵ�..
				}
			}
			System.out.println("�׻� ����");
		}
		System.out.println("���⵵ ����");
	}
}
