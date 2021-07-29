package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{//직렬화를 위해 상속 받음
	private static final long serialVersionUID = 6412276319311846923L;
	//private static final long serialVersionUID = -1503252402544036183L; //UID: Class의 고유값으로 Class의 변경사항 발생시에만 변경된다.
	String name;
	transient String job; //직렬화 제외하고 싶은 대상을 지정(출력시 Null)
	
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
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out"); //직렬화
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn); //Class를 직렬화
			oos.writeObject(personKim); //Class를 직렬화
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out"); //역직렬화
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			Person p1 = (Person)ois.readObject();//파일에서 Person으로 불러옴
			Person p2 = (Person)ois.readObject();//파일에서 Person으로 불러옴
			System.out.println(p1);
			System.out.println(p2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
