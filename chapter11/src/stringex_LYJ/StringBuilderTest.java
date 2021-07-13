package stringex_LYJ;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("������ javaStr �ּ�: " + System.identityHashCode(javaStr)); //String�� �ּҰ�
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("������ StringBuilder�� �ּҰ�: "+ System.identityHashCode(buffer)); //StringBuilder�� �ּҰ�
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" is fun");
		javaStr = buffer.toString(); //StringBuilder(buffer) -> String(javaStr)�� ����ȯ(toString)
		System.out.println(javaStr);
		System.out.println("������ javaStr �ּ�: " + System.identityHashCode(javaStr)); //String�� �ּҰ�
		//String�� ��ü������ �������� �Ұ���(�Һ���O) �̱� ������ ��ǥ���� ����
		System.out.println("������ StringBuilder�� �ּҰ�: "+ System.identityHashCode(buffer)); //StringBuilder�� �ּҰ�
		//StringBuilder�� ��ü������ �������� ����(�Һ���X) �̱� ������ ��ǥ���� ������ ����
	}
}
