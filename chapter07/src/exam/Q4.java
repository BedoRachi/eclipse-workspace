package exam;

public class Q4 {

	public static void main(String[] args){
		int lineCount;
		int starCount;
		
		for(lineCount=0; lineCount<4; lineCount++) { // �� 4���� ������ ����ϸ�(0,1,2,3)
			for(starCount=0; starCount<=lineCount;starCount++) { //Line �� star�� ���Ͽ� ���� �����(0<=0, 0<=1, 0<=0, 0<=1, 0<=2....3<=3)
				System.out.print('*');
			}
			System.out.println("");
		}
	}
}

/*
 * �����
 *
 **
 ***
 ****
 */
