package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>(); //hashset ���� �� ����
		hashSet.add(new String("������"));//HashSet Class�� add Method ȣ��
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������")); //�ߺ�������
		//�ߺ������� ó���� ������ ������ String Class�� hashCode ó���� �̹� �����Ǿ� �ֱ� �����̴�.
		
		System.out.println(hashSet);
		
	}
	
}

