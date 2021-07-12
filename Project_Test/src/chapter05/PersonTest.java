package chapter05;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Person james = new Person();
		Scanner scan = new Scanner(System.in);
		System.out.println("나이 -> 이름 -> 결혼여부 -> 자식 수를 순서대로 입력하시오");
		james.age = scan.nextInt();
		james.name = scan.next();
		james.married = scan.nextBoolean();
		james.child = scan.nextInt();
		
		System.out.println("나이: " + james.age +" 이름: " +james.name + " 결혼여부: "+ james.married +" 자식 수: "+james.child);
		

	}

}
