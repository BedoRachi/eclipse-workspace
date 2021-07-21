package chapter4;

public class Exercise4_4 {

	public static void main(String[] args) {
		int sum=0;
		int end=0;
		for(int i=0; sum<100; i++) {
			if(i%2!=0) {
				sum+=i;
			}
			if(i%2==0) {
				sum-=i;
			}
			end=i;
		}
		System.out.println("i가 " + end + " 일때 100보다 크다.");
	}

}
