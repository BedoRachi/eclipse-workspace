package chapter05;

import java.util.Scanner;


public class Rectangle {
	public int width;
	public int height;
	
	public int getArea() {
		return width+height;
	}
	
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		rect.height= scanner.nextInt();
		rect.width= scanner.nextInt();
		System.out.println(rect.getArea());
		
	}
	
}
