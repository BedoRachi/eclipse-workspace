package chapter04;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();
		String city = scanner.nextLine();
		String age = scanner.nextLine();
		int printAge = Integer.parseInt(age);
		String weight = scanner.nextLine();
		double printWeight = Double.parseDouble(weight);
		String single = scanner.nextLine();
		boolean printSingle = Boolean.parseBoolean(single);
		scanner.close();
		System.out.println(
				"�̸�: " + name + " ����: " + city + " ����: " + printAge + " ü�� " + printWeight + " ����: " + printSingle);

	}

}
