package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{//����ȭ�� ���� ��� ����
	private static final long serialVersionUID = 6412276319311846923L;
	//private static final long serialVersionUID = -1503252402544036183L; //UID: Class�� ���������� Class�� ������� �߻��ÿ��� ����ȴ�.
	String name;
	transient String job; //����ȭ �����ϰ� ���� ����� ����(��½� Null)
	
	public Person() {
	}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	public String toString() {
		return name + ", " + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException{
		Person personAhn = new Person("�����", "��ǥ�̻�");
		Person personKim = new Person("��ö��", "���̻�");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out"); //����ȭ
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn); //Class�� ����ȭ
			oos.writeObject(personKim); //Class�� ����ȭ
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out"); //������ȭ
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();//���Ͽ��� Person���� �ҷ���
			Person p2 = (Person)ois.readObject();//���Ͽ��� Person���� �ҷ���
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
