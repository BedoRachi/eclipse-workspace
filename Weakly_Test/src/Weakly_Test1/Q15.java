package Weakly_Test1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		String str[] = { "����", "����", "��" };
		Scanner scan = new Scanner(System.in);
		String user;

		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {//���� �ݺ�
			System.out.print("���� ���� ��! >>  ");
			user = scan.nextLine();
			int i = (int)(Math.random()*3); //������ ������ �Է�(0=����, 1=����, 2=��)
			
			//��ǻ�Ϳ� ����� �Է°��� ���Ͽ� ���
			if (user.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			} else if (str[i].equals(user)) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " �����ϴ�.");
			} else if (user.equals("����") && str[i].equals("����")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �����ϴ�.");
			} else if (user.equals("����") && str[i].equals("��")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
			} else if (user.equals("����") && str[i].equals("����")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
			} else if (user.equals("����") && str[i].equals("��")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �����ϴ�.");
			} else if (user.equals("��") && str[i].equals("����")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �����ϴ�.");
			} else if (user.equals("��") && str[i].equals("����")) {
				System.out.println("����� = " + user + " , ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
			} else {
				System.out.println("����,����,�� �߿��� �Է����ּ���");
			}
			

		}

	}

}
