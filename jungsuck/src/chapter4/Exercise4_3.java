package chapter4;

public class Exercise4_3 {

	public static void main(String[] args) {
		int sum=0;
		int total=0;
		for(int i=1;i<=11;i++) {
			System.out.println(sum);
			sum +=i;
			total +=sum;
		}
		System.out.println(total);
	}

}
