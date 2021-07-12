package Weakly_Test1;

import java.util.Scanner;
import java.util.ArrayList;

public class Q14_Test_LYJ {

	public Scanner scan = new Scanner(System.in);

	public ArrayList<Q14_LYJ> Input() {
		ArrayList<Q14_LYJ> strArray = new ArrayList<Q14_LYJ>();
		String course, score;

		// ������ ���� �Էº�
		while (true) {
			System.out.println("������ ������ �Է��ϼ���(�׸� �Է½� �Է� ����)");
			course = scan.next();
			score = scan.next();
			if (score.equals("�׸�") || course.equals("�׸�")) {
				System.out.println("�Է� �����ϰڽ��ϴ�.");
				break;
			} else if (score.equals(null) && course.equals(null)) {
				System.out.println("�����Դϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			strArray.add(new Q14_LYJ(course, score));
		}
		return strArray;
	}

	public void Output(ArrayList<Q14_LYJ> strArray) {

		while (true) {
			int count = 0;
			String name;
			System.out.print("���� �̸�(�׸� �Է½� ��� ����)>> ");
			name = scan.nextLine();
			if (name.equals("�׸�")) {
				System.out.println("��� �����ϰڽ��ϴ�.");
				break;
			} else if (name.equals(null)) {
				System.out.println("�����Դϴ�. �ٽ� �Է��ϼ���");
				continue;
			}
			for (int i = 0; i < strArray.size(); i++) {
				if (strArray.get(i).getCourseName().equals(name)) {
					System.out.println(strArray.get(i).getCourseName() + " �� ������: " + strArray.get(i).getScoreInt());
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("���� ���� �Դϴ�.");
			}

		}

	}
}
