package chapter04;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력하시오");
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
				"이름: " + name + " 도시: " + city + " 나이: " + printAge + " 체중 " + printWeight + " 독신: " + printSingle);

	}

}
