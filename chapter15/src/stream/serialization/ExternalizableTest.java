package stream.serialization;

import java.io.*;

class Dog implements Externalizable{ //직렬화할 대상
	String name;
	
	public Dog() {
		
	}
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException{ //직렬화시 어떤 방법으로 저장할 지를 지정
		out.writeUTF(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{ //역질렬화시 어떤 방법으로 불러올지를 지정
		name = in.readUTF();
	}
	
	public String toString() {
		return name;
	}
}

public class ExternalizableTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Dog myDog = new Dog();
		myDog.name = "멍멍이";
		
		FileOutputStream fos = new FileOutputStream("external.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try(fos; oos){ //직렬화
			oos.writeObject(myDog);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog dog = (Dog)ois.readObject(); //역직렬화
		System.out.println(dog);
	}
	
}
