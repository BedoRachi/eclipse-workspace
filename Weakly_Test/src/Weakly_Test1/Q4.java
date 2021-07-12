package Weakly_Test1;

public class Q4 {

	public static void main(String[] args) {
		String array[][] = new String[4][]; //비정방형 배열 생성
		int count=1;
		for (int i=0; i<array.length;i++) {
			for(int j=0; j<count;j++) {
				array[i] = new String[count];
				array[i][j]="*";
				System.out.print(array[i][j]);
			}
			System.out.println();
			count++;
		}
	}
}
