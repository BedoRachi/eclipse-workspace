package coperation;

import java.util.Scanner;

public class EditStudent {
	
	Scanner scan = new Scanner(System.in);
	String name;
	int grade;
	int money;
	Student student;
	
	
	public EditStudent(String name) {
		this.name = name;
		System.out.print(name + " 학생의 학년을 입력하시오 ");
		grade = scan.nextInt();
		System.out.print(name + " 학생의 소지금을 입력하시오 ");
		money = scan.nextInt();
		
		student = new Student(this.name, grade, money);
	}

}
