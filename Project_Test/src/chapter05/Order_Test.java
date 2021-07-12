package chapter05;

import java.util.Scanner;

public class Order_Test {

	public static void main(String[] args) {

		long num;
		String id, day, name, serial, post;

		Scanner scan = new Scanner(System.in); //  
		Order order = new Order();

		System.out.println("주문번호, 아이디, 날짜, 이름, 상품번호, 배송주소를 순차적으로 입력하시오");
		order.SetOrderNum(scan.nextLong());
		order.SetOrderID(scan.next());
		order.SetOrderDay(scan.next());
		order.SetOrderName(scan.next());
		order.SetOrderSerial(scan.next());
		order.SetOrderPost(scan.next());

		num = order.GetOrderNum();
		id = order.GetOrderID();
		day = order.GetOrderDay();
		name = order.GetOrderName();
		serial = order.GetOrderSerial();
		post = order.GetOrderPost();

		System.out.print("주문번호: " + num + " 아이디: " + id + " 날짜: " + day + " 이름: " + name + " 상품번호: " + serial
				+ " 배송주소: " + post);

	}

}
