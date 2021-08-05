package Weakly_Test1;

public class Main {
	public static void main(String[] args) {

	}

	static int count(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n < 100) {
				count++;
			}
			int preNum = 0;
			int preGap = 0;
			while (n != 0) {
				preNum = n%10;
				if(preGap <=0) {
					preGap +=preNum;
				} else {
					preGap -=preNum;
				}
				n/=10;
			}
		}

		return count;
	}
}