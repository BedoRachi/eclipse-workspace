package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {
	public static void main(String[] args) throws IOException {
		System.out.println("���ĺ� �ϳ� ���� Enter�� �Է��Ͻÿ�");
		
		int i;
		try {
			i=System.in.read(); //system.in�� byte������ �Է��� �޴� Input Stream�̸� int�� ��ȯ�Ѵ�.
			System.out.println(i); // �Է°��� int�� ���
			System.out.println((char)i); //�Է°��� char�� ���
			
		}catch(IOException e) {
			e.printStackTrace(); //error�� ���������� ǥ���Ѵ�.
		}
	}

}
