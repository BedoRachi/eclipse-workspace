package exam;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		String str[] = { "����", "����", "��" }; //��ǻ�Ͱ� �� �� �ִ� ���
		Scanner scan = new Scanner(System.in); // �Է°� �޴¿� 
		String user;
		int i;
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		do { //1�� �ݺ���(true)
			System.out.println("���� ���� ��! >> ");
			user = scan.next();//������� �Է°��� �޾Ƽ� ����
			if(user.equals("�׸�")) { //�׸��� �Էµ� ���
				break; //1�� �ݺ��� ����
			}
			i = (int)(Math.random()*3); //��ǻ���� ���� �������� ����(0 = ����, 1 = ����, 2 = ��)
			if(user.equals("����")) {
				if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " �����ϴ�.");
					continue;
				} else if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ��ǻ�Ͱ� �̰���ϴ�.");
					continue;
				}else if(str[i].equals("��")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
					continue;
				}
			}
			if(user.equals("����")) {
				if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
					continue;
				} else if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " �����ϴ�.");
					continue;
				}else if(str[i].equals("��")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ��ǻ�Ͱ� �̰���ϴ�.");
					continue;
				}
			}
			if(user.equals("��")) {
				if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ��ǻ�Ͱ� �̰���ϴ�.");
					continue;
				} else if(str[i].equals("����")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " ����ڰ� �̰���ϴ�.");
					continue;
				}else if(str[i].equals("��")){
					System.out.println("����� = " + user + ", ��ǻ�� = " + str[i] + " �����ϴ�.");
					continue;
				}
			}
		}while(true);
		System.out.println("������ �����մϴ�.");

	}

}
