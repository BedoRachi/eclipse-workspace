package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {
		System.out.println("���ĺ��� �Է��Ͻÿ�");
		int i;
		try {
			while ((i = System.in.read()) != -1) {//�Է¹��� ���ڸ� i�� ������ i�� -1�� �ƴҰ� ��
				System.out.print((char) i);//i�� ���� ����Ѵ�.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
