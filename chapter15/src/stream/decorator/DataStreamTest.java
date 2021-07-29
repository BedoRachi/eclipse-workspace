package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt"); //�� ��Ʈ��(byte ��Ʈ���̶� Ȯ�强, ������� ���� ������)
			DataOutputStream dos = new DataOutputStream(fos)) { //���� ��Ʈ��(�� ��Ʈ���� �����Ͽ� Ȯ�强, ������ �߰���)
			//������ ���� �����Ͱ� ���̳ʸ� �������� ����Ǳ� ������ �Ϲ����� ������δ� ������ Ȯ�� �� �� ����
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("data.txt");  //�� ��Ʈ��(byte ��Ʈ���̶� Ȯ�强, ������� ���� ������)
			DataInputStream dis = new DataInputStream(fis)){ //���� ��Ʈ��(�� ��Ʈ���� �����Ͽ� Ȯ�强, ������ �߰���)
			//���̳ʸ��� �� ������ �о���� ������ ������ Ÿ�԰� ������ ������� �ҷ��;� �Ѵ�.
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
