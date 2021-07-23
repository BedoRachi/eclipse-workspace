package chapter6;

public class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		//root(x1-x)^2 + (y1-y)^2
		//return Math.sqrt(Math.pow(Math.abs(x1-x),2) + Math.pow(Math.abs(y1-y), 2));
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); //Memory 측면에서 메소드 호출보단 단순계산이 유리함
		
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));

	}

}
