package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataStreamTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("data.txt"); //주 스트림(byte 스트림이라 확장성, 지원언어 등이 부족함)
			DataOutputStream dos = new DataOutputStream(fos)) { //보조 스트림(주 스트림을 보조하여 확장성, 지원언어를 추가함)
			//유의할 점은 데이터가 바이너리 형식으로 저장되기 때문에 일반적인 방법으로는 내용을 확인 할 수 없음
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
		} catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("data.txt");  //주 스트림(byte 스트림이라 확장성, 지원언어 등이 부족함)
			DataInputStream dis = new DataInputStream(fis)){ //보조 스트림(주 스트림을 보조하여 확장성, 지원언어를 추가함)
			//바이너리로 된 파일을 읽어오기 때문에 저장한 타입과 동일한 방법으로 불러와야 한다.
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
