package Weakly_Test1;

import java.util.Scanner;
import java.util.ArrayList;

public class Q14_Test_LYJ {

	public Scanner scan = new Scanner(System.in);

	public ArrayList<Q14_LYJ> Input() {
		ArrayList<Q14_LYJ> strArray = new ArrayList<Q14_LYJ>();
		String course, score;

		// 과목명과 점수 입력부
		while (true) {
			System.out.println("과목명과 점수를 입력하세요(그만 입력시 입력 종료)");
			course = scan.next();
			score = scan.next();
			if (score.equals("그만") || course.equals("그만")) {
				System.out.println("입력 종료하겠습니다.");
				break;
			} else if (score.equals(null) && course.equals(null)) {
				System.out.println("공란입니다. 다시 입력하세요");
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
			System.out.print("과목 이름(그만 입력시 출력 종료)>> ");
			name = scan.nextLine();
			if (name.equals("그만")) {
				System.out.println("출력 종료하겠습니다.");
				break;
			} else if (name.equals(null)) {
				System.out.println("공란입니다. 다시 입력하세요");
				continue;
			}
			for (int i = 0; i < strArray.size(); i++) {
				if (strArray.get(i).getCourseName().equals(name)) {
					System.out.println(strArray.get(i).getCourseName() + " 의 점수는: " + strArray.get(i).getScoreInt());
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("없는 과목 입니다.");
			}

		}

	}
}
