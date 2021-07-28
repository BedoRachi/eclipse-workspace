package stream.others;

import java.io.*;

public class RandomAccessFileTest2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());
		rf.writeUTF("æ»≥Á«œººø‰");
		System.out.println(rf.getFilePointer());
		
		rf.seek(0);
		System.out.println(rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
	
}
