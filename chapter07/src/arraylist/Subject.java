package arraylist;

public class Subject {
	
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void showSubjectInfo() {
		System.out.println("과목명: "+name + " 점수: " + score);
	}
	

}
