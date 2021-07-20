package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException { //���� ó���� ���� Ŭ������ �̷�(throws declaration)
		ThrowsException test = new ThrowsException();
		test.loadClass("a.txt", "java.lang.String");
		/*    try-catch�� ���� �� �׸�� ����ó���� �� //Surround with try/catch
		 * try { 
		 * test.loadClass("a.txt", "java.lang.String"); 
		 * } catch (FileNotFoundException e) { 
		 * e.printStackTrace(); 
		 * } catch(ClassNotFoundException e) { 
		 * e.printStackTrace(); 
		 * }
		 * 
		 */		
		 /*   Multi try-catch�� ���� �׸��� ��� ����ó���� �� //Surround with try/multi-catch
		 * try { test.loadClass("a.txt" , "java.lang.String"); 
		 * } catch(FileNotFoundException | ClassNotFoundException e) { 
		 * e.printStackTrace(); 
		 * }
		 */
	}
}
