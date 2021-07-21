package chapter4;

public class Exercise4_10 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		int strInt = Integer.parseInt(str);
		sum+=strInt/10000;
		sum+=strInt%10000/1000;
		sum+=strInt%10000%1000/100;
		sum+=strInt%10000%1000%100/10;
		sum+=strInt%10000%1000%100%10;
		System.out.println(sum);

	}

}
