package Weakly_Test1;

public class Q14_LYJ {

	String courseName, scoreInt;

	public Q14_LYJ(String name, String score) {//객체 배열 생성시 값을 자동으로 입력받게 함
		this.courseName = name;
		this.scoreInt = score;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getScoreInt() {
		return scoreInt;
	}

	public void setScoreInt(String scoreInt) {
		this.scoreInt = scoreInt;
	}
}
