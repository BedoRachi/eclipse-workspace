package stringex_LYJ;

public class StringTest2 {
	//concat�� ���� ���ڿ� ����
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ù ���ڿ��� �ּҰ� "+System.identityHashCode(javaStr)); //���ڿ��� �ּҰ��� ��µȴ�.
		
		javaStr = javaStr.concat(androidStr);//java + android ���ڿ��� ��ģ��=���ο� �޸� �Ҵ� �� ������ ���ڿ��� �����Ѵ�.
		//String�� �Һ��� ������ ������ javaStr�� �� ������ �Ұ�����
		//���ο� javaStr �ּҰ� �Ҵ� �Ϸ� �� ������ �ּҰ��� GC��
		// https://ifuwanna.tistory.com/221
		
		System.out.println(javaStr);
		System.out.println("��ģ ���ڿ��� �ּҰ� "+System.identityHashCode(javaStr)); // ���ڿ��� �������� ������ ���ο� �޸𸮿� �Ҵ�Ǿ��� ������ �ּҰ��� ����ȴ�.
	}

}
