package exception;
//try-catch�� ���(finally�� �񱳿�)
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHanding {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
			
		}catch (FileNotFoundException e) { //file not found Error�� ���� ����ó��
			System.out.println(e);
		}
		System.out.println("���⵵ ����");
	}
}
