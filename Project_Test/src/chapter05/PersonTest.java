package chapter05;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person james = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� -> �̸� -> ��ȥ���� -> �ڽ� ���� ������� �Է��Ͻÿ�");
		james.age = scan.nextInt();
		james.name = scan.next();
		james.married = scan.nextBoolean();
		james.child = scan.nextInt();
		
		System.out.println("����: " + james.age +" �̸�: " +james.name + " ��ȥ����: "+ james.married +" �ڽ� ��: "+james.child);
		

	}

}
