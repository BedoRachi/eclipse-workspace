package chapter5;

import java.util.Scanner;

public class Exercise5_13 {
	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray();
			int r=0;
			char tmp = ' ';
			for(int j=0; j<question.length; j++) {
				r = (int) (Math.random()*question.length);
				tmp = question[j];
				question[j] = question[r];
				question[r] = tmp;
			}
			for(int j=0; j<question.length; j++) {
				System.out.print(question[j]);
			}
			System.out.print(" ������ �Է��ϼ���: ");
			String answer = scanner.nextLine();
			if (words[i].equals(answer.trim()))
				System.out.println("�¾ҽ��ϴ�.");
			else
				System.out.println("Ʋ�Ƚ��ϴ�.");
		}

	}

}
