package array;

import java.util.ArrayList;
//arrayList�� �̿��� char ���
public class CharArray {

	public static void main(String[] args) {
		
		ArrayList alpha = new ArrayList(); // ArrayList ����
		char ch = 'A'; // �Է� �ʱⰪ ����
		
		for(int i=0; i <26;i++, ch++) {
			alpha.add(ch); // ArrayList�� �� �Է�(char�� ���������� �����Ͽ� �Է�)
		}
		
		for(int j=0;j<alpha.size();j++) { //j�� ArrayList�� ũ�⸦ ���Ͽ� �ݺ�
			System.out.print(alpha.get(j)); // ArrayList���� j��° ���� ���
		}
		System.out.println();
		System.out.println("################################");
		for(Object c : alpha) {
			System.out.print(c);
		}
		

	}

}

/*
�����
ABCDEFGHIJKLMNOPQRSTUVWXYZ
################################
ABCDEFGHIJKLMNOPQRSTUVWXYZ
 */