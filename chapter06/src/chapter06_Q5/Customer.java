package chapter06_Q5;

import java.util.Scanner;

public class Customer {
	
	Scanner scan = new Scanner(System.in);
	String name;
	int money;
	
	public Customer(String name) {
		this.name = name;
		System.out.print(name + " 소지금을 입력하시오 ");
		this.money = scan.nextInt();
	}
	
	public void takeAmericano(Cafe cafe) {
		cafe.amricano(2000);
		this.money -= 2000;
	}
	public void takeRatte(Cafe cafe) {
		cafe.ratte(3000);
		this.money -= 3000;
	}
	public void showCustomerInfo() {
		System.out.println("고객명: " + name + " 현재 잔액: "+ money);
	}

}
