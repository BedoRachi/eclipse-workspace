package chapter6;

public class Student {
	
	String name;
	int ban, no ,kor, eng, math;
	
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {

		return (getTotal()/3f*10+0.5f)/10f;
		
	}
	
	public String info() {
		
		return name+", "+ no +", "+ kor +", "+ eng +", "+ math +", "+ getTotal() +", "+ getAverage();
	}

}
