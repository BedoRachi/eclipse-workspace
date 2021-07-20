package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException { //예외 처리를 상위 클래스로 미룸(throws declaration)
		ThrowsException test = new ThrowsException();
		test.loadClass("a.txt", "java.lang.String");
		/*    try-catch를 통해 각 항목당 예외처리름 함 //Surround with try/catch
		 * try { 
		 * test.loadClass("a.txt", "java.lang.String"); 
		 * } catch (FileNotFoundException e) { 
		 * e.printStackTrace(); 
		 * } catch(ClassNotFoundException e) { 
		 * e.printStackTrace(); 
		 * }
		 * 
		 */		
		 /*   Multi try-catch를 통해 항목을 묶어서 예외처리름 함 //Surround with try/multi-catch
		 * try { test.loadClass("a.txt" , "java.lang.String"); 
		 * } catch(FileNotFoundException | ClassNotFoundException e) { 
		 * e.printStackTrace(); 
		 * }
		 */
	}
}
