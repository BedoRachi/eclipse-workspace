package stream;

import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum(); //arr�� ����� ��� ���� �ջ���
		int count = (int)Arrays.stream(arr).count();//arr�� �迭�� ������ Int(������ Long)���� ��ȯ
		
		System.out.println(sumVal);
		System.out.println(count);
		
	}

}
