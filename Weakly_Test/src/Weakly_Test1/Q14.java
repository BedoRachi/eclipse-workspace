package Weakly_Test1;

public class Q14 {

	String courseName;
	int scoreInt;

	public Q14(String name, int score) {//객체 배열 생성시 값을 자동으로 입력받게 함
		this.courseName = name;
		this.scoreInt = score;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getScoreInt() {
		return scoreInt;
	}

	public void setScoreInt(int scoreInt) {
		this.scoreInt = scoreInt;
	}

}
